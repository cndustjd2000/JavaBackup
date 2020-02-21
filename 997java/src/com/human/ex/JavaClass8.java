package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1번 문제
		System.out.println("키를 입력하세요.");
		String str2=sc.nextLine();
		Double i1=Double.parseDouble(str2);
		System.out.println("m로 변환된 결과는"+(i1/100)+"입니다");
		
		//2번 문제
		System.out.println("상자의 가로,세로,높이를 입력하시오.");
		String str3=sc.nextLine();
		String str12=sc.nextLine();
		String str13=sc.nextLine();
		Double i2=Double.parseDouble(str3);
		Double i12=Double.parseDouble(str12);
		Double i13=Double.parseDouble(str13);
		double i14=(i2*i12*i13);
		System.out.println("상자의 부피는 "+i14+" 입니다.");
	
		//3번 문제
		System.out.println("평을 입력하세요.");
		String str4=sc.nextLine();
		Double i3=Double.parseDouble(str4);
		double i4=(i3*3.3);
		System.out.println(i4+"평방미터 입니다.");
		
		//4번 문제
		System.out.println("질량의 값 : ");
		String str5=sc.nextLine();
		System.out.println("속도의 값 : ");
		String str6=sc.nextLine();
		Double i5=Double.parseDouble(str5);
		Double i6=Double.parseDouble(str6);
		double i7=i5*(i6*i6)/2.0;
		System.out.println("운동에너지 : "+i7);
		
		//5번 문제
		System.out.println("당신의 이름은 무엇입니까? : ");
		String str8=sc.nextLine();
		System.out.println("당신의 나이는 몇살입니까? : ");
		String str9=sc.nextLine();
		System.out.println("당신의 키는 얼마입니까? : ");
		String str10=sc.nextLine();
		System.out.println("당신의 몸무게는 얼마입니까? : ");
		String str11=sc.nextLine();
		System.out.println("당신의 이름은 "+str8+"이고, 나이는 "+str9+", 키는 "+str10+", 몸무게는 "+str11+"입니다.");
		
	
	

	}
}