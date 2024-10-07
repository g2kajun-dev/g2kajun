import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    static Consumer<Student> STUDENT_CONSUMER = student -> System.out.println("fuck you");
    public static void main(String[] args) {
        //        方法引用
//        Main main = new Main();
        Student student = new Student();
        Slave slave = new Slave();
        Supplier<Student> studentSupplier = Student::new;
        Consumer<? super Slave> fuck = new Consumer<Slave>() {4
            @Override
            public void accept(Slave slave1) {
                System.out.println("I am slave");
            }
        };
        STUDENT_CONSUMER

                .andThen(fuck).accept(student);
        studentSupplier.get().hello();

    }

    public static class Student extends Slave{
        public void hello() {
            System.out.println("fuckyou");
        }

    }
}