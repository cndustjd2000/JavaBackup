package com.human.ex;

public class example {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		/*System.out.println("���ڸ� �Է��Ͻÿ�.");
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
				System.out.println("���� ��");
				break;
			}
		}
		
		
		
		System.out.println("������ �˰���� ���� ���ڷ� �Է��Ͻÿ�.");
		int b=Integer.parseInt(sc.nextLine());
		
		switch(b) {
			case 12: case 1: case 2:{
				System.out.println("�ܿ�");
				break;
			}
			case 3: case 4: case 5:{
				System.out.println("��");
				break;
			}
			case 6: case 7: case 8:{
				System.out.println("����");
				break;
			}
			case 9: case 10: case 11:{
				System.out.println("����");
				break;
			}
			default:{
				System.out.println("���� �� �Դϴ�.");
				break;
			}
		}
		
		
		sc.close();*/
		
		
		java.util.Random ran=new java.util.Random();
		
		//int a=ran.nextInt(5); >>0~4���� ���
		//int a=ran.nextInt(5)+5; >>5~9���� ���
		
		/*System.out.println("���� ���� ��.");
		System.out.println("0 : ����, 1 : ����, 2 : ��");
		
		System.out.println("������ �� ���ڸ� �Է��Ͻÿ�.");
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 0:{
				System.out.println("������ ���̽��ϴ�.");
				break;
			}
			case 1:{
				System.out.println("������ ���̽��ϴ�.");
				break;
			}
			case 2:{
				System.out.println("���� ���̽��ϴ�.");
				break;
			}
		}
		
		int a1=ran.nextInt(3);
		System.out.println("��ǻ�Ͱ� �� ���ڴ� "+a1);
		
		
		switch(a1) {
			case 0:{
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			}
			case 1:{
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				break;
			}
			case 2:{
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				break;
				}
		
			}
		
		if(a==a1) {
			System.out.println("�����ϴ�.");
		}
		if(a>a1) {
			System.out.println("����� �̰���ϴ�.");
		}
		if(a==0&&a1==2){
			System.out.println("����� �̰���ϴ�.");
		}else {
			if(a<a1) {
				System.out.println("����� �����ϴ�.");
			}
		}
		
		*/
		
		boolean isDay=true;//���̸� true
		boolean isStar=true;//true�� �� �� �׸���
		boolean isCloud=true;
		
		/*String nowDate="��";
		if(isDay) {
			System.out.println("��");
			if(isCloud) {
				System.out.println("����");
			}
		}else {
			System.out.println("��");
			if(isStar) {
				System.out.println("��");
			}
		}
		
		if(isDay) {
			System.out.println("��");
			
		}else {
			System.out.println("��");
		}
		
		if(isDay&&isCloud) { //and ������,  isDay==true, isCloud==true �϶� ���
		if(isDay||isCloud) { or ������
			System.out.println("����");
		}
		
		if(isDay==false&&isStar==true) {
			System.out.println("��");
		}
		
		(����1)&&(����2)
		����1�� false�̸� ����2�� ó������ ����
		
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
		
		
		System.out.println("���� �Ǵ� õ���� �Է��Ͻÿ�.");
		String str1=sc.nextLine();
		
		System.out.println("����� ���̸� �Է��Ͻÿ�.");
		int c1=Integer.parseInt(sc.nextLine());
		if(str1.equals("����") || str1.equals("õ��")) {
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
			System.out.println("1�� ��й�ȣ�� 2�� ��й�ȣ�� ��ġ�մϴ�");
		}else{
			System.out.println("��й�ȣ�� �������� �ʽ��ϴ�.");
		}
		*/
		
		//else if
		//90�� �̻� "��"
		//80 �̻� "��"
		//70 �̻�"��" �������� ���� ���
		
		
		/*
		if(����1){
			����1�� ���� �� ����
		}else if(����2){
			����2�� ���� �� ����
		}else if(����3){
			����3�� ���� �� ����
		}else{
			���� 1,2,3�� �ش� ��Ȳ�� �ƴϸ� ����
		}
		
		*/
		
		/*
		 
		  
		System.out.println("������ �Է��Ͻÿ�.");
		int a=Integer.parseInt(sc.nextLine());
		
		if(a>=90) {
			System.out.println("��");
		}else if(a>=80) {
			System.out.println("��");
		}else if(a>=70) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}



		switch(a/10) {
			case 7:{
				System.out.println("��");
				break;
			}
			case 8:{
				System.out.println("��");
				break;
			}
			case 9:{
				System.out.println("��");
				break;
			}
			default:{
				System.out.println("��");
				break;
			}
		}
		
		*/
		
		//���� �Է¹޾� �ش� ���� ���� ���� ����Ͻÿ�.
		/*System.out.println("���� ������� �Է��Ͻÿ�.");
		int a=Integer.parseInt(sc.nextLine());
		
		switch(a) {
			case 1:
				System.out.println(a+"���� 31�� ���� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println(a+"���� 29�� ���� �ֽ��ϴ�.");
				break;
			case 3:
				System.out.println(a+"���� 31�� ���� �ֽ��ϴ�.");
				break;
			case 4:
				System.out.println(a+"���� 30�� ���� �ֽ��ϴ�.");
				break;
			case 5:
				System.out.println(a+"���� ���� �ֽ��ϴ�.");
				break;
			case 6:
				System.out.println(a+"���� ���� �ֽ��ϴ�.");
				break;
			case 7:
				System.out.println(a+"���� ���� �ֽ��ϴ�.");
				break;
			case 8:
				System.out.println(a+"���� ���� �ֽ��ϴ�.");
				break;
			case 9:
				System.out.println(a+"���� ���� �ֽ��ϴ�.");
				break;
			case 10:
				System.out.println(a+"���� 31�� �Դϴ�.");
				break;
			case 11:
				System.out.println(a+"���� 30�� �Դϴ�.");
				break;
			case 12:
				System.out.println(a+"���� 31�� �Դϴ�.");
				break;
			default:
				System.out.println(a+"���� �����ϴ�. �ٽ� �Է��Ͻÿ�.");
		}
		*/
		
		
		/*System.out.println("���� ���� �� �� �ϳ��� �Է��ϼ���.");
		
		String userData=sc.nextLine();
		java.util.Random rd=new java.util.Random();
		
		int cumputeDataNum=rd.nextInt(3);
		
		String cumputerData="";
		String whoIsWin="";
		
		switch(userData) {
			case "����":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="����";
					whoIsWin="���";
					break;
				case 1:	
					cumputerData="����";
					whoIsWin="��ǻ�� ��";
					break;
				case 2:
					cumputerData="��";
					whoIsWin="��� ��";
				default:
					System.out.println("�߸��� �Է� �Դϴ�.");
				}
				break;
			case "����":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="����";
					whoIsWin="��� ��";
					break;
				case 1:	
					cumputerData="����";
					whoIsWin="���";
					break;
				case 2:
					cumputerData="��";
					whoIsWin="��� ��";
					break;
				default:
					System.out.println("�߸��� �Է� �Դϴ�.");
					
				}
				break;
			case "��":
				switch(cumputeDataNum) {
				case 0:
					cumputerData="����";
					whoIsWin="��ǻ�� ��";
					break;
				case 1:	
					cumputerData="����";
					whoIsWin="��� ��";
					break;
				case 2:
					cumputerData="��";
					whoIsWin="���";
					break;
				default:
					System.out.println("�߸��� �Է� �Դϴ�.");
					
				}
				break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		System.out.println("��� : "+userData);
		System.out.println("��ǻ�� : "+cumputerData);
		System.out.println("���� : "+whoIsWin);*/
		
		
		
		//3 ���ڸ� �Է¹޾� ū ���ڴ�� ����ϴ� ���α׷��� �������� ���α׷��� �����Ͻÿ�.
		
		System.out.println("������ ���� 3���� �Է��Ͻÿ�.");
		
		int a=Integer.parseInt(sc.nextLine());
		int b=Integer.parseInt(sc.nextLine());
		int c=Integer.parseInt(sc.nextLine());

		if(a>b&&a>c) {
			if(b>c) {
				System.out.println("���� ū ���� "+a+" �� ������ "+b+" �� ������ "+c);
			}else if(c>b) {
				System.out.println("���� ū ���� "+a+" �� ������ "+c+" �� ������ "+b);
			}
		}else if(b>a&&b>c){
			if(a>c) {
				System.out.println("���� ū ���� "+b+" �� ������ "+a+" �� ������ "+c);
			}else if(c>a) {
				System.out.println("���� ū ���� "+b+" �� ������ "+c+" �� ������ "+a);
			}
		}else if(c>a&&c>b) {
			if(a>b) {
				System.out.println("���� ū ���� "+c+" �� ������ "+a+" �� ������ "+b);
			}else if(b>a) {
				System.out.println("���� ū ���� "+c+" �� ������ "+b+" �� ������ "+a);
			}
		}
		
		
		
		
		/* switch������ �Ǽ��� ���� �� ����.
		
		
		
		*/
		
		
		
	}
}