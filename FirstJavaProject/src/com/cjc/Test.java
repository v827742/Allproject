package com.cjc;

public class Test {

	public void getData()
	{
		Student st=new Student();
		Student s=st.setStuData();
		System.out.println(s.id);
		System.out.println(s.name);
		

	}

	
	public static void main(String[] args) {
		Test t=new Test();
		t.getData();
	}
	
}
