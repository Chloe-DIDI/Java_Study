/*===========================================================
  ���� Ŭ������ �ν��Ͻ� ����
=============================================================*/

// �� Test.java ���ϰ� ��Ʈ~!!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// Test065.java ������ �����ϵ�
// ���� ���� �� ���� ���Ϸ� ������ �۾��� �����Ѵ�.
// ����, BufferedReader �� Ȱ���Ѵ�.

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : 13

// �������� 13�� ���� ����
// ���� : xxx.xx
// �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
	// �ֿ� �Ӽ�
	int r;							//-- ������
	final double PI = 3.141592;		//-- ������ ( ������ ���ȭ )
	
	// ���(����, ����)
	// ������ �Է� ���
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ���� ���
	double calArea()			//��ȯ�ؾߵǴ� �ڷ����� double,,,,�Ű����� ����
	{
		double result = 0;		

		result = r * r * PI;

		return result;

	}

	// �ѷ� ���� ���
	double calLength()			//��ȯ�ؾߵǴ� �ڷ����� double,,,,�Ű����� ����
	{
		double result = 0;		

		result = r * 2 * PI;

		return result;
	}


	// ��� ���
	void print(double a, double l)
	{
		// �������� 13�� ���� ����
		// ���� : xxx.xx
		// �ѷ� : xxx.xx

		System.out.printf("�������� %d�� ����\n",r);
		System.out.printf("���� : 2%f\n",a);
		System.out.printf("�ѷ� : 2%f\n",l);

	}
}
