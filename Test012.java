/*===============================================
  ���� �ڹ��� �⺻ ���α׷��� ����
  - ����
	�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.
=================================================*/

//���� ��)
//�� �ﰢ���� ���� ���ϱ��
//-�ﰢ���� �غ� �Է� : 3
//-�ﰢ���� ���� �Է� : 5

// >>�غ��� 3, ���̰� 5�� ������� ���� : XXXXX
//����Ϸ��� �ƹ�Ű�� ��������.....

// �� �ﰢ���� ���� = �غ� * ���� / 2
//					  -----------
//					  ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import.java.lang.* ; 

public class Test012
{
	public static void main(String[] args) throws IOException
	{

		//�ֿ� ���� ����


		//BufferedReader �ν��Ͻ� ���� -> br�� ������ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//���������� �����°� ���� import�� ����մ����˷���ߵȴ�
			//�׷� �� string�� system�� ���ص��ǳ�?
			//import java.lang.string;
			//import java.lang.system;
			//lang�� ����°Ŷ� io�� �޸� �� �ʿ� ����

			int bottomLength, height;		//--�غ��� ����
			double area;					//--���� 

			//���� �� ó��
			//�� ����ڿ��� �ȳ� �޼��� ���
			System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
			System.out.print("- �ﰢ���� �غ� �Է� : ");

			//�� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
			//	 ���� bottomLength �� ��Ƴ���
			bottomLength = Integer.parseInt(br.readLine());

			//�� �ٽ� ����ڿ��� �ȳ� �޼��� ���
			System.out.print("- �ﰢ���� ���� �Է� : ");

			// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
			//		���� height �� ��Ƴ���
			height = Integer.parseInt(br.readLine());

			// �� ���� ä����(�����) �������� Ȱ���Ͽ�
			//	�ﰢ���� ���̸� ���ϴ� ���� ����
			//	�ﰢ���� ���� = �غ� * ���� / 2
			//		 ������		  ������   ������ �� ���� ��� ����
			area = bottomLength * height / 2.0;						//check!!!!
			//		 ������		  ������   �Ǽ��� �� �Ǽ� ��� ����

			//�� �Ǽ� �ڷ����� ��������� ����Ǵ� ����������
			//	 �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
			//	 ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
			//	 �� ������ �Ǽ� ������� ó���ȴ�.

			//	�� ��� ���

			System.out.println(); //-- �Ű������� ���� ��� -> ����
			//System.out.print(); //-- �Ű������� ���� ��� -> ����

			System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", bottomLength, height, area);


			//��� ���
		

		//�п�Ǯ��

	


		//�� Ǯ��
		/*
		int a, b;		//�غ�, ����
		double c;		//�ﰢ�� ����

		System.out.print("�ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = a*b / 2;

		System.out.println("�غ��� " + a + ","+ " ���̰� " + b + "�� �ﰢ���� ���� : " + c);
		*/
 
 		// ���� �����ϴ� ���� ���콺 �� �ǵ帮�� �ǿ� ^^

	}
}