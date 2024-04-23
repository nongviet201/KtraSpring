package com.example.ktraspring.dataBase;

import com.example.ktraspring.ultils.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB implements CommandLineRunner {
    @Autowired
    private IFileReader fileReader;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Khởi tạo dữ liệu");
        ProductDB.products = fileReader.readFile("F:/java23 Techmaster/JavaSpring/SpringBoot/KtraSpring/src/main/java/com/example/ktraspring/dataBase/DATA.json");

        // In ra danh sách các person
        ProductDB.products.forEach(System.out::println);

        // In ra số lượng person
        System.out.println("Số lượng Product: " + ProductDB.products.size());
    }
}
