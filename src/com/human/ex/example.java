package com.human.ex;

public class example {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/*System.out.println("숫자를 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 0:{
				System.out.println("0");
				break;
			}
			case 1:{
				System.out.println("1");
				break;
			}
			case 2:{
				System.out.println("2");
				break;
			}
			case 3:{
				System.out.println("3");
				break;
			}
			case 4:{
				System.out.println("4");
				break;
			}
			default:{
				System.out.println("없는 값");
				break;
			}
		}
		
		
		
		System.out.println("계절을 알고싶은 월을 숫자로 입력하시오.");
		int b=Integer.parseInt(sc.nextLine());
		
		switch(b) {
			case 12: case 1: case 2:{
				System.out.println("겨울");
				break;
			}
			case 3: case 4: case 5:{
				System.out.println("봄");
				break;
			}
			case 6: case 7: case 8:{
				System.out.println("여름");
				break;
			}
			case 9: case 10: case 11:{
				System.out.println("가을");
				break;
			}
			default:{
				System.out.println("없는 월 입니다.");
				break;
			}
		}
		
		
		sc.close();*/
		
		
		java.util.Random ran=new java.util.Random();
		
		//int a=ran.nextInt(5); >>0~4까지 출력
		//int a=ran.nextInt(5)+5; >>5~9까지 출력
		
		/*System.out.println("가위 바위 보.");
		System.out.println("0 : 가위, 1 : 바위, 2 : 보");
		
		System.out.println("본인이 낼 숫자를 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 0:{
				System.out.println("가위를 내셨습니다.");
				break;
			}
			case 1:{
				System.out.println("바위를 내셨습니다.");
				break;
			}
			case 2:{
				System.out.println("보를 내셨습니다.");
				break;
			}
		}
		
		int a1=ran.nextInt(3);
		System.out.println("컴퓨터가 낸 숫자는 "+a1);
		
		
		switch(a1) {
			case 0:{
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			}
			case 1:{
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			}
			case 2:{
				System.out.println("컴퓨터는 보를 냈습니다.");
				break;
				}
		
			}
		
		if(a==a1) {
			System.out.println("비겼습니다.");
		}
		if(a>a1) {
			System.out.println("당신이 이겼습니다.");
		}
		if(a==0&&a1==2){
			System.out.println("당신이 이겼습니다.");
		}else {
			if(a<a1) {
				System.out.println("당신이 졌습니다.");
			}
		}
		
		*/
		
		boolean isDay=true;//낮이면 true
		boolean isStar=true;//true일 때 별 그리기
		boolean isCloud=true;
		
		/*String nowDate="낮";
		if(isDay) {
			System.out.println("해");
			if(isCloud) {
				System.out.println("구름");
			}
		}else {
			System.out.println("달");
			if(isStar) {
				System.out.println("별");
			}
		}
		
		if(isDay) {
			System.out.println("해");
			
		}else {
			System.out.println("달");
		}
		
		if(isDay&&isCloud) { //and 연산자,  isDay==true, isCloud==true 일때 출력
		if(isDay||isCloud) { or 연산자
			System.out.println("구름");
		}
		
		if(isDay==false&&isStar==true) {
			System.out.println("별");
		}
		
		(수식1)&&(수식2)
		수식1이 false이면 수식2를 처리하지 않음
		
		*/
		
		/*boolean a=true;
		int b=20;
		if(a=true||b>=20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int c=1, d=0, e=1;
		if(c<0 || d<0 || e<0);
		
		int a1=30, a2=40;
		int a3=Integer.parseInt(sc.nextLine());
		if(a3>=a1) {
			if(a3<=a2) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
		int b1=60;
		int b2=100;
		int b3=Integer.parseInt(sc.nextLine());
		
		if(b3<b1 || b3>b2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		System.out.println("대전 또는 천안을 입력하시오.");
		String str1=sc.nextLine();
		
		System.out.println("당신의 나이를 입력하시오.");
		int c1=Integer.parseInt(sc.nextLine());
		if(str1.equals("대전") || str1.equals("천안")) {
				if(c1>=20 && c1<30) {
					System.out.println("true");
				}else {
					System.out.println("false");
		}
		
		*/
		
		/*boolean isStateA=true;
		boolean isStateB=true;
		
		if(isStateA==true) {
			if(isStateB==true) {
				System.out.println("&&");
				
			}
		}
		
		
		boolean isPrint=false;
		
		if(isStateA==true) {
			isPrint=true;	
		}
		if(isStateB==true) {
			isPrint=true;	
		}
		if(isPrint==true) {
			System.out.println("||");
			//if(isStateA==true||isStateB==true);
		}
		
		
		
		boolean password1=true;
		boolean password2=true;
		
		if(password1==true && password2==true) {
			System.out.println("1차 비밀번호와 2차 비밀번호가 일치합니다");
		}else{
			System.out.println("비밀번호가 일지하지 않습니다.");
		}
		*/
		
		//else if
		//90점 이상 "수"
		//80 이상 "우"
		//70 이상"미" 나머지는 양을 출력
		
		
		/*
		if(조건1){
			조건1이 참일 때 실행
		}else if(조건2){
			조건2가 참일 때 실행
		}else if(조건3){
			조건3이 참일 때 실행
		}else{
			조건 1,2,3에 해당 상황이 아니면 실행
		}
		
		*/
		
		/*
		 
		  
		System.out.println("점수를 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		
		if(a>=90) {
			System.out.println("수");
		}else if(a>=80) {
			System.out.println("우");
		}else if(a>=70) {
			System.out.println("미");
		}else {
			System.out.println("양");
		}



		switch(a/10) {
			case 7:{
				System.out.println("미");
				break;
			}
			case 8:{
				System.out.println("우");
				break;
			}
			case 9:{
				System.out.println("수");
				break;
			}
			default:{
				System.out.println("양");
				break;
			}
		}
		
		*/
		
		//월을 입력받아 해당 월이 몇일 인지 출력하시오.
		/*System.out.println("현재 몇월인지 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 1:
				System.out.println(a+"월은 31일 까지 있습니다.");
				break;
			case 2:
				System.out.println(a+"월은 29일 까지 있습니다.");
				break;
			case 3:
				System.out.println(a+"월은 31일 까지 있습니다.");
				break;
			case 4:
				System.out.println(a+"월은 30일 까지 있습니다.");
				break;
			case 5:
				System.out.println(a+"월은 까지 있습니다.");
				break;
			case 6:
				System.out.println(a+"월은 까지 있습니다.");
				break;
			case 7:
				System.out.println(a+"월은 까지 있습니다.");
				break;
			case 8:
				System.out.println(a+"월은 까지 있습니다.");
				break;
			case 9:
				System.out.println(a+"월은 까지 있습니다.");
				break;
			case 10:
				System.out.println(a+"월은 31일 입니다.");
				break;
			case 11:
				System.out.println(a+"월은 30일 입니다.");
				break;
			case 12:
				System.out.println(a+"월은 31일 입니다.");
				break;
			default:
				System.out.println(a+"월은 없습니다. 다시 입력하시오.");
		}
		*/
		
		
		/*System.out.println("가위 바위 보 중 하나를 입력하세요.");
		
		String userData=sc.nextLine();
		java.util.Random rd=new java.util.Random();
		
		int cumputeDataNum=rd.nextInt(3);
		
		String cumputerData="";
		String whoIsWin="";
		
		switch(userData) {
			case "가위":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="가위";
					whoIsWin="비김";
					break;
				case 1:	
					cumputerData="바위";
					whoIsWin="컴퓨터 승";
					break;
				case 2:
					cumputerData="보";
					whoIsWin="사람 승";
				default:
					System.out.println("잘못된 입력 입니다.");
				}
				break;
			case "바위":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="가위";
					whoIsWin="사람 승";
					break;
				case 1:	
					cumputerData="바위";
					whoIsWin="비김";
					break;
				case 2:
					cumputerData="보";
					whoIsWin="사람 승";
					break;
				default:
					System.out.println("잘못된 입력 입니다.");
					
				}
				break;
			case "보":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="가위";
					whoIsWin="컴퓨터 승";
					break;
				case 1:	
					cumputerData="바위";
					whoIsWin="사람 승";
					break;
				case 2:
					cumputerData="보";
					whoIsWin="비김";
					break;
				default:
					System.out.println("잘못된 입력 입니다.");
					
				}
				break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("사람 : "+userData);
		System.out.println("컴퓨터 : "+cumputerData);
		System.out.println("승패 : "+whoIsWin);*/
		
		
		
		//3 숫자를 입력받아 큰 숫자대로 출력하는 프로그램의 순서도와 프로그램을 제출하시오.
		
		System.out.println("무작위 숫자 3개를 입력하시오.");
		
		int a=Integer.parseInt(sc.nextLine());
		int b=Integer.parseInt(sc.nextLine());
		int c=Integer.parseInt(sc.nextLine());

		if(a>b&&a>c) {
			if(b>c) {
				System.out.println("가장 큰 수는 "+a+" 그 다음은 "+b+" 그 다음은 "+c);
			}else if(c>b) {
				System.out.println("가장 큰 수는 "+a+" 그 다음은 "+c+" 그 다음은 "+b);
			}
		}else if(b>a&&b>c){
			if(a>c) {
				System.out.println("가장 큰 수는 "+b+" 그 다음은 "+a+" 그 다음은 "+c);
			}else if(c>a) {
				System.out.println("가장 큰 수는 "+b+" 그 다음은 "+c+" 그 다음은 "+a);
			}
		}else if(c>a&&c>b) {
			if(a>b) {
				System.out.println("가장 큰 수는 "+c+" 그 다음은 "+a+" 그 다음은 "+b);
			}else if(b>a) {
				System.out.println("가장 큰 수는 "+c+" 그 다음은 "+b+" 그 다음은 "+a);
			}
		}
		
		
		
		
		/* switch문에는 실수를 넣을 수 없다.
		
		
		
		*/
		
		
		
	}
}