package com.company;

public class FunWithStrings {
	String funString;
	String lessFunString;

	public FunWithStrings() {
		// TODO Auto-generated constructor stub
		//funString = new String("");
		funString = "blah";
		lessFunString = new String(funString);   // copy constructor
	}
	
	public void play(){
		System.out.println(funString);
		System.out.println("I printed the string.");
		System.out.println(lessFunString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		s1+=" world";
		s1=s1+"goodbye";
		s1 += 4;
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println("whiteboard".length());
		System.out.println("whiteboard".substring(3));
		System.out.println("whiteboard".substring(3,7));
		
		String s2 = " hEllo ";
		s2=s2.trim();
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		FunWithStrings f1 = new FunWithStrings();
		//f1.play();


	}

}
