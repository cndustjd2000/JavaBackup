package com.human.ex;

import java.util.Arrays;

class Cat1{
	public int age=0;
	public String name="����";
	
	@Override
	public String toString() {

		return "Cat [age=" + age + ", name=" + name + "]";
	}

}

public class example4 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,10};//�迭 �ʱ�ȭ
		//0~4 arr[5] X
		//arr1={2,3,4}; �ʱ�ȭ�� ������ ���� ������ �� 1�� �� �� �ִ�. ���� �Ŀ��� �ʱ�ȭ �� �� ����.
		//arr1=new int[3];   ���� ���� ���� �Ҵ� �� �� �ִ�.
		//arr1=new int[5];   ���� �Ҵ��ϸ� ���� �����͸� arr1���� ������ �� ����.
		
		int arr2[]=arr1;
		arr2=arr1;
		arr1[0]=100;
		arr2[1]=200;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		
		//���� ���� �и��Ǿ� �����ϴ� �迭�� ������.
		
		int ar1[]= {1,2,3};
		//int ar2[]=new int[3];
		int ar2[]=new int[ar1.length]; //.length�� �迭�� ũ�⸦ �ǹ� ��.
		ar2[0]=ar1[0];
		ar2[1]=ar1[1];
		ar2[2]=ar1[2];
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		ar1[2]=10; ar2[1]=20;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		Cat1 cat1=new Cat1();
		cat1.name="��1";
		cat1.age=18;
		
		Cat1 cat2=cat1;
		cat2.name="��2";
		cat2.age=19;
		
		Cat1 cat3=new Cat1();
		cat3.name="��3";
		cat3.age=20;
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		
		//Cat Ŭ���� array�� ����� ����غ���.
		
		Cat1[] cArr=new Cat1[5];
		//Cat a; ���ؿ� �ּҸ� ������ �� �ִ� ���� a
		//Cat a=new Cat(); ���ؿ� �ּҸ� ������ �� �ִ� ���� a�� ���� ����� �����͸� ������ �� �ִ� ������ ������ ����
		
		//cArr[0].age=10;//null point exception
		cArr[0]=new Cat1();
		
		cArr[0].age=11;
		cArr[0].name="��1";
		cArr[1]=cat1;
		cArr[2]=cat2;
		
		System.out.println(Arrays.toString(cArr));
		
		//��ü�迭�� ����� ��Ʃ�� ����
		
		//�ݺ��� ���� 1~20������ ���� ���Ͻÿ�
		//while��, for��, do while��, 
		
		
		/*int sum=0;
		int count=1;	//�ʱⰪ
		while(count<=10) {//�񱳰�
			sum=sum+count;
			count++;//��ȯ��
		}
		System.out.println(sum);*/
		
		/*int sum=0;
		for(int i=1;i<11;i++){
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		
		
		/*do while��
		 do{
		 	�ݺ�����
		 }while(���ǽ�);
		 */
		
		/*int sum=0;
		int count=1;
		do {
			sum=sum+count;
			count++;
		}while(count<=10);
		System.out.println(sum);*/
		
		
		
		/*break�� ó�� ���� �ݺ����� ���������� �Ѵ�.
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}*/
		
		//continue�� ������ �ݺ����� ��ȯ�� �κ����� �̵��Ѵ�.
		for(int i=0;i<10;i++) {
			
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}