package Class1121;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RongqiAndFanxing {
    public static void main(String[] args) {
        List<Student> arr=new ArrayList<>();
        arr.add(new Student("战三",12));
        arr.add(new Student("战三1",12));
        arr.add(new Student("战三2",12));
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i).getName()+":"+arr.get(i).getAge());
        }

        //最规范的方式
        List<Student> arr1=new LinkedList<Student>();
        arr1.add(new Student("战三",12));
        arr1.add(new Student("战三1",12));
        arr1.add(new Student("战三2",12));
        for (int i = 0; i <arr1.size() ; i++) {
            System.out.println(arr1.get(i).getName()+":"+arr1.get(i).getAge());
        }
        ///home/redorange/IdeaProjects/Now1138/src/Class1121/Student.java

//        List<String> I=new ArrayList<>();
//        I.add("java");
//        I.add("is");
//        I.add("good");
//        for (int i = 0; i < I.size(); i++) {
//            System.out.print(" "+I.get(i));
//        }
//        I.remove(1);
//        System.out.println();
//        for (int i = 0; i < I.size(); i++) {
//            System.out.print(" "+I.get(i));
//        }

//        Scanner in =new Scanner(System.in);
//        ArrayList arr=new ArrayList<>();
//        int cnt=10;
//        for (int i = 0; i <cnt ; i++) {
//           arr.add(in.nextInt());
//        }
//        arr.remove(0);
//        int str = 999999;
//        arr.set(8,str);//用指定的元素替代此列表中指定位置上的元素
//        System.out.println("数组的长度："+arr.size());//回此列表中的元素数
//        for (int i = 0; i <arr.size() ; i++) {
//            System.out.print(arr.get(i)+"  ");
//        }
    }
}

/*
    容器和泛型
*/