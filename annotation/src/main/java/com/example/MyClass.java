package com.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MyClass {
    @RunAnnotation(value = "thj",what = 2)
    private int test;

    @RunAnnotation(value = "ddd",what = 222)
    private int test1;
    public static void main(String[] args){
        System.out.println("test annotation");
        Class c = MyClass.class;
        try {
            for(Field field: c.getDeclaredFields()){
                RunAnnotation runAnnotation = field.getAnnotation(RunAnnotation.class);
                if(runAnnotation != null) {
                    System.out.println("value = " + runAnnotation.value());
                    System.out.println("what = " + runAnnotation.what());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
