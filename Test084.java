/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
===========================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  8  9 16 17
 2  7 10 15 18
 3  6 11 14 19
 4  5 12 13 20
*/


public class Test084
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];
	
		// 배열의 배열 각 요소에 값 담아내기
		int n=0;
		for (int i=0; i<5; i++)			// i → 0 1 2 3 4
		{
			for (int j=0; j<4; j++)		// j → 0 1 2 3
			{//			 -----
			 //          arr.length  써도 상관없다

				n++;
				if(i%2==0)			//i가 짝수  // i → 0 2 4
					arr[j][i] = n;			// 00 → 1    01 →  9   04 → 17
										// 10 → 2    12 → 10   14 → 18
										// 20 → 3    22 → 11   24 → 19
										// 30 → 4    32 → 12   34 → 20 
										
				
			else				// i가 홀수	// i → 1  3
				arr[3-j][i] = n;	//	(3-0)1 → 31 → 5  (3-0)3→33→13
									//	(3-1)1 → 21 → 6  (3-1)3→23→14
									//	(3-2)1 → 11 → 7  (3-2)3→13→15
			}						//	(3-3)1 → 01 → 8  (3-3)3→03→16
		}
		//전체 요소 출력
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
		
	}
}