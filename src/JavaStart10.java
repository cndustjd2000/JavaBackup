

public class JavaStart10 {

	public static void main(String[] args) {
		//if 조건문
		/*
		if(조건){
			조건이 참일 때 실행
		}else{
			조건이 거짓일 때 실행
			
		}
		
		조건식으로 올 수 있는 것은 실행 결과가 boolean인 경우
		true, false, 비교연산자, 논리연산자
		 */
		if (true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//실행부가 1줄일 때 생략가능
		if (false) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			//실행부가 1줄일 때 생략가능
			//else 부분 자체를 생략이 가능하다.
			
			
		if(10<400){
			System.out.println("true");
		}
		int a=10;
		if(a==10) {
			System.out.println("true");
		}
		if(a!=10){
			System.out.println("true");
		}
		
		//true, false, 1, 0 일반적인 언어에서 0에서 true 취급
		//if(1){} 조건식이 실행
		//if(0){} 조건식이 실행 안됨
		
		/*
		 기본자료형 비교 ==     변수가 가리키는 값 비교
		 참조자료형은 .equals변수가 가리키는 주소에 있는 값 비교
		 */
		
		String s1="홍길동";
		String s2="홍길동";
		String s3=new String("홍길동");
		String s4=new String("홍길동");
		if(s3==s4) {
			System.out.println("== 이용해 같은 경우");
		}
		if(s3.equals(s4)) {
			System.out.println("equals 이용해 같은 경우");
		}
		
		//사용자에게 숫자를 입력받아 1004이면 '암호가 맞음' 아니면 '암호가 틀림'이 출력되도록 프로그램을 구현해보자.
		
		//'안녕'을 입력하면 '너도 안녕''잘자
		//입력하면 '너도 잘자''잘가'가 입력되면'너도 잘가'가 출력되도록 구현
		//두 수의 자이를 구하는 프로그램을 구해보자  10 20 , 20 10 입력시 10이 리턴 되어야 한다
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		
		int a1=Integer.parseInt(sc.nextLine());
		if(a1==1004) {
			System.out.println("암호가 맞음.");
		}else {
			System.out.println("암호가 틀림.");
		}
		
		
		
		System.out.println("안녕을 입력하시오.");
		
		String str=sc.nextLine();
		String b=new String("안녕");
		if(str.equals(b)) {
			System.out.println("너도 안녕.");
		}
		
		System.out.println("잘자를 입력하시오.");
		
		String str1=sc.nextLine();
		String c=new String("잘자");
		if(str1.equals(c)) {
			System.out.println("너도 잘자.");
		}
		
		System.out.println("잘가를 입력하시오.");
		
		String str2=sc.nextLine();
		String d=new String("잘가");
		if(str2.equals(d)) {
			System.out.println("너도 잘가.");
		}
		
		System.out.println("첫번째 수를 입력하시오.");
		int a2=Integer.parseInt(sc.nextLine());
		System.out.println("마지막 수를 입력하시오.");
		int a3=Integer.parseInt(sc.nextLine());
		
		if(a2>a3) {
			System.out.println(a2-a3);
		}else {
			System.out.println(a3-a2);
		}
		sc.close();
	}
}