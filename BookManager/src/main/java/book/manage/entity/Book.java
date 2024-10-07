package book.manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
public class Book {
    private int bid;

    private String title;

    private String description;

    private double price;

    public Book(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
