package book.manage.util;

import book.manage.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.util.function.Consumer;

public class SqlUtil {
    static String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));} catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static SqlSession getSession(){
//        return sqlSessionFactory.openSession(true);
//    }

    public static void doSqlWork(Consumer<BookMapper> consumer) {
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            consumer.accept(bookMapper);
        }
    }

}
