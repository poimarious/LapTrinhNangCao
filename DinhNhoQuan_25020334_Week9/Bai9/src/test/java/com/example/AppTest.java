package com.example;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testLoggingOutput() {
        App app = new App();

        // Trường hợp hợp lệ -> Ghi log INFO
        app.processOrder("ORD-001", 5);

        // Trường hợp lỗi -> Ghi log ERROR và in StackTrace
        app.processOrder("ORD-002", -3);
    }
}