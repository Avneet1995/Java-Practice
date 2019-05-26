package com.telusko.practiceDemo;

public class color_try_catch {
	public static void main(String[] args){
	try{
		String color=null;
		
		switch(3){
		
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
		default: System.out.println("Wrong input");;
		}	
		System.out.println(color);
	}catch(Exception e){
		System.out.println(e);
	}
	}

}
