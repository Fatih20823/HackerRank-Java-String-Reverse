package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String B ="";
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        for(int i=0;i<A.length();i++){
            B += A.substring(A.length()-1-i,A.length()-i);         
        }
        if (A.equals(B)) {
        	System.out.println("Yes");
        }else {System.out.println("No");}
        

	}

}
