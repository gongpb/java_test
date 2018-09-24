package com.funshion.test.listSort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderComparator implements Comparator<Student>{
	
	public static final OrderComparator INSTANCE = new OrderComparator();
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId() > o2.getId()){
			return 1;
		}
		
		if(o1.getId() < o2.getId()){
			return 1;
		}
		return 0;
	}
	
	public static void sort(List<Student> list ){
		if(list.size()>1){
			Collections.sort(list, INSTANCE);
		}
	}
	
}
