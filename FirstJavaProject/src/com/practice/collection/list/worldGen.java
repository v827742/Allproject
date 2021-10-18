package com.practice.collection.list;

import java.util.*;


public class worldGen {
	
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<>();
		
		mh.add("Chndrapur");
		mh.add("Nagpur");
		mh.add("pune");
		mh.add("Solapur");
		
		List<String> mp=new ArrayList<>();
		mp.add("Indore");
		mp.add("Bhopal");
		mp.add("udaypur");
		
		Set<List<String>> india=new HashSet<>();
		india.add(mh);
		india.add(mp);
		
		Map <String,Set<List<String>>>world=new HashMap<>();
		world.put("India",india);
		
		
		Set<String> keys=world.keySet();
		System.out.println(keys);
		
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			
			Set<List<String>> st=world.get(s);
			Iterator<List<String>> itr1=st.iterator();
			while(itr1.hasNext())
			{
				List<String> l=itr1.next();
				
				Iterator<String> itr2=l.iterator();
				while(itr2.hasNext())
				{
					String s1=itr2.next();
					System.out.println(s1);
				}
			}
		}
		System.out.println("   ");
		System.out.println("By using For each loop");
		for(String s:keys)
		{
			System.out.println(s);
			
			Set<List<String>> st=world.get(s);
			for(List<String> l:st)
			{
				for(String str:l)
				{
					System.out.println(str);
				}
				
			}
		}
		
	}

}
