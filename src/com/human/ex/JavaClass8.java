package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1�� ����
		System.out.println("Ű�� �Է��ϼ���.");
		String str2=sc.nextLine();
		Double i1=Double.parseDouble(str2);
		System.out.println("m�� ��ȯ�� �����"+(i1/100)+"�Դϴ�");
		
		//2�� ����
		System.out.println("������ ����,����,���̸� �Է��Ͻÿ�.");
		String str3=sc.nextLine();
		String str12=sc.nextLine();
		String str13=sc.nextLine();
		Double i2=Double.parseDouble(str3);
		Double i12=Double.parseDouble(str12);
		Double i13=Double.parseDouble(str13);
		double i14=(i2*i12*i13);
		System.out.println("������ ���Ǵ� "+i14+" �Դϴ�.");
	
		//3�� ����
		System.out.println("���� �Է��ϼ���.");
		String str4=sc.nextLine();
		Double i3=Double.parseDouble(str4);
		double i4=(i3*3.3);
		System.out.println(i4+"������ �Դϴ�.");
		
		//4�� ����
		System.out.println("������ �� : ");
		String str5=sc.nextLine();
		System.out.println("�ӵ��� �� : ");
		String str6=sc.nextLine();
		Double i5=Double.parseDouble(str5);
		Double i6=Double.parseDouble(str6);
		double i7=i5*(i6*i6)/2.0;
		System.out.println("������� : "+i7);
		
		//5�� ����
		System.out.println("����� �̸��� �����Դϱ�? : ");
		String str8=sc.nextLine();
		System.out.println("����� ���̴� ����Դϱ�? : ");
		String str9=sc.nextLine();
		System.out.println("����� Ű�� ���Դϱ�? : ");
		String str10=sc.nextLine();
		System.out.println("����� �����Դ� ���Դϱ�? : ");
		String str11=sc.nextLine();
		System.out.println("����� �̸��� "+str8+"�̰�, ���̴� "+str9+", Ű�� "+str10+", �����Դ� "+str11+"�Դϴ�.");
		
	
	

	}
}