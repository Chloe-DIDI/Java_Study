/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
===========================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136

*/

/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136


*/

public class Test086
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];


		// 배열의 배열 각 방에 요소 채워넣기
		int n=0;
		for (int i=0; i<4; i++)				    // 웅~  i → 0 1 2 3
		{
			for (int j=0; j<4; j++)				// 쑝~  j → 0 1 2 3
			{
				 n++;							// n → 1 2 3 4 5 ... 16
				 arr[i][j] = n;

				 arr[i][4] += arr[i][j];
				 arr[4][j] += arr[i][j];
				 arr[4][4] += arr[i][j];

			}
		}

		// 배열의 배열 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%4d", arr[i][j]);
				System.out.println();
			
		}
	}
}

//실행결과
/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136
*/

/*

		int a[][] = new int[5][5];

		int n=1;

		for (int i=0; i<5; i++)			  
		{
			for (int j=0; j<5; j++)	
				
				arr[i][j] = n;
				n++;
			
				a[i][4] = a[i][4] + a[i][j];
				a[4][j] = a[4][j] + a[i][j];
				a[4][4] = a[4][4] + a[i][j];
			}


		}
		//전체 요소 출력
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
		
	}
*/