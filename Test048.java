/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
=============================================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 그 수 까지의
// 전체 합과, 짝수의 합과, 홀수의 합을 
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 270
// >> 1 ~ 270 까지 정수의 합 : xxxx
// >> 1 ~ 270 까지 짝수의 합 : xxxx
// >> 1 ~ 270 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;			//--변수	
		int i=1;			//--루프 변수
		int sum=0; 			//--누적합을 담을 변수
		int even=0;			//--홀수 누적합을 담을 변수
		int odd=0;			//--짝수 누적합을 담을 변수

		// ○ 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		
		while (i <= num)		//--임의의 숫자까지 반복문
		{
			sum +=i;			//--임의의수 합
			if(i%2==0)			//--짝수 판별식
			{
				even +=i;		//--짝수 합
			}
			else
			{
				odd +=i;		//-- 홀수 합
			}
			i++;
		}

		//○결과 출력

		System.out.println("1~100 합 = " + sum); 
		System.out.println("1~100 짝수합 = " + even);
		System.out.println("1~100 홀수합 = " + odd);

	}
}

//실행결과
/*
임의의 정수 입력 : 270
1~100 합 = 36585
1~100 짝수합 = 18360
1~100 홀수합 = 18225
계속하려면 아무 키나 누르십시오 . . .
*/