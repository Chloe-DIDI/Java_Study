import java.util.Scanner;

import java.io.IOException;



public class ttest

{

	public static void main(String[] args) throws IOException

	{

		Scanner sc = new Scanner(System.in);

		int n, i=1, j;

		boolean flag;

		

		// �ο� �� �Է¹ޱ�

		System.out.print("�ο� �� �Է� : ");

		n = sc.nextInt();



		// �ο� �� ��ŭ �迭�� �����

		String name[] = new String[n];	//-- �̸�

		int score[] = new int[n];		//-- ����

		int grade[] = new int[n];		//-- ����

		String temp;



		// �̸�, ���� �Է¹ޱ�

		do

		{

			System.out.print("�̸� ���� �Է�(" + i + ") : ");

			name[i-1] = sc.next();

			score[i-1] = sc.nextInt();

		}

		while (i++<n);



		// --------------------------------------------------------- ���� �������� (Bubble Sort) ------- ��

		/*

		do

		{

			flag = false;

			

			for (i=1; i<n; i++)

			{

				for (j=0; j<n-i; j++)

				{

					if (score[j] < score[j+1])

					{

						temp = name[j];

						name[j] = name[j+1];

						name[j+1] = temp;



						score[j] = score[j]^score[j+1];

						score[j+1] = score[j+1]^score[j];

						score[j] = score[j]^score[j+1];

						

						flag = true;

					}

				}

			}

		}

		while (flag);

		*/



		// --------------------------------------------------------------- �������� (Bubble Sort) ---------- ��

		/*

		for (i=1; i<n; i++) //-- �ڿ��� ������ ����

		{

			for (j=0; j<n-i; j++)

			{

				if (score[j]<score[j+1])	//-- ��������

				{

					temp = name[j];

					name[j] = name[j+1];

					name[j+1] = temp;



					score[j] = score[j]^score[j+1];

					score[j+1] = score[j+1]^score[j];

					score[j] = score[j]^score[j+1];

				}

			}

		}

		*/

		// --------------------------------------------------------------- �������� (Selected Sort) ---------- ��

		for (i=0; i<n-1; i++)

		{

			for (j=1+i; j<n; j++)

			{

				if (score[i]<score[j])

				{

					score[i] = score[i]^score[j];

					score[j] = score[j]^score[i];

					score[i] = score[i]^score[j];

				}

			}

		}



		// ���� Ȯ���ϱ�

		for (i=0; i<n; i++)

		{

			grade[i] = 1;	//--1���̶�� ����

			for (j=0; j<n; j++)

			{

				if (score[i]<score[j])

					grade[i] += 1;

			}

		}



		// ��� ����ϱ�

		System.out.println("\n--------------");

		for (i=0; i<n; i++)

		{

			System.out.printf("%d�� %s %d\n", grade[i], name[i], score[i]);

		}

		System.out.println("--------------");		

	}

}



