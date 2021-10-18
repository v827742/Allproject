package com.practice.collection.list;

import java.util.List;
import java.util.ArrayList;

public class TaskP1 {
	public static void main(String args[])
	{
	List l=new ArrayList();
	l.add("abc");
	l.add("pqr");
	l.add(10);
	l.add(36);
	l.add("cbz");
	
	System.out.println(l);
	
System.out.println(l.get(0));
System.out.println(l.get(4));
s
Object i=l.get(0);
System.out.println(i instanceof String);
System.out.println(i);

int i1=(int)l.get(3);
	}

}
