package com.cjc;

public class StringClass {
	public static void main(String[] args) {
		String s=new String ("cjc");
		String s1=new String ("cjc");
		String s2="cjc";
		String s3=new String("java");
		String s4=new String("classes");
		String s5=new String("java");
		String s6="classes";
		
		
		System.out.println(s==s1);//f
		System.out.println(s==s2);//f
	System.out.println(s==s3);//f
	System.out.println(s==s4);//f
	System.out.println(s1==s3);//f
	System.out.println(s1==s6);//f
	System.out.println(s5==s6);//f
	System.out.println(s==s);//t
	
	System.out.println(s.equals(s1));//t
	System.out.println(s.equals(s6));//f
System.out.println(s.equals(s4));//f
System.out.println(s.equals(s5));//f
System.out.println(s5.equals(s3));//t
System.out.println(s1.equals(s2));//t
System.out.println(s4.equals(s6));//t
System.out.println(s.equals(s1));//t

	}

}
