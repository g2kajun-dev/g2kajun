package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


// lamda表达式是在一个接口有且只有一个方法时才可以用
public class Main {

    public static void main(String[] args) {

//        Main main = new Main();
        Student student = new student();
        student.hello();
//        // 泛型必须用引用类型数据
//        Integer[] a = new Integer[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
//        int[] b = new int[]{1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
////        Comparator
//        Arrays.sort(a, (o1, o2) -> o1+o2);
//        System.out.println(Arrays.toString(a));
////        maoPao(b);
//        System.out.println(erFenFa(b, 15));
//
//        A<String> a2 = new B();
//
//        System.out.println(a2.test());
//    }
//
//    public static void maoPao(int[] a) {
//        int temp;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length-1-i; j++) {
//                if (a[j] > a[j+1]) {
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }
//
//    public static int erFenFa(int[] a, int b) {
////        int half = a.length/2;
//        int find = 0;
//        int start = 0;
//        int end = a.length - 1;
//        for (int i = 0; start <= end; i++) {
//            int mid = start + (end - start)/2;
//            if (a[mid] == b) {
//                return mid;
//            } else if (a[mid] > b) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
////            else if(a[i/2 > b]){
////                i = i/2;
////            }
//        }
//        return -1;
//    }

//    static class B extends A<String> {
    }
    public class Student {
        public void hello(){
            System.out.println("hello, Im a student");
        }
    }
}