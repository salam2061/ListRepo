package com.demo;

import java.util.ArrayList;

public class ListClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(55);
		al.add(99);
		al.add(96);
		al.add(78);
		al.add(23);
		al.add(43);
		al.add(41);
		
		for(Integer i:al){
			System.out.print(i+" ");
		}

	}

}
