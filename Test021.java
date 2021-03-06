/*===============================================
  ■■■ 연산자(Operator) ■■■
  - 비트 단위 연산자
=================================================*/

public class Test021
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;		// a는 10이라는 양수, b는 음수 10으로 선언함

		System.out.printf("~a : %d\n", ~a);		//비트단위 연산자 ~
		System.out.printf("~b : %d\n", ~b);

	}
}
//실행 결과
/*
~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .
*/

/*
a = 10 → 00001010
			 ↓~a
		  11110101 → -11 → check → ok~!
		 +00001011 → 11
		 ---------------
		  00000000 → 0

b = -10		10 → 00001010 → 2의 보수
							  ------------
							  1의 보수 + 1
							  --------
							  비트열 반전
				  11110101
				  +      1
				  --------
				  11110110 →  -10 → check → ok!

				  11110101
	비트열반전 → 00001010 → 9

*/
