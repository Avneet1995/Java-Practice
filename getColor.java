package com.telusko.practiceDemo;

public class getColor {
   
	public static void main(String[] args){
	String color="orange";
	int pos;
	switch(color)
	{
	case "violet": pos = 1;
	               break;
	case "indigo": pos = 2;
				   break;
	case "blue": pos = 3;
	   break;
	case "green": pos = 4;
	   break;
	case "yellow": pos = 5;
	   break;
	case "orange": pos = 6;
	   break;
	case "red": pos = 7;
	   break;
	   default: pos=0;
	
	}
	System.out.println(pos);
	}
}
