

public class JavaStart10 {

	public static void main(String[] args) {
		//if ���ǹ�
		/*
		if(����){
			������ ���� �� ����
		}else{
			������ ������ �� ����
			
		}
		
		���ǽ����� �� �� �ִ� ���� ���� ����� boolean�� ���
		true, false, �񱳿�����, ��������
		 */
		if (true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//����ΰ� 1���� �� ��������
		if (false) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			//����ΰ� 1���� �� ��������
			//else �κ� ��ü�� ������ �����ϴ�.
			
			
		if(10<400){
			System.out.println("true");
		}
		int a=10;
		if(a==10) {
			System.out.println("true");
		}
		if(a!=10){
			System.out.println("true");
		}
		
		//true, false, 1, 0 �Ϲ����� ���� 0���� true ���
		//if(1){} ���ǽ��� ����
		//if(0){} ���ǽ��� ���� �ȵ�
		
		/*
		 �⺻�ڷ��� �� ==     ������ ����Ű�� �� ��
		 �����ڷ����� .equals������ ����Ű�� �ּҿ� �ִ� �� ��
		 */
		
		String s1="ȫ�浿";
		String s2="ȫ�浿";
		String s3=new String("ȫ�浿");
		String s4=new String("ȫ�浿");
		if(s3==s4) {
			System.out.println("== �̿��� ���� ���");
		}
		if(s3.equals(s4)) {
			System.out.println("equals �̿��� ���� ���");
		}
		
		//����ڿ��� ���ڸ� �Է¹޾� 1004�̸� '��ȣ�� ����' �ƴϸ� '��ȣ�� Ʋ��'�� ��µǵ��� ���α׷��� �����غ���.
		
		//'�ȳ�'�� �Է��ϸ� '�ʵ� �ȳ�''����
		//�Է��ϸ� '�ʵ� ����''�߰�'�� �ԷµǸ�'�ʵ� �߰�'�� ��µǵ��� ����
		//�� ���� ���̸� ���ϴ� ���α׷��� ���غ���  10 20 , 20 10 �Է½� 10�� ���� �Ǿ�� �Ѵ�
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		
		int a1=Integer.parseInt(sc.nextLine());
		if(a1==1004) {
			System.out.println("��ȣ�� ����.");
		}else {
			System.out.println("��ȣ�� Ʋ��.");
		}
		
		
		
		System.out.println("�ȳ��� �Է��Ͻÿ�.");
		
		String str=sc.nextLine();
		String b=new String("�ȳ�");
		if(str.equals(b)) {
			System.out.println("�ʵ� �ȳ�.");
		}
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		
		String str1=sc.nextLine();
		String c=new String("����");
		if(str1.equals(c)) {
			System.out.println("�ʵ� ����.");
		}
		
		System.out.println("�߰��� �Է��Ͻÿ�.");
		
		String str2=sc.nextLine();
		String d=new String("�߰�");
		if(str2.equals(d)) {
			System.out.println("�ʵ� �߰�.");
		}
		
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		int a2=Integer.parseInt(sc.nextLine());
		System.out.println("������ ���� �Է��Ͻÿ�.");
		int a3=Integer.parseInt(sc.nextLine());
		
		if(a2>a3) {
			System.out.println(a2-a3);
		}else {
			System.out.println(a3-a2);
		}
		sc.close();
	}
}