package com.gongpb.test.listSort;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("test1");
		Student s2 = new Student();
		s1.setId(2);
		s1.setName("test2");
		
		Student s3 = new Student();
		s1.setId(3);
		s1.setName("test3");
		
		list.add(s3);
		list.add(s1);
		list.add(s2);
		
//		OrderComparator comparator=new OrderComparator();
//		Collections.sort(list, comparator);
		
		
//		Collections.sort(list, new Comparator<Student>() {
//
//            public int compare(Student arg0, Student arg1) {
//
//                return arg0.getId().compareTo(arg1.getId());
//
//            }
//        });
		OrderComparator.sort(list);
//		for(Student s:list){
//			System.out.println(s.getId());
//		}
	}
}
