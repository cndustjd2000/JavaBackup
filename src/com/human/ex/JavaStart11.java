package com.human.ex;

public class JavaStart11 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//8페이지
		
		System.out.println("x에 대입 할 숫자를 입력하시오.");
		
		int x=Integer.parseInt(sc.nextLine());
		if(x%2==0) {
			System.out.println("x:짝수");
		}else {
			System.out.println("x:홀수");
		}
		
		//9페이지 1번 문제
		
		System.out.println("정수를 입력하세요.");
		
		int a=Integer.parseInt(sc.nextLine());
		if(a%2==0) {
			System.out.println(a+"은(는) 짝수 입니다.");
		}else {
			System.out.println(a+"은(는) 홀수 입니다.");
		}
		
		//9페이지 2번 문제
		
		System.out.println("정수를 입력하세요.");
		
		int ab=Integer.parseInt(sc.nextLine());
		if(ab%3==0) {
			System.out.println(ab+"은(는) 3의 배수가 맞습니다.");
		}else {
			System.out.println(ab+"은(는) 3의 배수가 아닙니다.");
		}
		
		System.out.println("정수를 입력하세요.");
		
		int ab1=Integer.parseInt(sc.nextLine());
		if(ab1%7==0) {
			System.out.println(ab1+"은(는) 7의 배수가 맞습니다.");
		}else {
			System.out.println(ab1+"은(는) 7의 배수가 아닙니다.");
		}
		
		System.out.println("정수를 입력하세요.");
		
		int ab2=Integer.parseInt(sc.nextLine());
		if(ab2%4==0) {
			System.out.println(ab2+"은(는) 4의 배수가 맞습니다.");
		}else {
			System.out.println(ab2+"은(는) 4의 배수가 아닙니다.");
		}
		
		//9페이지 3번 문제
		
		System.out.println("두 개의 수를 입력하시오.");
		int a1=Integer.parseInt(sc.nextLine());
		int a2=Integer.parseInt(sc.nextLine());
		if(a1==a2) {
			System.out.println(a1+"과"+a2+"는 같은 수 입니다.");
		}else {
			if(a1<a2) {
				System.out.println(a1+"보다"+a2+"이(가) 더 큽니다.");
			}else {
				System.out.println(a2+"보다"+a1+"이(가) 더 큽니다.");
			}
		}
		
		//10페이지 1번 문제
		
		System.out.println("정수를 입력하시오.");
		int a3=Integer.parseInt(sc.nextLine());
		
		System.out.println("정수를 입력하시오.");
		int a4=Integer.parseInt(sc.nextLine());
		
		if(a3%a4==0) {
			System.out.println("약수 입니다.");
		}else {
			System.out.println("약수가 아닙니다.");
		}
		
		//10페이지 2번 문제
		
		System.out.println("정수를 입력하시오.");
		int a5=Integer.parseInt(sc.nextLine());
		
		if(a5<=10) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		
		//10페이지 3번 문제
		
		System.out.println("정수를 입력하시오.");
		int a6=Integer.parseInt(sc.nextLine());
		
		if(a6<0) {
			System.out.println(a6+"은(는) 음수입니다.");
		}else {
			
		}
		
		System.out.println("정수를 입력하시오.");
		int a7=Integer.parseInt(sc.nextLine());
		
		if(a7<0) {
			System.out.println(a7+"은(는) 음수입니다.");
		}
		
		
		//11페이지 1번 문제
		
		System.out.println("A에서 C까지의 문자를 입력하시오.");
		String str=sc.nextLine();
		
		String b=new String("A");
		String b1=new String("B");
		String b2=new String("C");
		
		if(str.equals(b)) {
			System.out.println("정답입니다.");
		}else {
			if(str.equals(b1)) {
				System.out.println("정답입니다.");
			}else {
				if(str.equals(b2)) {
					System.out.println("정답입니다.");
				}else {
					System.out.println("틀렸습니다.");
				}
			}
		}
		
		//11페이지 2번 문제
		
		System.out.println("현재 시간(24시 기준)과 나이를 입력하세요.");
		int b3=Integer.parseInt(sc.nextLine());
		int b4=Integer.parseInt(sc.nextLine());
		
		if(b3<18) {
			if(b4<13) {
				System.out.println("요금은 25000원 입니다.");
			}else {
				System.out.println("요금은 34000원 입니다.");
			}
		}else {
			System.out.println("요금은 10000원 입니다.");
		}
		
		//12페이지 1번 문제
		
		System.out.println("국어 성적을 입력하세요.");
		int b5=Integer.parseInt(sc.nextLine());
		System.out.println("영어 성적을 입력하세요.");
		int b6=Integer.parseInt(sc.nextLine());
		System.out.println("수학 성적을 입력하세요.");
		int b7=Integer.parseInt(sc.nextLine());
		
		double c=(double)(b5+b6+b7)/3;
		
		if(c>=80) {
			System.out.println("평균성적은"+c);
			System.out.println("합격입니다.");
		}else {
			System.out.println("평균성적은"+c);
			System.out.println("불합격입니다.");
		}
		
		//12페이지 2번 문제
		
		System.out.println("첫 번째 수를 입력하세요.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력하세요.");
		int c2=Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 수를 입력하세요.");
		int c3=Integer.parseInt(sc.nextLine());
		System.out.println("네 번째 수를 입력하세요.");
		int c4=Integer.parseInt(sc.nextLine());
		System.out.println("다섯 번째 수를 입력하세요.");
		int c5=Integer.parseInt(sc.nextLine());
		
		int max=0;
		if(max<c1) {
		max=c1;
		}
		if(max<c2) {
		max=c2;
		}
		if(max<c3) {
		max=c3;
		}
		if(max<c4) {
		max=c4;
		}
		if(max<c5) {
		max=c5;
		}

		if(c1<c2) {
		c2=c1;
		}
		if(c2<c3) {
		c3=c2;
		}
		if(c3<c4) {
		c4=c3;
		}
		if(c4<c5) {
		c5=c4;
		}
		int min=c5;
		System.out.println("가장 큰 수는:"+max);
		System.out.println("가장 작은 수는:"+min);
		
		//13페이지 3번 문제
		
		System.out.println("첫 번째 숫자를 입력하시오.");
		int d=Integer.parseInt(sc.nextLine());
		
		System.out.println("두 번째 숫자를 입력하시오.");
		int d1=Integer.parseInt(sc.nextLine());
		
		if(d>0) {
			d=d;
		}else {
			d=-d;
		}
		
		if(d1>0) {
			d1=d1;
		}else {
			d1=-d1;
		}
		System.out.println(d+d1);
		
		//13페이지 2번 문제
		
		System.out.println("x1에 넣을 값을 입력하시오.");
		int x1=Integer.parseInt(sc.nextLine());
		if(x1>0) {
			System.out.println(7*x1+2);
		}else {
			System.out.println((x1*x1*x1)-(9*x1)+2);
		}
		
		
		//14페이지 문제
		
		System.out.println("몸무게를 입력하세요.");
		double kg=Integer.parseInt(sc.nextLine());
		System.out.println("키를 입력하세요.");
		double cm=sc.nextDouble();
		
		double m=cm/100;
		double bmi=kg/(m*m);
		
		String str6=String.format("%.1f", bmi);
		System.out.println("당신의 bmi는 "+str6);
		
		if(bmi<20) {
			System.out.println("저체중");
		}else {
			if(bmi>25) {
				System.out.println("과체중");
			}else {
				System.out.println("표준체중, 정상입니다.");
			}
		}
		
		//15페이지 문제
		
		System.out.println("당신의 키를 입력하시오.");
		int tall=Integer.parseInt(sc.nextLine());
		
		System.out.println("당신의 키는 "+tall+"이시군요.");
		if(tall>175) {
			System.out.println("키가 크시군요.");
		}
		sc.close();
	}
}