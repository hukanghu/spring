package com.huk;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p1 = new Person("111", "aaa");
        Person p2 = new Person("222", "bbb");
        List list = new ArrayList();
        list.add(p1);
        list.add(p2);
        
        Object[] objects = list.toArray();
        
        
        
        test(list);
	}

	private static void test(List list) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
            Field[] fields = list.get(i).getClass().getDeclaredFields();
            Object oi = list.get(i);
            for (int j = 0; j < fields.length; j++) {
                if(!fields[j].isAccessible()){
                    fields[j].setAccessible(true);
                }
                 
                System.out.print(fields[j].get(oi).toString()+" ");
            }
            System.out.println("----");
        }
	}

}
