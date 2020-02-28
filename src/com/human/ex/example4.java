package com.human.ex;

import java.util.Arrays;

class Cat1{
	public int age=0;
	public String name="없음";
	
	@Override
	public String toString() {

		return "Cat [age=" + age + ", name=" + name + "]";
	}

}

public class example4 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,10};//배열 초기화
		//0~4 arr[5] X
		//arr1={2,3,4}; 초기화는 상위와 같이 선언할 때 1번 할 수 있다. 선언 후에는 초기화 할 수 없다.
		//arr1=new int[3];   선언 이후 새로 할당 할 수 있다.
		//arr1=new int[5];   새로 할당하면 기존 데이터를 arr1으로 접근할 수 없다.
		
		int arr2[]=arr1;
		arr2=arr1;
		arr1[0]=100;
		arr2[1]=200;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		
		//서로 값이 분리되어 복사하는 배열을 만들어보자.
		
		int ar1[]= {1,2,3};
		//int ar2[]=new int[3];
		int ar2[]=new int[ar1.length]; //.length는 배열의 크기를 의미 함.
		ar2[0]=ar1[0];
		ar2[1]=ar1[1];
		ar2[2]=ar1[2];
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		ar1[2]=10; ar2[1]=20;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		Cat1 cat1=new Cat1();
		cat1.name="고1";
		cat1.age=18;
		
		Cat1 cat2=cat1;
		cat2.name="고2";
		cat2.age=19;
		
		Cat1 cat3=new Cat1();
		cat3.name="고3";
		cat3.age=20;
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		
		//Cat 클래스 array를 만들어 사용해보자.
		
		Cat1[] cArr=new Cat1[5];
		//Cat a; 스텍에 주소를 저장할 수 있는 공간 a
		//Cat a=new Cat(); 스텍에 주소를 저장할 수 있는 공간 a와 실제 고양이 데이터를 저장할 수 있는 공간이 힙에도 생김
		
		//cArr[0].age=10;//null point exception
		cArr[0]=new Cat1();
		
		cArr[0].age=11;
		cArr[0].name="고1";
		cArr[1]=cat1;
		cArr[2]=cat2;
		
		System.out.println(Arrays.toString(cArr));
		
		//객체배열의 복사는 유튜브 참조
		
		//반복문 정리 1~20까지의 합을 구하시오
		//while문, for문, do while문, 
		
		
		/*int sum=0;
		int count=1;	//초기값
		while(count<=10) {//비교값
			sum=sum+count;
			count++;//변환값
		}
		System.out.println(sum);*/
		
		/*int sum=0;
		for(int i=1;i<11;i++){
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		
		
		/*do while문
		 do{
		 	반복문구
		 }while(조건식);
		 */
		
		/*int sum=0;
		int count=1;
		do {
			sum=sum+count;
			count++;
		}while(count<=10);
		System.out.println(sum);*/
		
		
		
		/*break는 처음 접한 반복문을 빠져나가게 한다.
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}*/
		
		//continue를 만나면 반복문의 변환값 부분으로 이동한다.
		for(int i=0;i<10;i++) {
			
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}