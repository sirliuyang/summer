package com.formula.summer.patterns.jvm;

//https://blog.csdn.net/a745233700/article/details/82893076

//https://blog.csdn.net/pange1991/article/details/81175350
public class ReflectTest {
    public static void main(String[] args) {

        //第一种方式获取Class对象
        Student student = new Student();
        Class studentClass1 = student.getClass();
        System.out.println(studentClass1.getName());


        //第二种方式获得Class对象
        Class studentClass2 = Student.class;
        System.out.println(studentClass1 == studentClass2);

        //第三种方式, 反射方式
        try {
            Class studentClass3 = Class.forName("com.formula.summer.patterns.jvm.Student");
            System.out.println(studentClass2 == studentClass3);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
