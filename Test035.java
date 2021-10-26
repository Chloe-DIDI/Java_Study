/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
=============================================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
// 소문자를 입력받았을 경우... 대문자로 변환하고,
// 대문자를 입력받았을 경우... 소문자로 변환하는
// 프로그램을 작성한다.
// 단, 입력은 『System.in.read()』 메소드를 활용하여 구현한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> a
// 계속하려면 아무 키나 누르세요....

// 실행 예)
// 알파벳 한 문자 입력 : C
// >> c
// 계속하려면 아무 키나 누르세요....

// 실행 예)
// 알파벳 한 문자 입력 : 7
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요....



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test035
{
	public static void main(String[] args) throws IOException
	{
		
		//○ 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;		


		// ○ 연산 및 처리
		System.out.print("알파벳 한 문자 입력: ");
		a = System.in.read();


		// ○ 결과 출력
			
		if (a>=65&&a<=90)					//대문자
		{
			a +=32;							// 대문자 → 소문자로

			System.out.printf(">> %c\n",a);
		}
			else if(a>=97 && a<=122)		//소문자
			{		
	
			a -= 32;						//소문자 → 대문자로					
			
			System.out.printf(">> %c\n",a);

			}else							// 그 외

			System.out.println(">> 입력 오류~!!!!");	
	
	
	
	
	}
}

//실행 결과
/*

알파벳 한 문자 입력: a
>> A
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력: G
>> g
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력: 1
>> 입력 오류~!!!!
계속하려면 아무 키나 누르십시오 . . .

*/