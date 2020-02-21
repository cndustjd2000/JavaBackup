package com.human.ex;

public class javaClass {
	public static void main(String[] args) {
		//아무거나 쓰면 안되고 자바 문법만 사용이 가능하다
		//이후 과정은 메인에 사용 가능한 자바 문법을 배우는 과정
		//상수
		
		//System.out.println(상수); 사용하면 상수가 화면에 출력
		
		//상수도 데이터이기에 자료형에 맞춰 사용해야 한다.
		//자료형마다 해당 상수가 있다.
		
		//blooean 상수
		System.out.println(true);
		//아무거나 사용한 것이 아니라 blooean 상수를 사용했다.
		
		System.out.println(false);
		//system.out.println()
		//많은 기능 중 하나는 매개변수가 상수이면 상수를 화면에 그대로 출력하고 줄을 바꾼다.
		
		//char 문자형 상수 유니코드 1개
		//문자상수는 보통 앞 뒤에 ''를 사용하여 표시한다.
		//System.out.println(a); error a에 대해서 약속된 바가 없다.
		System.out.println('a');
		//각 문자를 화면에 출력하려면 어떻게 해야할까
		System.out.println('각');
		
		/*유니코드로 출력하고 싶으면 \\u 다음에 코드를 넣으면 된다*/
		System.out.println('\u0041');//A
		System.out.println('\u0042');//B
		
		//byte, short, int 자료형은 int형 상수로 처리 해당 자료형의 범위가 맞는 숫자를 넣으면 상수 처리 됨
		//int형 상수의 경우 소수점이 없는 숫자를 범위에 맞게 기술하면 된다.
		System.out.println(21232);
		System.out.println(032);//8진수
		System.out.println(0x32);//16진수
		//System.out.println(082); 8때문에 에러
		//System.out.println(100000000000);
		//100000000000 은 int형 상수가 이닌데도 불구하고 상수처럼 기술하여서 에러가 발생
		
		//long형 자료
		//소수점이 없는 숫자에 long 숫자범위를 벗어나지 않는 숫자 끝에 소문자 혹은 대문자 L을 붙이면 된다.
		System.out.println(100000000000L);
		System.out.println(100000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float형 상수
		//소수점이 있는 수 끝에 F,f를 붙여서 표시한다.
		System.out.println(3.14f);
		System.out.println(3.14F);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//double형 상수
		//소수점이 있는 수는 double 상수, 숫자 끝에 D,d를 넣으면 double 상수
		System.out.println(3.14);
		System.out.println(3.D);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14e-4);
		
		//String형 상수  문자열 상수
		//문자열 상수는 ""로 묶어서 표현한다.
		System.out.println("helloworld");
		
		//1(숫자), '1'(문자), "1"(문자열)
		//사람이 보기에는 같은 1로 출력되지만 3가지가 메모리에 올라간 모양은 다르다.
		
		//상수의 연산 + - *  %
		//숫자는 수적 연산이 된다.
		//문자열은 + 연산만 가능하다.
		//숫자 + 문자열은 문자열, 숫자 + 숫자는 숫자, 문자열 + 문자열은 문자열
		System.out.println(5+3);//숫자 + 숫자 ==숫자
		System.out.println(5.1+3.2);//숫자 + 숫자 ==숫자
		System.out.println(5+"안녕");//문자열 + 숫자 ==문자열
		System.out.println("안녕"+"안녕");//문자열 + 문자열 ==문자열
		System.out.println(5+5+"안녕");//숫자 + 숫자 + 문자열 == 10안녕
		System.out.println("안녕"+5+5);//문자열 + 숫자 + 숫자 == 안녕55
		
		//
	}

}
