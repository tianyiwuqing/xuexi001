package com.ujiuye.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//*********************************************************************************************************
/**
 * @author 天意无情
 * @date 2018-12-05 16:06
 */
public class Test {

    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        List<Student> list=new ArrayList<>();
        int size = set.size();
        System.out.println(size);
        char i='a';
        Student student=null;
        list.add(student);
        set.add(student);
        System.out.println(i+1);
    }
}
