package book.manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
@Data
public class Student {
    private int sid;

    private String name;

    private String sex;

    private int grade;

    public Student(String name, String sex, int grade){
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }
}
