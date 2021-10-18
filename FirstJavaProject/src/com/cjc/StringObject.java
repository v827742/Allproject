package com.cjc;

public class StringObject {
	public static void main(String[] args) {
		String s=new String("CoreJavaClasses");
		String s1=new String("     core java classes    ");
		String s2=new String("pqr");
		String s3=s1.concat(s2);
	
		System.out.println(s3);
		System.out.println(s.charAt(6));
		System.out.println(s1.contains("java"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.indexOf('C'));
		System.out.println(s.lastIndexOf('C'));
		System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.replace('C', 'D'));
        System.out.println(s1.replace("java", "Python"));
        String[] s5=s1.split(" ");
        for(int i=0;i<s5.length;i++)
        {
        	System.out.println(s5[i]);
        }
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,12));
        System.out.println(s1.trim());
      
        
	}

}
