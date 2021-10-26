/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(for 문) 실습
  - 별찍기 실습
=============================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

//실행 예)
/*

 *********
  *******
   *****
    ***
	 *

*/
public class Test058

{
	public static void main(String[] args)

	{
		int i, j;  //루프변수, 변수

		for (j=0; j<=5; j++)			//5줄 설정
		{
			for (i=j; i>0; i--)			//공백을 넣기
			{
				System.out.print(" ");
			}
			for (i=5-j; i>0; i--)		//--별넣기
			{
				System.out.print("*");
			}
			for (i=4-j; i>0; i--)		//--별 넣기
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//실행결과
/*
*********
 *******
  *****
   ***
    *

계속하려면 아무 키나 누르십시오 . . .
*/

