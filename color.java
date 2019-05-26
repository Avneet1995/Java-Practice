package com.telusko.practiceDemo;

public class color {
	public static void main(String[] args){
	
		String color;
		int pos=3;
		switch(pos){
		
		case 1: color="violet";
				break;
		case 2: color="indigo";
				break;
		case 3: color="blue";
				break;
		case 4: color="green";
		break;
		case 5: color="yellow";
		break;
		case 6: color="orange";
		break;
		case 7: color="red";
		break;
		default: color="wrong choice";
		}
		System.out.println(color);
	}
}
