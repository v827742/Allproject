package com.practice.collection.list;

import java.util.*;

public class World1 {

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
		
		List<String> tokyo=new ArrayList<>();
		tokyo.add("yoma");
		tokyo.add("naga");
		
		List<String> hiroshima=new ArrayList<>();
		hiroshima.add("kiyoka");
		hiroshima.add("fukoku");
		
		Map<String,List<String>> india=new HashMap<>();
		india.put("Maharashtra",mh);
		india.put("madhyapradesh",mp);
		
		Map<String,List<String>> japan=new HashMap<>();
		japan.put("Hiroshima",hiroshima);
		japan.put("Tokyo",tokyo);
		
		Map <String,Map<String,List<String>>>world=new HashMap<>();
		world.put("India",india);
		world.put("japan",japan);
		
		
		Set<String> keys=world.keySet();
		
		System.out.println(keys);

		for(String key:keys)
		{
			System.out.println(key);
			
			Map<String,List<String>> m=world.get(key);
			Set<String> ss=m.keySet();
			for(String s1:ss)
			{
				System.out.println(s1);
				List<String> l=m.get(s1);
				System.out.println(l);
				for(String l1:l)
				{
		
					System.out.println(l1);
					
				}
			}
		}
	}
}
