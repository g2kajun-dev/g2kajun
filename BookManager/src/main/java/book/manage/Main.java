package book.manage;

import book.manage.entity.Book;
import book.manage.entity.Student;
import book.manage.mapper.BookMapper;
import book.manage.util.SqlUtil;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.LogManager;

@Log
public class Main {
    public static void main(String[] args) throws Exception {
        // 使用类路径方式加载 mybatis-config.xml
        try(Scanner scanner = new Scanner(System.in)){
            LogManager logManager = LogManager.getLogManager();
            logManager.readConfiguration(Resources.getResourceAsStream("logging.properties"));
            while(true) {
                System.out.println("===========");
                System.out.println("input 1 add student into the class");
                System.out.println("input 2 add books into the lib");
                System.out.println("choose your option press any button quit");
                int input = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (input) {
                        case 1:
                            addStudent(scanner);
//                            scanner.next()1
                            break;
                        case 2:
                            addBook(scanner);
                            break;
                        default:
                            return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("傻逼填错了");
                    return;
                }

            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input sex");
        String sex = scanner.nextLine();
        System.out.println("input grade");
        String grade = scanner.nextLine();
//        int ID = Integer.parseInt(id);
        int g = Integer.parseInt(grade);
        Student student = new Student(name, sex, g);
        SqlUtil.doSqlWork(bookMapper -> {
//            bookMapper.addStudent(student);
            int result = bookMapper.addStudent(student);
            if(result > 0) System.out.println("信息已录入");
            log.info("插入成功" + student);
        });

    }

    private static void addBook(Scanner scanner) {
        System.out.println("input title");
        String title = scanner.nextLine();
        System.out.println("input description");
        String description = scanner.nextLine();
        System.out.println("input price");
        String price = scanner.nextLine();
//        int ID = Integer.parseInt(id);
        double p = Double.parseDouble(price);
        Book book = new Book(title, description, p);
        SqlUtil.doSqlWork(bookMapper -> {
//            bookMapper.addStudent(student);
            int result = bookMapper.addBook(book);
            if(result > 0) System.out.println("信息已录入");
            log.info("插入成功" + book);
        });

    }
}
