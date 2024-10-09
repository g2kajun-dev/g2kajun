package book.manage;

import book.manage.util.SqlUtil;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test1() {
        SqlUtil.doSqlWork(bookMapper -> {
            bookMapper.getBorrowList().forEach(System.out::println);
        });
    }
}
