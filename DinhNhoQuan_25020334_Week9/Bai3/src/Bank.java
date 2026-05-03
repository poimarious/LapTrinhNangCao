package bank_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp quản lý danh sách khách hàng và tài khoản.
 */
public class Bank {
    private static final Logger logger = LoggerFactory.getLogger(Bank.class);
    private List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void readCustomerList(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        logger.info("Bắt đầu đọc dữ liệu khách hàng.");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            Customer current = null;
            while ((line = reader.readLine()) != null) {
                current = processDataLine(line.trim(), current);
            }
        } catch (IOException e) {
            logger.error("Lỗi hệ thống khi đọc dữ liệu: {}", e.getMessage());
        }
    }

    private Customer processDataLine(String line, Customer current) {
        if (line.isEmpty()) {
            return current;
        }

        int lastSpace = line.lastIndexOf(' ');
        if (lastSpace <= 0) {
            return parseAccountLine(line, current);
        }

        String token = line.substring(lastSpace + 1).trim();
        if (token.matches("\\d{9}")) {
            String name = line.substring(0, lastSpace).trim();
            Customer newCustomer = new Customer(Long.parseLong(token), name);
            customerList.add(newCustomer);
            logger.info("Đã thêm khách hàng mới: {}", name);
            return newCustomer;
        }
        return parseAccountLine(line, current);
    }

    private Customer parseAccountLine(String line, Customer current) {
        if (current == null) {
            return null;
        }
        String[] parts = line.split("\\s+");
        if (parts.length >= 3) {
            long num = Long.parseLong(parts[0]);
            double bal = Double.parseDouble(parts[2]);
            if (Account.CHECKING_TYPE.equals(parts[1])) {
                current.addAccount(new CheckingAccount(num, bal));
            } else if (Account.SAVINGS_TYPE.equals(parts[1])) {
                current.addAccount(new SavingsAccount(num, bal));
            }
        }
        return current;
    }

    public String getCustomersInfoByIdOrder() {
        customerList.sort(Comparator.comparingLong(Customer::getIdNumber));
        return buildCustomerInfoString(customerList);
    }

    public String getCustomersInfoByNameOrder() {
        List<Customer> copy = new ArrayList<>(customerList);
        copy.sort((c1, c2) -> {
            int res = c1.getFullName().compareTo(c2.getFullName());
            return res != 0 ? res : Long.compare(c1.getIdNumber(), c2.getIdNumber());
        });
        return buildCustomerInfoString(copy);
    }

    private String buildCustomerInfoString(List<Customer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getCustomerInfo());
            if (i < list.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}