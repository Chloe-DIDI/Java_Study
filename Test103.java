/*======================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 선택 정렬(Selection Sort)
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

public class Test103
{
	public static void main(String[] args) 
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		52 42 12 62 60				0  1
		== -- 52랑 42 자리 비교		
		↓
		42 52 12 62 60				0  2
		==    -- 42랑 12랑 비교
		↓
		12 52 42 62 60				0  3
		==       -- 12랑 62 비교
		↓
		12 52 42 62 60				0  4
		==			--  12랑 60 비교
		-----------------------------------1회전
		12 42 52 62 60				1  2
		   == -- 42랑 52 비교
		   ↓
		12 42 52 62 60				1  3
		   ==    --  42랑 62 비교
		↓
		12 52 42 62 60				1  4
		     ==       --   비교
		↓

		*/

		int i, j;

		
		System.out.print("Source Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		//--==>>Source Data : 52 42 12 62 60
		*/
		
		// 향상된 for 문 (forEach 구문)
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>>Source Data : 52 42 12 62 60

		//Selection Sort
		for (i=0; i<a.length-1; i++)	// 웅~ (비교기준데이터) → 0     1    2   3
		{
			for (j=i+1; j<a.length; j++)				// 쑝~ (비교대상데이터) → 1234  234  34  4
			{
				if (a[i] > a[j])	//-- 오름차순
				//if (a[i] < a[j])	//-- 내림차순
				{
					//자리 바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		//--==>>Sorted Data : 52 42 12 62 60
		*/

		// 향상된 for 문 (forEach 구문)
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>>Sorted Data : 52 42 12 62 60
		
	}
}

// 실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/