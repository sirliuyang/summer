package com.formula.summer.patterns.jvm;

// https://cloud.tencent.com/developer/article/1383145
// https://www.cnblogs.com/significantfrank/p/4875795.html

//https://www.jianshu.com/p/c32878173a10
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader cl = Student.class.getClassLoader();
        System.out.println(cl);
    }
}
