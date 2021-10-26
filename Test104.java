/*======================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 버블 정렬(Bubble Sort)
========================================*/
/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
		→ 보기 좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정령, 힙 정렬, 퀵 정렬, 쉘 정렬 ...
*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test104
{
	public static void main(String[] args) 
	{

	
		/*
		52 42 12 62 60		0   1			기준 0 1 2 3
		== --	52랑 42 비교
		↓
		42 52 12 62 60		1	2
		   == --
		   ↓ 52랑 12 비교
		42 12 52 62 60		2	3
			  == --
			  ↓52랑 62 비교
		42 12 52 62 60		3	4
				 == --
				 ↓ 62랑 60 비교
		42 12 52 60 62

		--------------------------- 1회전
		
		42 12 52 60 62		0	1			기준 0 1 2
		== --
		↓ 12랑 42 비교
		12 42 52 60 62		1	2
		   == --
		   ↓ 42랑 52 비교
		12 42 52 60 62		2	3
			  == --
		---------------------------- 2회전
		
		12 42 52 60 62		0	1
		== --
		↓
		12 42 52 60 62		1	2
		   == --
	    ---------------------------- 3회전

		12 42 52 60 62		0	1
		== --
		---------------------------- 4회전
				
		*/
		
		
		int[] a = {52, 42, 12, 62, 60};
		
		int i, j;

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// Bubble Sort
		for (int i=1; i<a.length; i++)		// 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{
			// 테스트
			// System.out.print(i + " +);	//1 2 3 4
			for (int j=0;j<a.length-i; j++)
			{
				if (a[j]>a[j+1])
				{
					a[j]   = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j]   = a[j]^a[j+1];
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

	}
}

//실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/