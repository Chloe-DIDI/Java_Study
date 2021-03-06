/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
=============================================================*/

// 1/2 + 2/3 + 3/4 + ... + 9/10

// n
// |
// 1/2 + 2/3 +3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10
//	 |
//	 n					→ n 은 2~10 까지 1씩 증가
//								(n-1)/n   

// 실행 예)
// 연산 결과 : xxx(← 실수 기반 연산)
// 계속하려면 아무 키나 누르세요...



public class Test044
{
	public static void main(String[] args) 
	{

		// 주요 변수 선언 및 초기화
		int n=0;					//-- 1부터 1씩 증가하게 될 변수
		double sum=0;				//--누적합을 담을 변수(실수 형태)

		// 연산 및 처리(반복문 구성)

		while (n<9)					//-- 0 1 2 3 4 5 6 7 8  
		{		
			// 증감식 구성
			//-- 최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠가 되는 구문
			n++;					//-- 1 2 3 4 5 6 7 8 9 
			
			// 목적 연산
			sum += (double)n/(n+1);			// 9는 넣으면안됌~! 9넣으면 10/11됨 위에 n++땜에
			//-- 정수 기반 나눗셈 연산은 몫을 반환하기 때문에
			//	 실수 기반 연산을 수행하도록 처리하기 위해서
			// 나눗셈 연산자를 중심으로 피연산자 중 하나를
			// 실수 형태로 만들어주는 것이 중요허더===
		}
				System.out.println("연산 결과 : %f\n" + sum);
		
	}
}

//실행결과
/*
연산 결과 : %f
7.071031746031746
계속하려면 아무 키나 누르십시오 . . .
*/

/*
public class Test044
{
	public static void main(String[] args) 
	{
		double n=1;
		double sum=0;

		while (n<10)
		{			
			sum = n/(n+1);
			n++;
		}
				System.out.println("연산 결과 : " + sum);
		
	}
}
*/

//실행 결과
/*
연산 결과 : 0.9
계속하려면 아무 키나 누르십시오 . . .
*/