package com.human.ex;

public class JavaStart11 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//8������
		
		System.out.println("x�� ���� �� ���ڸ� �Է��Ͻÿ�.");
		
		int x=Integer.parseInt(sc.nextLine());
		if(x%2==0) {
			System.out.println("x:¦��");
		}else {
			System.out.println("x:Ȧ��");
		}
		
		//9������ 1�� ����
		
		System.out.println("������ �Է��ϼ���.");
		
		int a=Integer.parseInt(sc.nextLine());
		if(a%2==0) {
			System.out.println(a+"��(��) ¦�� �Դϴ�.");
		}else {
			System.out.println(a+"��(��) Ȧ�� �Դϴ�.");
		}
		
		//9������ 2�� ����
		
		System.out.println("������ �Է��ϼ���.");
		
		int ab=Integer.parseInt(sc.nextLine());
		if(ab%3==0) {
			System.out.println(ab+"��(��) 3�� ����� �½��ϴ�.");
		}else {
			System.out.println(ab+"��(��) 3�� ����� �ƴմϴ�.");
		}
		
		System.out.println("������ �Է��ϼ���.");
		
		int ab1=Integer.parseInt(sc.nextLine());
		if(ab1%7==0) {
			System.out.println(ab1+"��(��) 7�� ����� �½��ϴ�.");
		}else {
			System.out.println(ab1+"��(��) 7�� ����� �ƴմϴ�.");
		}
		
		System.out.println("������ �Է��ϼ���.");
		
		int ab2=Integer.parseInt(sc.nextLine());
		if(ab2%4==0) {
			System.out.println(ab2+"��(��) 4�� ����� �½��ϴ�.");
		}else {
			System.out.println(ab2+"��(��) 4�� ����� �ƴմϴ�.");
		}
		
		//9������ 3�� ����
		
		System.out.println("�� ���� ���� �Է��Ͻÿ�.");
		int a1=Integer.parseInt(sc.nextLine());
		int a2=Integer.parseInt(sc.nextLine());
		if(a1==a2) {
			System.out.println(a1+"��"+a2+"�� ���� �� �Դϴ�.");
		}else {
			if(a1<a2) {
				System.out.println(a1+"����"+a2+"��(��) �� Ů�ϴ�.");
			}else {
				System.out.println(a2+"����"+a1+"��(��) �� Ů�ϴ�.");
			}
		}
		
		//10������ 1�� ����
		
		System.out.println("������ �Է��Ͻÿ�.");
		int a3=Integer.parseInt(sc.nextLine());
		
		System.out.println("������ �Է��Ͻÿ�.");
		int a4=Integer.parseInt(sc.nextLine());
		
		if(a3%a4==0) {
			System.out.println("��� �Դϴ�.");
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
		
		//10������ 2�� ����
		
		System.out.println("������ �Է��Ͻÿ�.");
		int a5=Integer.parseInt(sc.nextLine());
		
		if(a5<=10) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		//10������ 3�� ����
		
		System.out.println("������ �Է��Ͻÿ�.");
		int a6=Integer.parseInt(sc.nextLine());
		
		if(a6<0) {
			System.out.println(a6+"��(��) �����Դϴ�.");
		}else {
			
		}
		
		System.out.println("������ �Է��Ͻÿ�.");
		int a7=Integer.parseInt(sc.nextLine());
		
		if(a7<0) {
			System.out.println(a7+"��(��) �����Դϴ�.");
		}
		
		
		//11������ 1�� ����
		
		System.out.println("A���� C������ ���ڸ� �Է��Ͻÿ�.");
		String str=sc.nextLine();
		
		String b=new String("A");
		String b1=new String("B");
		String b2=new String("C");
		
		if(str.equals(b)) {
			System.out.println("�����Դϴ�.");
		}else {
			if(str.equals(b1)) {
				System.out.println("�����Դϴ�.");
			}else {
				if(str.equals(b2)) {
					System.out.println("�����Դϴ�.");
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
			}
		}
		
		//11������ 2�� ����
		
		System.out.println("���� �ð�(24�� ����)�� ���̸� �Է��ϼ���.");
		int b3=Integer.parseInt(sc.nextLine());
		int b4=Integer.parseInt(sc.nextLine());
		
		if(b3<18) {
			if(b4<13) {
				System.out.println("����� 25000�� �Դϴ�.");
			}else {
				System.out.println("����� 34000�� �Դϴ�.");
			}
		}else {
			System.out.println("����� 10000�� �Դϴ�.");
		}
		
		//12������ 1�� ����
		
		System.out.println("���� ������ �Է��ϼ���.");
		int b5=Integer.parseInt(sc.nextLine());
		System.out.println("���� ������ �Է��ϼ���.");
		int b6=Integer.parseInt(sc.nextLine());
		System.out.println("���� ������ �Է��ϼ���.");
		int b7=Integer.parseInt(sc.nextLine());
		
		double c=(double)(b5+b6+b7)/3;
		
		if(c>=80) {
			System.out.println("��ռ�����"+c);
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("��ռ�����"+c);
			System.out.println("���հ��Դϴ�.");
		}
		
		//12������ 2�� ����
		
		System.out.println("ù ��° ���� �Է��ϼ���.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c2=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c3=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c4=Integer.parseInt(sc.nextLine());
		System.out.println("�ټ� ��° ���� �Է��ϼ���.");
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
		System.out.println("���� ū ����:"+max);
		System.out.println("���� ���� ����:"+min);
		
		//13������ 3�� ����
		
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�.");
		int d=Integer.parseInt(sc.nextLine());
		
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�.");
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
		
		//13������ 2�� ����
		
		System.out.println("x1�� ���� ���� �Է��Ͻÿ�.");
		int x1=Integer.parseInt(sc.nextLine());
		if(x1>0) {
			System.out.println(7*x1+2);
		}else {
			System.out.println((x1*x1*x1)-(9*x1)+2);
		}
		
		
		//14������ ����
		
		System.out.println("�����Ը� �Է��ϼ���.");
		double kg=Integer.parseInt(sc.nextLine());
		System.out.println("Ű�� �Է��ϼ���.");
		double cm=sc.nextDouble();
		
		double m=cm/100;
		double bmi=kg/(m*m);
		
		String str6=String.format("%.1f", bmi);
		System.out.println("����� bmi�� "+str6);
		
		if(bmi<20) {
			System.out.println("��ü��");
		}else {
			if(bmi>25) {
				System.out.println("��ü��");
			}else {
				System.out.println("ǥ��ü��, �����Դϴ�.");
			}
		}
		
		//15������ ����
		
		System.out.println("����� Ű�� �Է��Ͻÿ�.");
		int tall=Integer.parseInt(sc.nextLine());
		
		System.out.println("����� Ű�� "+tall+"�̽ñ���.");
		if(tall>175) {
			System.out.println("Ű�� ũ�ñ���.");
		}
		sc.close();
	}
}