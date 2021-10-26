/* ================================
		정렬(Sort) 알고리즘
	  -버블 정렬 (Bubble Sort)
=================================*/
/*
 ※ 앞에서 확인해 본 Selection Sort(Test103) 나 Bubble Sort(Test104)의 성능은 같다
	(→반복의 횟수로 추정)

	하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
	일반 Bubble Sort나 Selection Sort 보다 성능이 좋을 수 있다.

원본 데이터 : 61 15 20 22 30
			  15 20 22 30 61	1회전 (스왑 발생 → true)  → 다음 회전 진행○ 	
			  15 20 22 30 61	2회전 (스왑 발생 → false) → 다음 회전 진행Ⅹ

==> 1회전 수행 2회전 수행을 해보았더니 
	2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여 수행하지 않는다.

*/

// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// 계속하려면 아무 키나 누르세요...


public class Test105
{
	public static void main(String[] args)
	{
		int[] a = {10,50,20,30,40};
		/*
		10 50 20 30 40		0	1
		== --
		10 20 50 30 40		1	2
		   == --			
		10 20 30 50 40		2	3
			  == --			
		10 20 30 40 50		3	4
				 == --		
	--------------------------------- 1회전 발생 → 스왑 발생
		10 20 30 40 50		0	1
		== --		 		
		10 20 30 40 50		1	2
		   == --
		10 20 30 40 50		2	3
		      == --
	--------------------------------- 2회전 발생 → 스왑 발생하지 않음
									 
									 => 정렬 종료 
		*/
		
		// 원본 데이터 출력
		System.out.print("Source Data : "); 
		
		for ( int n : a)
			System.out.print(n+" ");
		System.out.println();
		
		
		// 
		int i, j=0;
		boolean flag = false;
	
		do						// 일단 돌아봐야 스왑이 일어났는지 아니까
		{
			j++;
			flag = false;		// 스왑이 안 일어났다고 가정하고, 반복문 탈출 조건으로 초기화

			for (i=0;i<a.length-j;i++ )
			{
				if (a[i]>a[i+1])
				{
					a[i]=a[i]^a[i+1];
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];
					flag = true;

					/*
					// 자리 바꾸기
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					*/
				}
			}
			System.out.printf("%d회전\n",j);
		}
		while (flag);			
			// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
			// 더 이상의 반복문 수행은 무의미한 것으로 판단 가능

										
		// 정렬 데이터 출력
		System.out.print("Sorted Data : "); 

		for (int n : a)
			System.out.print(n+" ");
		System.out.println();
		
	}
}
