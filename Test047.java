/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
=============================================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 10~20 ������ �� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...


// ù��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 2~10 ������ �� : xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test047

{
	public static void main(String[] args) throws IOException

	{
		

		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;				//--���� ������ Ȱ���� ����,,,����=�ݺ��� ���� ��
		int su1, su2;		//--ù ��°, �� ��° �Է°��� ���� ����
		int result=0;		//--�������� ���� ����
		

		// �� ���� �� ó��
		System.out.print("ù ���� ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��

		if ( su1 > su2 )
		{
			//�ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		n=su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		//�۰�� ���

		System.out.printf(" >> %d ~ %d ������ �� : %d\n", su1, su2, result);

		//���� ���
		/*
		ù ���� ���� �Է� : 2
		�� ���� ���� �Է� : 1
		 >> 1 ~ 2 ������ �� : 3
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		
		
			// �ݺ� ���� ����
			// �ݺ� ������ �����ϱ� ����
			// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
			// (��� ��� �������� �ʿ��ϱ� ������...)
			// 10
			// 2
			// 2 ~ 10	
		/*
		int a, b;		 // ���� �ΰ�
		int c;			 //����
		int sum=0;			 // ��

	
		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		if (a>b)			//�������� ���� ���� 
		{	
			a = a^b;
			b = b^a;
			a = a^b;
		}

		c=a;

		while(c<=b)			//���������� ū������ ���ϱ�
		{
			sum += c;
			c++;
		}
		System.out.printf(" >> %d ~%d ������ �� : %d\n", a, b, sum);
*/
	}
}