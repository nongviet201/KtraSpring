package com.example.ktraspring.ultils;

import com.example.ktraspring.model.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Component
public class JSONFileReader implements IFileReader {
    @Override
    public List<Product> readFile(String path) {
        System.out.println("Đọc file JSON");
        ObjectMapper mapper = new ObjectMapper();

        // TODO
        mapper.registerModule(new JavaTimeModule());

        try {
            // Đọc file JSON và chuyển đổi nó thành danh sách các đối tượng Person
            return mapper.readValue(Paths.get(path).toFile(), new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi đọc file JSON: " + e.getMessage());
        }
        return List.of();  // Trả về danh sách trống nếu có lỗi
    }
}
