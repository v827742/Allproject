package com.practice.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		
	
	Map MhToatalDist=new HashMap();
	MhToatalDist.put(1,"Ahamdnagar");
	MhToatalDist.put(2,"Akola");
	MhToatalDist.put(3,"Amravati");
	MhToatalDist.put(4,"Aurangabad");
	MhToatalDist.put(5,"Beed");
	MhToatalDist.put(6,"Bhandara");
	MhToatalDist.put(7,"Buldhana");
	MhToatalDist.put(8,"Chandrapur");
	MhToatalDist.put(9,"Dhule");
	MhToatalDist.put(10,"Gadchiroli");
	MhToatalDist.put(11,"Gondia");
	MhToatalDist.put(12,"Hingoli");
	MhToatalDist.put(13,"Jalgao");
	MhToatalDist.put(14,"Nagpur");
	MhToatalDist.put(15,"Nanded");
	MhToatalDist.put(16,"Nandurbar");
	MhToatalDist.put(17,"Nashik");
	MhToatalDist.put(18,"Osmanbad");
	MhToatalDist.put(19,"Palghar");
	MhToatalDist.put(20,"Parbhani");
	MhToatalDist.put(21,"Pune");
	MhToatalDist.put(22,"Raigad");
	MhToatalDist.put(23,"Ratnagiri");
	MhToatalDist.put(24,"Sangli");
	MhToatalDist.put(25,"Satara");
	MhToatalDist.put(26,"Sindhudurg");
	MhToatalDist.put(27,"Solapur");
	MhToatalDist.put(28,"Thane");
	MhToatalDist.put(29,"Wardha");
	MhToatalDist.put(30,"Washim");
	MhToatalDist.put(31,"Yavatmal");
	MhToatalDist.put(32,"Oros");
	MhToatalDist.put(33,"Alibag");
	MhToatalDist.put(34,"Bandra");
	MhToatalDist.put(35,"Jalna");
	MhToatalDist.put(36,"Latur");
	
	System.out.println(MhToatalDist);
	
	//System.out.println(MhToatalDist.get(2));
	
	//System.out.println(MhToatalDist.get(15));
	
//	System.out.println(MhToatalDist.get(0));
	
	//System.out.println(MhToatalDist.get(6));
	Set keys=MhToatalDist.keySet();
	System.out.println(keys);
	Iterator itr=keys.iterator();
	while(itr.hasNext())
	{
		int i=(int)itr.next();
		System.out.println(i);
		String s=(String)MhToatalDist.get(i);
		System.out.println(s);
	}
	
	
	
	
	
}
}