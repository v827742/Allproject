package com.cjc;

public final class myImmutable {
	private int data;
	myImmutable(int value)
	{
		data = value;
	}
	public myImmutable modify(int secData)
	{
		if(data==secData)
			return this;
	
	else {
		return new myImmutable(secData);
	}
}
}

