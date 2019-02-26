package com.oracle.service;

public class StringDemo {

	public static void main(String[] args) {
		String s1="wipro";
		String s2=new String("wipro");
		s2=s2.intern();
		System.out.println(s1==s2);

	}

}
