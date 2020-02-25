package com.human.ex;

public class JavaStart03 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("윗변을 구한다.");
		String str=sc.nextLine();
		int A=Integer.parseInt(str);
		
		System.out.println("아랫변을 구한다.");
		String str1=sc.nextLine();
		int B=Integer.parseInt(str1);
		
		System.out.println("높이를 구한다.");
		String str3=sc.nextLine();
		int H=Integer.parseInt(str3);
		
		int S=(A+B)*H/2;
		
		System.out.println(S);
		
		
		//
		
		/*System.out.println("숫자를 입력하시오.");
		System.out.println("입력한 숫자가 0보다 큰가?");
		String str4=sc.nextLine();
		int a=Integer.parseInt(str4);
		while (true) {
			int a=1;
		}
		int a=-1;
		System.out.println(a);*/
		
	}
}