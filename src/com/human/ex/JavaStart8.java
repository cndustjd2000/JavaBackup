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
		
		
		
		//100~1까지 출력하시오
		
		for(int b=100;b>0;b--) {
			System.out.println(b);
		}
		System.out.println("");
		
		
		
		//5~8까지 출력하시오
		
		int c=5;
		while(c<9) {
			System.out.println(c);
			c++;
		}
		System.out.println("");
		
		
		
		//13~22까지 출력하시오
		
		for(int d=13;d<23;d++) {
			System.out.println(d);
		}
		System.out.println("");
		
		
		
		//1~10까지 합계를 출력하시오
		
		int sum=0;
		for(int i=1; i<11; i++) {
			sum=sum+1;
		}
		System.out.println(sum);
		
		
		//1~100까지 짝수 출력
		
		for(int g=1;g<101;g++) {
			if(g%2==0) {
				System.out.println(g);
			}
		}
	}
}