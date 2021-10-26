/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - switch �� �ǽ�
=============================================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [ break;]
	   case ���2 : ����2; [ break;]

	   [default : ����n+1; [break;]]
	}
		
	switch ���� �����ġ��� case�� ���������
	byte, short, int, long �̾�� �Ѵ�.

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)
*/

// ����� �̸��� ���±� �Դϴ�.
// ������ xx, ����� xx �Դϴ�.
// ����� A �Դϴ�.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name= br.readLine();

		System.out.print("�������� �Է� : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("�������� �Է� : ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("�������� �Է� : ");
		int mat = Integer.parseInt(br.readLine());
		
		// ��� - ���ǻ� ������ ó��
		int avg = (kor+eng+mat) / 3;

		char grade = 'F';

		/*
		if(avg>=90)
			grade = 'A';
		else if (avg>=80)
			grade = 'B';
		else if (avg>70)
			grade = 'C';
		else if (avg>=60)
			grade = 'D';
		//else
		//	grade = 'F';
		*/
		/*
		switch (avg)
		{
		case 10: grade='A';break;
		case  9: grade='A';break;
		case  8: grade='B';break;
		case  7: grade='C';break;
		case  6: grade='D';break;
		case  5: grade='F';break;
		case  4: grade='F';break;
		case  3: grade='F';break;
		case  2: grade='F';break;
		case  1: grade='F';break;
		case  0: grade='F';break;
		
		}
		*/

		switch (avg/10)
		{
		case 10: grade='A';break;
		case  9: grade='A';break;
		case  8: grade='B';break;
		case  7: grade='C';break;
		case  6: grade='D';break;
		default: grade='F';break;
		
		}
		System.out.printf("\n����� �̸��� %s�Դϴ�.",name);
		System.out.printf("\n������ %d, ����� %d�Դϴ�.",(kor+eng+mat),avg);
		System.out.printf("\n����� %c�Դϴ�.\n",grade);

/*
			switch(avg/10)
			{
			case 10 : case 9 : grade='A'; break;
			case 8 : grade='B'; break;
			case 7 : grade='C'; break;
			case 6 : grade='D'; break;
			default : grade='F'; break;
			}

		System.out.printf("\n����� �̸��� %s�Դϴ�.",name);
		System.out.printf("\n������ %d, ����� %d�Դϴ�.",(kor+eng+mat),avg);
		System.out.printf("\n����� %c�Դϴ�.\n",grade);
*/


	}
}

//���� ���
/*
�̸� �Է� : ����ȣ
�������� �Է� : 98
�������� �Է� : 97
�������� �Է� : 55

����� �̸��� ����ȣ�Դϴ�.
������ 250, ����� 83�Դϴ�.
����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/