/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
=============================================================*/

// �� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� �� ������
// ��ü �հ�, ¦���� �հ�, Ȧ���� ���� 
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 270
// >> 1 ~ 270 ���� ������ �� : xxxx
// >> 1 ~ 270 ���� ¦���� �� : xxxx
// >> 1 ~ 270 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;			//--����	
		int i=1;			//--���� ����
		int sum=0; 			//--�������� ���� ����
		int even=0;			//--Ȧ�� �������� ���� ����
		int odd=0;			//--¦�� �������� ���� ����

		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		
		while (i <= num)		//--������ ���ڱ��� �ݺ���
		{
			sum +=i;			//--�����Ǽ� ��
			if(i%2==0)			//--¦�� �Ǻ���
			{
				even +=i;		//--¦�� ��
			}
			else
			{
				odd +=i;		//-- Ȧ�� ��
			}
			i++;
		}

		//�۰�� ���

		System.out.println("1~100 �� = " + sum); 
		System.out.println("1~100 ¦���� = " + even);
		System.out.println("1~100 Ȧ���� = " + odd);

	}
}

//������
/*
������ ���� �Է� : 270
1~100 �� = 36585
1~100 ¦���� = 18360
1~100 Ȧ���� = 18225
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/