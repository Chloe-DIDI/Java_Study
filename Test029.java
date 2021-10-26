/*===========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
=============================================================*/


// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 산출하여 처리한다.

// 90점 ~ 100점 : A			80점 ~ 89점 : B
// 70점 ~  79점 : C			60점 ~ 69점 : D
// 60점 미만    : F

// 단, BufferedReader 를 활용하여 데이터를 입력받을 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
// 이름 입력 : 손범석
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 손범석입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70.
// >> 총점은 240이고, 평균은80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무키나 누르세요...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;			//-- 이름
		int kor, eng, mat;		//-- 국어, 영어, 수학 점수
		int tot;				//-- 총점
		//int tot = 0;
		double avg;				//-- 평균
		char grade='F';				//-- 등급 ,,,,A나 B 등등 문자하나니까 char로 충분
		//char grade; 밑에 else만 입력할려고하면 이렇게작성하고 아니면='F'입력


		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		//tot += kor;

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		//tot += eng;


		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		//tot += mat;


		// 총점 산출
		tot = kor + eng + mat;
		
		// 평균 산출
		avg = tot / 3.0;		//check~!!!! 실수기반의 연산이 되게하기위해

		// 등급 산출

		// ※ 두 개 이상의 조건 → 논리 연산자
		//    평균이90점이상  평균이100점이하
		if (avg>=90)
		{
			//등급이 A
			grade = 'A';
		}
		else if (avg>=80)
		{
			//등급이 B
			grade = 'B';
		}
		else if (avg>=70)
		{
			//등급이 C
			grade = 'C';
		}
		else if (avg>=60)
		{
			//등급이 D
			grade = 'D';
		}
		else if(avg<60)  //아니면  else 만..
		{
			//등급이 F
			grade = 'F';
		}

		//최종 결과
		System.out.println();
		System.out.printf(">>당신의 이름은 %s입니다.\n", name);
		System.out.printf(">>국어 점수는 %d,\n", kor );
		System.out.printf(">>영어 점수는 %d,\n", eng);
		System.out.printf(">>국수어 점수는 %d,\n", mat);
		System.out.printf(">>총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(">>등급은 %c입니다.\n", grade);

	}
}

// 실행 결과

/*
이름 입력 : 손범석
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>>당신의 이름은 손범석입니다.
>>국어 점수는 90,
>>영어 점수는 80,
>>국수어 점수는 70,
>>총점은 240이고, 평균은 80.00입니다.
>>등급은 B입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
		// 내가한거 해결 못함 ㅠ
		
/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, mat, tot;
		double avg;	
		String strName;
		char grade;

		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot/3;

		if (kor >= 90){
		grade = 'A';
		}else if(kor >= 80){
		grade = 'B';
		}else if(kor >= 70){
		grade = 'C';
		}else{
		grade = 'F';
		}

		//실행 결과

		
		System.out.printf("\n>> 당신의 이름은 %s입니다",strName);
		System.out.printf("\n>> 국어 점수는 %d",kor);
		System.out.printf("\n>> 영어 점수는 %d",eng);
		System.out.printf("\n>> 수학 점수는 %d",mat);
		System.out.printf("\n>> 총점은 %d이고 평균은 %.2f입니다.", tot, avg);
		System.out.printf("\n>> 등급은 %c입니다.",grade);
	}
}

	*/
