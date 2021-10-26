/* ================================
		정렬(Sort) 알고리즘
=================================*/

// 사용자로부터 여러 학생의 성적 데이터를 입력받아
// 점수가 높은 순에서 낮은 순으로 등수를 부여하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도로고 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 김김김 90
// 이름 점수 입력(2) : 이이이 80
// 이름 점수 입력(3) : 박박박 85
// 이름 점수 입력(4) : 최최최 75
// 이름 점수 입력(5) : 정정정 95

/*
---------------------
1등 정정정 95
2등 김김김 90
3등 박박박 85
4등 이이이 80
5등 최최최 75
---------------------
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;


public class Test106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
					
		System.out.print("인원 수 입력 : ");
		int n = sc.nextInt();
		
		// 입력 받은 숫자만큼 배열방 생성.
		String[] name = new String[n];
		int[] score = new int[n];

		// 입력 받은 순서대로 이름. 점수방에 넣는다. i가 같으면 셋뚜셋뚜
		for (int i=0;i<n;i++)
		{
			System.out.printf("이름 점수 입력(%d) : ",i+1);
		
			name[i] = sc.next();		
			score[i] = sc.nextInt();	
		}
	

		// 정렬
		int pass = 0;						// 정렬 하는 범위를 줄이는 역할
		boolean flag = false;				// 스왑이 일어났는지 판별
		
		do
		{	
			flag = false;
			pass++;		

			for (int i=0;i<n-pass;i++ )		// 1회차에 01 12 23 34	2회차에 01 12 23
			{
				if (score[i]<score[i+1])	// 내림차순 이니까 제일 큰 수가 왼쪽으로 오도록
				{
					score[i] = score[i]^score[i+1];
					score[i+1] = score[i+1]^score[i];
					score[i] = score[i]^score[i+1];

					String temp ="";				// name은 String이므로 비트 연산 불가 → 임시로 String 변수 만들어서 자리 바꿈	
					temp = name[i];
					name[i] = name[i+1];
					name[i+1] = temp;

					flag = true;
				}
			}
			// System.out.printf("%d회전",pass);
		}
		while (flag);

		// 출력
		System.out.println("-----------------------------");
		for (int i=0;i<n;i++)
		{
			System.out.printf("%d등 %s %d\n", (i+1), name[i],score[i]);
		}
		System.out.println("-----------------------------");

	}
}

/*
인원 수 입력 : 5
이름 점수 입력(1) : 김김김 90
이름 점수 입력(2) : 이이이 80
이름 점수 입력(3) : 박박박 85
이름 점수 입력(4) : 최최최 75
이름 점수 입력(5) : 정정정 95
-----------------------------
1등 정정정 95
2등 김김김 90
3등 박박박 85
4등 이이이 80
5등 최최최 75
-----------------------------
계속하려면 아무 키나 누르십시오 . . .
*/