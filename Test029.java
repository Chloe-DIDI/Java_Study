/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
=============================================================*/


// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� �����Ͽ� ó���Ѵ�.

// 90�� ~ 100�� : A			80�� ~ 89�� : B
// 70�� ~  79�� : C			60�� ~ 69�� : D
// 60�� �̸�    : F

// ��, BufferedReader �� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : �չ���
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� �չ����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70.
// >> ������ 240�̰�, �����80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;			//-- �̸�
		int kor, eng, mat;		//-- ����, ����, ���� ����
		int tot;				//-- ����
		//int tot = 0;
		double avg;				//-- ���
		char grade='F';				//-- ��� ,,,,A�� B ��� �����ϳ��ϱ� char�� ���
		//char grade; �ؿ� else�� �Է��ҷ����ϸ� �̷����ۼ��ϰ� �ƴϸ�='F'�Է�


		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		//tot += kor;

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		//tot += eng;


		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());
		//tot += mat;


		// ���� ����
		tot = kor + eng + mat;
		
		// ��� ����
		avg = tot / 3.0;		//check~!!!! �Ǽ������ ������ �ǰ��ϱ�����

		// ��� ����

		// �� �� �� �̻��� ���� �� �� ������
		//    �����90���̻�  �����100������
		if (avg>=90)
		{
			//����� A
			grade = 'A';
		}
		else if (avg>=80)
		{
			//����� B
			grade = 'B';
		}
		else if (avg>=70)
		{
			//����� C
			grade = 'C';
		}
		else if (avg>=60)
		{
			//����� D
			grade = 'D';
		}
		else if(avg<60)  //�ƴϸ�  else ��..
		{
			//����� F
			grade = 'F';
		}

		//���� ���
		System.out.println();
		System.out.printf(">>����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">>���� ������ %d,\n", kor );
		System.out.printf(">>���� ������ %d,\n", eng);
		System.out.printf(">>������ ������ %d,\n", mat);
		System.out.printf(">>������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">>����� %c�Դϴ�.\n", grade);

	}
}

// ���� ���

/*
�̸� �Է� : �չ���
���� ���� : 90
���� ���� : 80
���� ���� : 70

>>����� �̸��� �չ����Դϴ�.
>>���� ������ 90,
>>���� ������ 80,
>>������ ������ 70,
>>������ 240�̰�, ����� 80.00�Դϴ�.
>>����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
		// �����Ѱ� �ذ� ���� ��
		
/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, mat, tot;
		double avg;	
		String strName;
		char grade;

		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot/3;

		if (kor >= 90){
		grade = 'A';
		}else if(kor >= 80){
		grade = 'B';
		}else if(kor >= 70){
		grade = 'C';
		}else{
		grade = 'F';
		}

		//���� ���

		
		System.out.printf("\n>> ����� �̸��� %s�Դϴ�",strName);
		System.out.printf("\n>> ���� ������ %d",kor);
		System.out.printf("\n>> ���� ������ %d",eng);
		System.out.printf("\n>> ���� ������ %d",mat);
		System.out.printf("\n>> ������ %d�̰� ����� %.2f�Դϴ�.", tot, avg);
		System.out.printf("\n>> ����� %c�Դϴ�.",grade);
	}
}

	*/
