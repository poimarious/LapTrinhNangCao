#!/bin/bash

# 1. Định nghĩa tên thư viện JUnit 5 (phiên bản Console Standalone)
JUNIT_JAR="junit-platform-console-standalone-1.10.2.jar"
JUNIT_URL="https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/$JUNIT_JAR"

# 2. Tải thư viện tự động nếu trong thư mục chưa có file này
if [ ! -f "$JUNIT_JAR" ]; then
    echo "=> Đang tải thư viện JUnit 5..."
    curl -O -s "$JUNIT_URL"
    echo "=> Tải xong!"
fi

# 3. Tạo thư mục 'build' để chứa các file .class sau khi biên dịch
mkdir -p build

# 4. Biên dịch code (Ép kiểu UTF-8 để không lỗi font tiếng Việt)
echo "=> Đang biên dịch mã nguồn..."
# Lưu ý: Trên Git Bash / Windows, classpath dùng dấu chấm phẩy (;)
javac -encoding UTF-8 -cp ".;$JUNIT_JAR" src/MathUtils.java src/MathUtilsTest.java -d build/

if [ $? -eq 0 ]; then
    echo "=> Biên dịch thành công!"
    echo "---------------------------------------------------"
    
    # 5. Chạy JUnit Test
    java -jar "$JUNIT_JAR" --class-path "build" --scan-class-path
else
    echo "=> Biên dịch thất bại. Vui lòng kiểm tra lại code."
fi