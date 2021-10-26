import java.util.Scanner;

import java.io.IOException;



public class ttest

{

	public static void main(String[] args) throws IOException

	{

		Scanner sc = new Scanner(System.in);

		int n, i=1, j;

		boolean flag;

		

		// 인원 수 입력받기

		System.out.print("인원 수 입력 : ");

		n = sc.nextInt();



		// 인원 수 만큼 배열방 만들기

		String name[] = new String[n];	//-- 이름

		int score[] = new int[n];		//-- 점수

		int grade[] = new int[n];		//-- 석차

		String temp;



		// 이름, 점수 입력받기

		do

		{

			System.out.print("이름 점수 입력(" + i + ") : ");

			name[i-1] = sc.next();

			score[i-1] = sc.nextInt();

		}

		while (i++<n);



		// --------------------------------------------------------- 향상된 버블정렬 (Bubble Sort) ------- ①

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



		// --------------------------------------------------------------- 버블정렬 (Bubble Sort) ---------- ②

		/*

		for (i=1; i<n; i++) //-- 뒤에서 뺄셈할 아이

		{

			for (j=0; j<n-i; j++)

			{

				if (score[j]<score[j+1])	//-- 내림차순

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

		// --------------------------------------------------------------- 선택정렬 (Selected Sort) ---------- ②

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



		// 석차 확인하기

		for (i=0; i<n; i++)

		{

			grade[i] = 1;	//--1등이라는 가정

			for (j=0; j<n; j++)

			{

				if (score[i]<score[j])

					grade[i] += 1;

			}

		}



		// 결과 출력하기

		System.out.println("\n--------------");

		for (i=0; i<n; i++)

		{

			System.out.printf("%d등 %s %d\n", grade[i], name[i], score[i]);

		}

		System.out.println("--------------");		

	}

}



