/*===============================================
  ���� �ڹ��� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� : BufferedReader Ŭ����
=================================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �޾� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70


// ===[���]===
// �̸� : ������
// ���� : 240
//����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������� �ؿ��� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


			String strName;				//--�̸� ����  //��Ÿ���ǥ��� 
			int nKor, nEng, nMat;		//--��,��,�� ���� ����
			int nTot;					//--���� ����

			//�߰� ���� ����
			String strTemp;				//--���ڿ� ������ �ӽ� ���� ����

			// �� ���� �� ó��
			//- ����ڿ��� �ȳ� �޼��� ��� ( �̸� �Է� �ȳ�)
			System.out.print("�̸��� �Է��ϼ��� : ");

			//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
			strName = br.readLine();

			//-����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
			System.out.print("���� ���� �Է� : ");

			strTemp = br.readLine();

			nKor = Integer.parseInt(strTemp);

			System.out.print("���� ���� �Է� : ");

			strTemp = br.readLine();

			nEng = Integer.parseInt(strTemp);

			System.out.print("���� ���� �Է� : ");

			strTemp = br.readLine();

			nMat = Integer.parseInt(strTemp);

			nTot = nKor + nEng + nMat;

			
			
			
			System.out.println("\n====[���]====");

			System.out.printf("�̸� : %s\n", strName);
			System.out.printf("���� : %d\n", nTot);






// �� Ǯ��
/*
		String name;	
		int a, b, c, d;		

		System.out.print(" �̸��� �Է��ϼ��� : ");
		name = br.readLine();

		System.out.print(" ���� ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print(" ���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
	
		d = a + b + c;

		System.out.println();
		System.out.println("===[���]===");
		System.out.println(" �̸� : " + name);
		System.out.println(" ���� : " + d);
		
		
		*/
//���
/*
 �̸��� �Է��ϼ��� : �մ���
 ���� ���� �Է� : 90
 ���� ���� �Է� : 90
 ���� ���� �Է� : 90

===[���]===
 �̸� : �մ���
 ���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/

	}
}