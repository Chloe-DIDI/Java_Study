/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(for 문) 실습
=============================================================*/

// 1부터 100까지의 정수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// 단, for 문을 활용해야 하며,
// 한 줄에 5개씩 출력할 수 있도록 한다.

// 실행 예)
//	4	8	12	16	20
//	24	28	32	36	40
//			:
// 계속하려면 아무 키나 누르세요...



public class Test053

{
	public static void main(String[] args)
	{


		for(int n=4; n<=100; n+=4)
		{
			System.out.printf("%4d", n);
			
			if (n%(4*5)==0)		// n 이 20의 배수가 될 때
			
				System.out.println();	// 개행
			}
			System.out.println();
		}
}

//내가 푼것
/*		for(int m=1; m<=100; m++)
		{
			if(m%4==0)
			{
			System.out.print( m + " ");
			}
			if (m%20==0)
			{
				System.out.println();
			}
		}
	}
}
//실행 결과

4 8 12 16 20
24 28 32 36 40
44 48 52 56 60
64 68 72 76 80
84 88 92 96 100
계속하려면 아무 키나 누르십시오 . . .
*/
	
	