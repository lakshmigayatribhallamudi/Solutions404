package com.mani.gayi.basic;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Inheritance {
	
	public static void main(String[] args) {
		
		
		A a = new B();
		
		a.pack();
	}
	

}


class A
{
	public void pack(){
	System.out.println("Parent");	
	bollo();
	}
	
	public void bollo()
	{
		System.out.println("A : Bollo");
	}
	
	
}

class B extends A
{
	
	
	public void hello()
	{
		System.out.println("hello");
	}
	
	public void bollo()
	{
		System.out.println("B : Bollo");
	}
}