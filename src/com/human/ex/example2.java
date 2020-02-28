package com.human.ex;

import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		
		//배열 : 같은 자료형을 한번에 여러개 선언할 때 사용
		//int [] arrInt=new int[5];
		//배열의 값에 접근하려면 인덱스를 사용한다.  arrInt[0] arrInt[1]
		//인덱스는 0부터 시작한다. new int[5]; 0~4  arrInt[5] X
		//new 로 할당한 애들은 참조 자료형이다. 크기가 명확하게 정해지지 않음.
		//[] : 주소 연산자
		
		boolean b1=true;
		boolean b2=false;
		
		boolean[]bArray=new boolean[4]; //0~3
		bArray[0]=false;
		bArray[1]=b1;
		bArray[2]=bArray[0];
		bArray[3]=true;
		System.out.println(bArray[0]+":"+bArray[1]);
		
		System.out.println(java.util.Arrays.toString(bArray));
		
		int i1=5;
		int i2=23;
		
		int iArray[]=new int[4];
		
		iArray[0]=1;
		iArray[1]=i1;
		iArray[2]=iArray[0]+iArray[1];
		iArray[3]=iArray[2]+4;
		
		System.out.println(Arrays.toString(iArray));
		
		
		
		double d1=5.3;
		double d2=23.2;
		
		double dArray[]=new double[4];
		
		dArray[0]=1;
		dArray[1]=d1;
		dArray[2]=dArray[0]+dArray[1];
		dArray[3]=dArray[2]+4.4;
		
		System.out.println(Arrays.toString(dArray));
		
		String str1="hello1";
		String str2=new String("hello2");
		String[]sArray=new String[4];
		sArray[0]=new String("hello1");
		sArray[1]=str2+str1;
		sArray[2]=sArray[0];
		sArray[3]=sArray[0]+"world";
		System.out.println(sArray);
		
		
		
		
		
		
		
	}
}