package com.human.ex;

public class example3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//���� ������ a=A ? B : C;
		//if���� ����. A�� ���� B�� �� C�� ����
		//�ٸ� ������� ���� �����
		/*int a=10;
		if(a>0) {
			a=1;
		}else {
			a=-1;
		}
				
		a=(a>0)?1:-1;
				
		System.out.println(a);
		
				
		//�� ���ڸ� ���� �����ڷ� ��
		/*int a=1, b=2;
				
		a=(a<b)?0:3;
				
		System.out.println(a);*/
				
		
		
		//40������
		
		int a=3, b=0;
		switch(a+2) {
			case 5:
				b=1;
				default :
					b+=2;
		}
			
		
		//41������ 1������
		
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
		System.out.println("hap�� ���� : "+hap);
		
		
		//41������ 2������
		
		System.out.println("���� ������� �Է��Ͻÿ�.");
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
		
		//42������ 1�� ����
		
		//������ : 4
		
		
		//42������ 2�� ����
	
		//default
		
		
		//43������ 1�� ����
		
		int a2=10;
		if (a>=10) {
			int res=a;
			System.out.println(res);
		}else if(b!=10) {
			int res=a/b;
			System.out.println(res);
		}
		
		//43������ 2�� ����
		
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
		
		
		//43������ 3�� ����
		
		System.out.println("���̸� �Է����ּ���.");
		int age=Integer.parseInt(sc.nextLine());
		
		System.out.println("�����ѷ��� �Է����ּ���.");
		int c=Integer.parseInt(sc.nextLine());
		
		if(age<20) {
			if(c<85) {
				System.out.println("������� S �Դϴ�.");
			}else if(c<95) {
				System.out.println("������� M �Դϴ�.");
			}else if(c>=95) {
				System.out.println("������� L �Դϴ�.");
			}
			}else if(age>=20) {
				if(c<90) {
					System.out.println("������� S �Դϴ�.");
				}else if(c<100) {
					System.out.println("������� M �Դϴ�.");
				}else if(c>=100) {
					System.out.println("������� L �Դϴ�.");
				}
		}
		
		//44������ 1�� ����
		
		System.out.println("��� �� ���� �Է��Ͻÿ�. ��, ������ ��� ��.");
		
		System.out.println("ù ��° ���� �Է��Ͻÿ�.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("��Ģ���� �� �ϳ��� �Է��Ͻÿ�.");
		String d=sc.nextLine();
		System.out.println("������ ���� �Է��Ͻÿ�.");
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
		
		
		//44������ 2�� ����
		
		System.out.println("����� ���������� �Է��ϼ���.");
		int rich=Integer.parseInt(sc.nextLine());
		System.out.println("����� ������ �Է��ϼ���.");
		double grade=Double.parseDouble(sc.nextLine());
		
		int g=100/2;
		int g1=100/4;
		
		
		if(rich<100) {
			System.out.println("���� �б� ������ ��ϱ��� "+g1+"���� �Դϴ�.");
		}else if(rich>=100) {
			if(grade>=4.0) {
				System.out.println("���� �б� ������ ��ϱ��� "+g+"���� �Դϴ�.");
			}else {
				System.out.println("���б� ����ڰ� �ƴմϴ�.");
			}
		}
		
		//45������ 1�� ����
		
		System.out.println("���� ��뷮�� �Է�");
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

		System.out.println(String.format("���� ����� %.0f�� �Դϴ�.", won));
		
		
		
		
		
		
		
		//45������ 2�� ����
		
		System.out.println("������ ���� 3���� �Է��Ͻÿ�.");
		
		int aa=Integer.parseInt(sc.nextLine());
		int bb=Integer.parseInt(sc.nextLine());
		int cc=Integer.parseInt(sc.nextLine());

		if(aa>bb&&aa>cc) {
			if(bb>cc) {
				System.out.println("���� ū ���� "+aa+" �� ������ "+bb+" �� ������ "+cc);
			}else if(cc>bb) {
				System.out.println("���� ū ���� "+aa+" �� ������ "+cc+" �� ������ "+bb);
			}
		}else if(bb>aa&&bb>cc){
			if(aa>cc) {
				System.out.println("���� ū ���� "+bb+" �� ������ "+aa+" �� ������ "+cc);
			}else if(cc>aa) {
				System.out.println("���� ū ���� "+bb+" �� ������ "+cc+" �� ������ "+aa);
			}
		}else if(cc>aa&&cc>bb) {
			if(aa>bb) {
				System.out.println("���� ū ���� "+cc+" �� ������ "+aa+" �� ������ "+bb);
			}else if(bb>aa) {
				System.out.println("���� ū ���� "+cc+" �� ������ "+bb+" �� ������ "+aa);
			}
		}
		
		//46������ ����
		
		System.out.println("������ ���� 3���� �Է��Ͻÿ�.");
		
		int i=Integer.parseInt(sc.nextLine());
		int i1=Integer.parseInt(sc.nextLine());
		int i2=Integer.parseInt(sc.nextLine());

		if(i<i1&&i<i2) {
			if(i1<i2) {
				System.out.println("���� ���� ���� "+i+" �� ������ "+i1+" �� ������ "+i2);
			}else if(i2<i1) {
				System.out.println("���� ���� ���� "+i+" �� ������ "+i2+" �� ������ "+i1);
			}
		}else if(i1<i&&b<c){
			if(i<i2) {
				System.out.println("���� ���� ���� "+i1+" �� ������ "+i+" �� ������ "+i2);
			}else if(i2<i) {
				System.out.println("���� ���� ���� "+i1+" �� ������ "+i2+" �� ������ "+i);
			}
		}else if(i2<i&&c<i1) {
			if(i<i1) {
				System.out.println("���� ���� ���� "+i2+" �� ������ "+i+" �� ������ "+b);
			}else if(i1<i) {
				System.out.println("���� ���� ���� "+i2+" �� ������ "+b+" �� ������ "+i);
			}
		}
		
		
		//46������ 2�� ����
		
		System.out.println("���� ���� ��.");
		System.out.println("0 : ����, 1 : ����, 2 : ��");
		
		System.out.println("������ �� ���ڸ� �Է��Ͻÿ�.");
		int aa1=Integer.parseInt(sc.nextLine());
		
		switch(aa1) {
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
		
		java.util.Random ran=new java.util.Random();
		int a12=ran.nextInt(3);
		System.out.println("��ǻ�Ͱ� �� ���ڴ� "+a1);
		
		
		switch(a12) {
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
		
		if(aa1==a12) {
			System.out.println("�����ϴ�.");
		}
		if(aa1>a12) {
			System.out.println("����� �̰���ϴ�.");
		}
		if(aa1==0&&a12==2){
			System.out.println("����� �̰���ϴ�.");
		}else {
			if(aa1<a12) {
				System.out.println("����� �����ϴ�.");
			}
		}
		
		//47������ 1�� ����
		
		System.out.println("A�� ���� ���� �Է��Ͻÿ�.");
		int A=Integer.parseInt(sc.nextLine());
		System.out.println("B�� ���� ���� �Է��Ͻÿ�.");
		int B=Integer.parseInt(sc.nextLine());
		System.out.println("C�� ���� ���� �Է��Ͻÿ�.");
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
		
		//47������ 2�� ����
		
		System.out.println("���� ������ �Է��ϼ���.");
		int kor=Integer.parseInt(sc.nextLine());
		System.out.println("���� ������ �Է��ϼ���.");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.println("���� ������ �Է��ϼ���.");
		int mat=Integer.parseInt(sc.nextLine());
		
		double ave=(double)(kor+eng+mat)/3;
		
		if(ave>=60) {
			if(kor>=60&&eng>=60&&mat>=60) {
				System.out.println("�հ�");
			}else {
				System.out.println("���� Ż��");
			}
		}else {
			System.out.println("��չ̴� Ż��");
		}
		
		
	}
}