package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // Khởi tạo Logger gắn với class hiện tại
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public void processOrder(String orderId, int quantity) {
        // Sử dụng INFO cho các mốc quan trọng và dấu {} để chèn biến (Parameterized Logging)
        logger.info("Bắt đầu xử lý đơn hàng ID: {}, Số lượng: {}", orderId, quantity);

        try {
            if (quantity <= 0) {
                // Cố tình ném lỗi nếu số lượng không hợp lệ
                throw new IllegalArgumentException("Số lượng đơn hàng phải lớn hơn 0");
            }
            logger.info("Đơn hàng {} đã được xử lý thành công.", orderId);

        } catch (Exception e) {
            // Sử dụng ERROR khi có ngoại lệ xảy ra.
            // Truyền trực tiếp đối tượng 'e' vào cuối cùng để Logback tự động in ra StackTrace
            logger.error("Lỗi khi xử lý đơn hàng {}: {}", orderId, e.getMessage(), e);
        }
    }
}