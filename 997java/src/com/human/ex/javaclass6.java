package com.human.ex;

public class javaclass6 {

	public static void main(String[] args) {
		//사용자 입력을 받아 보자.
		//사용자 입력 = 사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는 것.
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		//int = java.util.Scanner
		//a = scanner
		
		System.out.println("문자열을 입력해주세요.");
		String str=scanner.nextLine();//사용자 입력을 받아 문자열로 리턴해주는 함수
		System.out.println(str+"을 입력하셨습니다");
		System.out.println("프로그램 종료");
	
		//사용자 입력은 모두 문자열이다.
		//숫자를 사용자로부터 받으려면 문자열을 숫자로 변경하는 함수를 사용 후 받으면 된다.
		
		System.out.println("정수를 입력해 주세요.");
		String str1=scanner.nextLine();
		System.out.println("정수를 한번 더 입력해 주세요.");
		String str2=scanner.nextLine();
		int i1=Integer.parseInt(str1);
		int i2=Integer.parseInt(str2);
		System.out.println("입력한 정수의 합은 : "+(i1+i2)+" 입니다.");
		System.out.println("프로그램 종료");
		
		
		
	}

}
