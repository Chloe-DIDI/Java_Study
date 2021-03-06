/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - switch 문 실습
=============================================================*/

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [ break;]
	   case 상수2 : 문장2; [ break;]

	   [default : 문장n+1; [break;]]
	}
		
	switch 문의 『수식』과 case의 『상수』는
	byte, short, int, long 이어야 한다.

	case 문 뒤에 『break;』가 없는 형태인 경우
	다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본 모델)
*/

// 당신의 이름은 서승균 입니다.
// 총점은 xx, 평균은 xx 입니다.
// 등급은 A 입니다.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name= br.readLine();

		System.out.print("국어점수 입력 : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("영어점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("수학점수 입력 : ");
		int mat = Integer.parseInt(br.readLine());
		
		// 평균 - 편의상 정수로 처리
		int avg = (kor+eng+mat) / 3;

		char grade = 'F';

		/*
		if(avg>=90)
			grade = 'A';
		else if (avg>=80)
			grade = 'B';
		else if (avg>70)
			grade = 'C';
		else if (avg>=60)
			grade = 'D';
		//else
		//	grade = 'F';
		*/
		/*
		switch (avg)
		{
		case 10: grade='A';break;
		case  9: grade='A';break;
		case  8: grade='B';break;
		case  7: grade='C';break;
		case  6: grade='D';break;
		case  5: grade='F';break;
		case  4: grade='F';break;
		case  3: grade='F';break;
		case  2: grade='F';break;
		case  1: grade='F';break;
		case  0: grade='F';break;
		
		}
		*/

		switch (avg/10)
		{
		case 10: grade='A';break;
		case  9: grade='A';break;
		case  8: grade='B';break;
		case  7: grade='C';break;
		case  6: grade='D';break;
		default: grade='F';break;
		
		}
		System.out.printf("\n당신의 이름은 %s입니다.",name);
		System.out.printf("\n총점은 %d, 평균은 %d입니다.",(kor+eng+mat),avg);
		System.out.printf("\n등급은 %c입니다.\n",grade);

/*
			switch(avg/10)
			{
			case 10 : case 9 : grade='A'; break;
			case 8 : grade='B'; break;
			case 7 : grade='C'; break;
			case 6 : grade='D'; break;
			default : grade='F'; break;
			}

		System.out.printf("\n당신의 이름은 %s입니다.",name);
		System.out.printf("\n총점은 %d, 평균은 %d입니다.",(kor+eng+mat),avg);
		System.out.printf("\n등급은 %c입니다.\n",grade);
*/


	}
}

//실행 결과
/*
이름 입력 : 이중호
국어점수 입력 : 98
영어점수 입력 : 97
수학점수 입력 : 55

당신의 이름은 이중호입니다.
총점은 250, 평균은 83입니다.
등급은 B입니다.
계속하려면 아무 키나 누르십시오 . . .
*/