/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
=============================================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해 버릴 수 있도록 처리한다.

// 실행 예)
// 원하는 단(1~9) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//     :
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

// 원하는 단(1~9) 입력 : 11
// 1 부터 9 까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test049

{
	public static void main(String[] args) throws IOException

	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;		//--변수
		int i=1;	//--루프변수
		int sum=0;	//--곱한 값의 합



		System.out.print("원하는 단(1~9) 입력 : ");

		n = Integer.parseInt(br.readLine());

		

		if(1<=n && n<=9)		//--1~9까지
		{
			while(i<10)			//--1~9까지 곱셈
			{
				sum = n*i;		//--곱셈 합

				System.out.printf("%d * %d = %d\n", n, i++, sum);
			}
		}
		else // 아닐경우 출력
		{
			System.out.println(" 1 부터 9 까지의 정수만 입력이 가능합니다.");
		}
	}
}

//실행결과
/*
원하는 단(1~9) 입력 : 9
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .
*/