package com.cjc;

public class TestImmu {
	public static void main(String[] args) {
		myImmutable m=new myImmutable(20);
		myImmutable m1=m.modify(20);
		myImmutable m2=m1.modify(10);
		System.out.println(m==m1);
        System.out.println(m==m2);
        System.out.println(m.equals(m1));
         System.out.println(m.equals(m2));	
	
	}

}
