/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
===========================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 n
↓
 1  2  3  4  5		i=0	→ n이 1부터 시작 → n=i+1
 2  3  4  5  6		i=1	→ n이 2부터 시작 → n=i+1
 3  4  5  6  7		i=2 → n이 3부터 시작 → n=i+1
 4  5  6  7  8		i=3 → n이 4부터 시작 → n=i+1
 5  6  7  8  9		i=4 → n이 5부터 시작 → n=i+1
계속하려면 아무 키나 누르세요...
*/


public class Test082
{
	public static void main(String[] args)
	{
			int[][] arr = new int[5][5];

		int n;			

		//배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i=0;i<arr.length;i++)			// 웅~        
		{
			n=i+1;

			for (int j=0; j<arr[i].length; j++) // 쑝!
			{
				arr[i][j] = n;
				n++;
				
			}
		}
		
		// 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
		
				System.out.printf("%3d",arr[i][j]);
				System.out.println();
			
		}
	}
}





		/*
		int[][] arr = new int[5][5];

		int n=1;			

		//배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i=0;i<arr.length;i++)			// 웅~        
		{
			for (int j=0; j<arr[i].length; j++) // 쑝!
			{
				arr[i][j] = i+j+1;
				
			}
		}
		
		// 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
		
				System.out.printf("%3d",arr[i][j]);
				System.out.println();
			
		}
	}
}*/
//실행결과
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/
