package com.mani.gayi.basic;

public class Inheritance {
	
	public static void main(String[] args) {
		
		
		A a = new B();
		
		((B)a).hello();
	}
	

}


class A
{
	public void pack(){
	System.out.println("Parent");	
	}
}

class B extends A
{
	public void pack()
	{
		System.out.println("Child");
	}
	
	public void hello()
	{
		System.out.println("hello");
	}
}