package com.practice.collection.list;

import java.util.*;


public class TaskPractic {
public static void main(String[] args) {
	
	List mh=new ArrayList();
	
	mh.add("Chndrapur");
	mh.add("Nagpur");
	mh.add("pune");
	mh.add("Solapur");
	
	List mp=new ArrayList();
	mp.add("Indore");
	mp.add("Bhopal");
	mp.add("udaypur");
	
	Set india=new HashSet();
	india.add(mh);
	india.add(mp);
	
	Map world=new HashMap();
	world.put("India",india);
	
	
	Set keys=world.keySet();
	System.out.println(keys);
	
	Iterator itr=keys.iterator();
	while(itr.hasNext())
	{
		String state=(String)itr.next();
		System.out.println(state);
		
		Set st=(Set)world.get(state);
		Iterator itr1=st.iterator();
		while(itr1.hasNext())
		{
		   List l=(List)itr1.next();
		   
		   Iterator itr2=l.iterator();
		   while(itr2.hasNext())
			{
			 String s1=(String)itr2.next();
			 System.out.println(s1);
			}
		}
	}
}
}
