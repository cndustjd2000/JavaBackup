package com.human.ex;

public class JavaStart8 {

	public static void main(String[] args) {
		/*//안녕 3번 반복하기  반복문 while, for
		int count=0;	//초기값
		while(count<5) {//비교 값
			//while 중괄호 부분은 조건식이 참일 때 실행
			System.out.println("안녕.");
			count++;	//변환 값
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("안녕.");
		}*/
		
		//for(초기값;비교값;변환값){
			//반복할 내용 }
		
		//1~100까지 출력하시오
		
		int a=1;
		while(a<101) {
			System.out.println(a);
			a++;
		}
		System.out.println("");
		
		
		
		for(int b=100;b>0;b--) {
			System.out.println(b);
		}
		System.out.println("");
		
		
		
		int c=5;
		while(c<9) {
			System.out.println(c);
			c++;
		}
		System.out.println("");
		
		
		
		for(int d=13;d<23;d++) {
			System.out.println(d);
		}
		System.out.println("");
		
		int h=0;
		int count=0;
		while(count<10) {
			count++;
			h=h+count;
			System.out.println(h);
		}
		
	}
}