/*==============================
  ■■■ 클래스 인스턴스 ■■■
    - 클래스와 인스턴스 활용
================================*/

// 2. Sungjuk 클래스
//  - 인원 수를 입력받아, 입력받은 인원수 만큼
//    이름, 국어점수, 영어점수, 수학점수를 입력받고
//    총점과 평균을 산출하는 클래스로 설계할 것~!!!
//   · 속성 : 인원 수, Record 형태의 배열
//   · 기능 : 인원 수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

import java.util.Scanner;

public class Sungjuk
{
	// 주요 속성 구성(주요 변수 선언)
	int inwon;		//-- 인원 수
	
	// 다정이가 선언한 Record 배열 ㅠㅠ
	//Record rec;		//-- Record 배열(학생 한명 당 Record 배열 방 한 개 활용)
					//   Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열
	
	// 원래 선언되어야 할 Record 배열
	Record[] rec;

	// 다정아~ 위에서 선언한 속성 중 Record 배열 형태의 변수가...
	// 데이터타입이... 이상한 것 같은데...? ㅠㅠ


	
	// 주요 메소드 정의(기능 구성)
	// ① 인원 수 입력
	public void set()	// 이름 set
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100): ");
			inwon = sc.nextInt();
		}
		while (inwon<1||inwon>100);

		// check~!!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성
		rec = new Record[inwon];		//그릇은 rec , 그걸 inwon 만큼
		//-- Record 배열방을 inwon 만큼 생성한 것이지
		//	 Record 클래스의 인스턴스를 생성한 것은 아니다.
	}

	// 주요 메소드 정의(기능 구성)
	// ② 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : ","영어 점수 : ","수학 점수 : "};

		// 인원수 만큼 반복 → 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i=0; i<inwon; i++) // for (int i=0; i<rec.length; i++)
		{

			//check~!!!
			//Record 클래스 기반의 인스턴스 생성
			/*
			Record ob = new Record();
			rec[i] = ob;
			*/ // 위에 /* 이것과 */ 밑에 꺼 같은 말이다.
			rec[i] = new Record();

			System.out.printf("%d번째 학생 이름 입력 : ", (i+1));
			//rec배열의0번째방의 이름= sc.nextInt();
			//		   └i  ==>> rec배열의i번째방의 이름
			rec[i].name = sc.next();

			/*
			System.out.print("국어 점수 : ");
			//rec배열의i번째방의 국어= sc.nextInt();
			rec[i].kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			//rec배열의i번째방의 영어= sc.nextInt();
			rec[i].eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			//rec배열의i번째방의 수학= sc.nextInt();
			rec[i].mat = sc.nextInt();
			*/

			for (int j=0; j<title.length; j++)	// 0 1 2 쑝쑝쑝
			{
				//안내 메세지 출력
				System.out.print(title[j]);		

				//사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				rec[i].score[j] = sc.nextInt();	//i번째 학생의 score[0] → 국어점수
												//i번째 학생의 score[1] → 영어점수
												//i번째 학생의 score[2] → 수학점수

				//국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				//총점 누적하기
				rec[i].tot += rec[i].score[j];

			}

			//평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;
		
	
		}
	}//end input()


	// 주요 메소드 정의(기능 구성)
	// ② 결과 출력
	// 서승균	90  80  70  240  xx.xx	2
	// 채지윤   82  72  62  xxx  xx.xx	3
	// 이찬호	98  88  78  xxx  xx.xx	1

	public void print()
	{

		// check~!!!!!
		// 석차 산출 메소드 호출 ~!!!!(구문 추가)
		ranking();		// 인스턴스 메소드


		System.out.println();		//개행

		//학생 한 명 당 반복 출력구문 구성
		for (int i=0; i<inwon; i++)
		{
			// 이름 출력
			System.out.printf("%5s", rec[i].name);

			// 성적(국어,영어,수학) 반복 출력
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);		
			
			// 석차에 대한 출력구문 추가~!!!!(구문 추가)
			System.out.printf("%5d", rec[i].rank);		

	
			// 개행
			System.out.println();

			
		}
	}//end print()
		
	 // ④ 석차 산출 메소드 추가~!!!
	 //    - Record 배열의 rank 속성 초기화 기능 → 반환 자료형 void
	 //	   - 클래스 내부에서 활용할 메소드로 정의 → 접근제어 지시자 private
	 private void ranking()
	 {
		 int i, j;			//--루프 변수

		 // 모든 학생들의 등수(석차, rank)를 1로 초기화
		 for (i=0; i<inwon; i++)
		 {
			 rec[i].rank = 1;
		 }

		 //등수산출...ex) 4명이라면... 
		 for (i=0; i<inwon-1; i++)	    //-- 비교 기준  0   1   2
		 {								//			    ↓  ↓  ↓
			 for (j=i+1; j<inwon; j++)	//-- 비교 대상 123  23  3
			 {
				 if (rec[i].avg > rec[j].avg)		//-- 비교기준의 평균이 비교대상의 평균보다 크다면...
				 {
					 	rec[j].rank++;		//-- 비교대상의 rack를 1만큼 증가
				 }
				 else if (rec[j].avg > rec[i].avg)		//-- 비교 대상의 평균이 비교기준의 평균보다 크다면...
				 {
						rec[i].rank++;	 //-- 비교기준의 rank를 1만큼 증가
				 }
			 }
		 }

		
 	 }

}//end class()