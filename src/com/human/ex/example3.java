package com.human.ex;

public class example3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//삼항 연산자 a=A ? B : C;
		//if문과 같다. A가 조건 B가 참 C가 거짓
		//다른 사람들이 자주 사용함
		/*int a=10;
		if(a>0) {
			a=1;
		}else {
			a=-1;
		}
				
		a=(a>0)?1:-1;
				
		System.out.println(a);
		
				
		//두 숫자를 삼항 연산자로 비교
		/*int a=1, b=2;
				
		a=(a<b)?0:3;
				
		System.out.println(a);*/
				
		
		
		//40페이지
		
		int a=3, b=0;
		switch(a+2) {
			case 5:
				b=1;
				default :
					b+=2;
		}
			
		
		//41페이지 1번문제
		
		int count=2;
		int hap=0;
		switch(++count) {
		case 1:
				hap=hap+count++;
			case 2:
				hap=hap+count++;
			case 3:
				hap=hap+count++;
			case 4:
				hap=hap+count++;
			case 5:
				hap=hap+count++;
		}
		System.out.println("hap의 값은 : "+hap);
		
		
		//41페이지 2번문제
		
		System.out.println("현재 몇월인지 입력하시오.");
		int a1=Integer.parseInt(sc.nextLine());
		
		switch(a1) {
			case 12:
				System.out.println("Dec");
				break;
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("Mar");
				break;
			case 4:
				System.out.println("Apr");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("Jul");
				break;
			case 8:
				System.out.println("Aug");
				break;
			case 9:
				System.out.println("Sep");
				break;
			case 10:
				System.out.println("Oct");
				break;
			case 11:
				System.out.println("Nov");
				break;
		}
		
		//42페이지 1번 문제
		
		//정답은 : 4
		
		
		//42페이지 2번 문제
	
		//default
		
		
		//43페이지 1번 문제
		
		int a2=10;
		if (a>=10) {
			int res=a;
			System.out.println(res);
		}else if(b!=10) {
			int res=a/b;
			System.out.println(res);
		}
		
		//43페이지 2번 문제
		
		int a3=Integer.parseInt(sc.nextLine());
		int b1=0;
		switch(a3) {
			case 3:
				b1=1;
				System.out.println(b1);
				break;
			case 5:
				b1=2;
				System.out.println(b1);
				break;
			case 7:
				b1=3;
				System.out.println(b1);
				break;
			default:
				b1=0;
				System.out.println(b1);
		}
		
		
		//43페이지 3번 문제
		
		System.out.println("나이를 입력해주세요.");
		int age=Integer.parseInt(sc.nextLine());
		
		System.out.println("가슴둘레를 입력해주세요.");
		int c=Integer.parseInt(sc.nextLine());
		
		if(age<20) {
			if(c<85) {
				System.out.println("사이즈는 S 입니다.");
			}else if(c<95) {
				System.out.println("사이즈는 M 입니다.");
			}else if(c>=95) {
				System.out.println("사이즈는 L 입니다.");
			}
			}else if(age>=20) {
				if(c<90) {
					System.out.println("사이즈는 S 입니다.");
				}else if(c<100) {
					System.out.println("사이즈는 M 입니다.");
				}else if(c>=100) {
					System.out.println("사이즈는 L 입니다.");
				}
		}
		
		//44페이지 1번 문제
		
		System.out.println("계산 할 값을 입력하시오. 단, 정수만 계산 됨.");
		
		System.out.println("첫 번째 수를 입력하시오.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("사칙연산 중 하나만 입력하시오.");
		String d=sc.nextLine();
		System.out.println("마지막 수를 입력하시오.");
		int c2=Integer.parseInt(sc.nextLine());
		
		int ans=0;
		
		if(d.equals("+")) {
			ans=c1+c2;
		}else if(d.equals("-")) {
			ans=c1-c2;
		}else if(d.equals("/")) {
			ans=c1/c2;
		}else if(d.equals("*")) {
			ans=c1*c2;
		}
		
		
		//44페이지 2번 문제
		
		System.out.println("당신의 가정형편을 입력하세요.");
		int rich=Integer.parseInt(sc.nextLine());
		System.out.println("당신의 학점을 입력하세요.");
		double grade=Double.parseDouble(sc.nextLine());
		
		int g=100/2;
		int g1=100/4;
		
		
		if(rich<100) {
			System.out.println("다음 학기 납입할 등록금은 "+g1+"만원 입니다.");
		}else if(rich>=100) {
			if(grade>=4.0) {
				System.out.println("다음 학기 납입할 등록금은 "+g+"만원 입니다.");
			}else {
				System.out.println("장학금 대상자가 아닙니다.");
			}
		}
		
		//45페이지 1번 문제
		
		System.out.println("전기 사용량을 입력");
		int kw = sc.nextInt();
		double won=0;
		if(kw <= 100){
			won=(370 + kw*52) + (370 + kw*52)*0.09;
		}
		else if(kw <= 200){
			won=(660 + kw*88.5)+(660 + kw*88.5)*0.09;
		}
		else if(kw <= 300){
			won=(1130 + kw*127.8)+(1130 + kw*127.8)*0.09;
		}
		else if(kw <= 400){
			won=(2710 + kw*184.3)+(2710 + kw*184.3)*0.09;
		}
		else if(kw <= 500){
			won=(5130 + kw*274.3)+(5130 + kw*274.3)*0.09;
		}
		else if(kw < 500){
			won=(9330 + kw*494)+(9330 + kw*494)*0.09;
		}

		System.out.println(String.format("전기 요금은 %.0f원 입니다.", won));
		
		
		
		
		
		
		
		//45페이지 2번 문제
		
		System.out.println("무작위 숫자 3개를 입력하시오.");
		
		int aa=Integer.parseInt(sc.nextLine());
		int bb=Integer.parseInt(sc.nextLine());
		int cc=Integer.parseInt(sc.nextLine());

		if(aa>bb&&aa>cc) {
			if(bb>cc) {
				System.out.println("가장 큰 수는 "+aa+" 그 다음은 "+bb+" 그 다음은 "+cc);
			}else if(cc>bb) {
				System.out.println("가장 큰 수는 "+aa+" 그 다음은 "+cc+" 그 다음은 "+bb);
			}
		}else if(bb>aa&&bb>cc){
			if(aa>cc) {
				System.out.println("가장 큰 수는 "+bb+" 그 다음은 "+aa+" 그 다음은 "+cc);
			}else if(cc>aa) {
				System.out.println("가장 큰 수는 "+bb+" 그 다음은 "+cc+" 그 다음은 "+aa);
			}
		}else if(cc>aa&&cc>bb) {
			if(aa>bb) {
				System.out.println("가장 큰 수는 "+cc+" 그 다음은 "+aa+" 그 다음은 "+bb);
			}else if(bb>aa) {
				System.out.println("가장 큰 수는 "+cc+" 그 다음은 "+bb+" 그 다음은 "+aa);
			}
		}
		
		//46페이지 문제
		
		System.out.println("무작위 숫자 3개를 입력하시오.");
		
		int i=Integer.parseInt(sc.nextLine());
		int i1=Integer.parseInt(sc.nextLine());
		int i2=Integer.parseInt(sc.nextLine());

		if(i<i1&&i<i2) {
			if(i1<i2) {
				System.out.println("가장 작은 수는 "+i+" 그 다음은 "+i1+" 그 다음은 "+i2);
			}else if(i2<i1) {
				System.out.println("가장 작은 수는 "+i+" 그 다음은 "+i2+" 그 다음은 "+i1);
			}
		}else if(i1<i&&b<c){
			if(i<i2) {
				System.out.println("가장 작은 수는 "+i1+" 그 다음은 "+i+" 그 다음은 "+i2);
			}else if(i2<i) {
				System.out.println("가장 작은 수는 "+i1+" 그 다음은 "+i2+" 그 다음은 "+i);
			}
		}else if(i2<i&&c<i1) {
			if(i<i1) {
				System.out.println("가장 작은 수는 "+i2+" 그 다음은 "+i+" 그 다음은 "+b);
			}else if(i1<i) {
				System.out.println("가장 작은 수는 "+i2+" 그 다음은 "+b+" 그 다음은 "+i);
			}
		}
		
		
		//46페이지 2번 문제
		
		System.out.println("가위 바위 보.");
		System.out.println("0 : 가위, 1 : 바위, 2 : 보");
		
		System.out.println("본인이 낼 숫자를 입력하시오.");
		int aa1=Integer.parseInt(sc.nextLine());
		
		switch(aa1) {
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
		
		java.util.Random ran=new java.util.Random();
		int a12=ran.nextInt(3);
		System.out.println("컴퓨터가 낸 숫자는 "+a1);
		
		
		switch(a12) {
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
		
		if(aa1==a12) {
			System.out.println("비겼습니다.");
		}
		if(aa1>a12) {
			System.out.println("당신이 이겼습니다.");
		}
		if(aa1==0&&a12==2){
			System.out.println("당신이 이겼습니다.");
		}else {
			if(aa1<a12) {
				System.out.println("당신이 졌습니다.");
			}
		}
		
		//47페이지 1번 문제
		
		System.out.println("A에 넣을 값을 입력하시오.");
		int A=Integer.parseInt(sc.nextLine());
		System.out.println("B에 넣을 값을 입력하시오.");
		int B=Integer.parseInt(sc.nextLine());
		System.out.println("C에 넣을 값을 입력하시오.");
		int C=Integer.parseInt(sc.nextLine());
		
		if(A>B) {
			if(A>C) {
				System.out.println(A);
			}else {
				System.out.println(C);
			}
		}else if(B>C) {
			System.out.println(B);
		}else {
			System.out.println(C);
		}
		
		//47페이지 2번 문제
		
		System.out.println("국어 성적을 입력하세요.");
		int kor=Integer.parseInt(sc.nextLine());
		System.out.println("영어 성적을 입력하세요.");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.println("수학 성적을 입력하세요.");
		int mat=Integer.parseInt(sc.nextLine());
		
		double ave=(double)(kor+eng+mat)/3;
		
		if(ave>=60) {
			if(kor>=60&&eng>=60&&mat>=60) {
				System.out.println("합격");
			}else {
				System.out.println("과락 탈락");
			}
		}else {
			System.out.println("평균미달 탈락");
		}
		
		
	}
}