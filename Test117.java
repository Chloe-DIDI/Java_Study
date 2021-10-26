/* =======================================
		      클래스 고급
		- 인터페이스(Interface)
========================================*/

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2108006권순모
// 국어 영어 수학 점수 입력	  (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2108024 김소연
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 2108006 권순모	  90 100 85		  275		91
//					  수  수 우
// 2108024 김소연	  85 70 65		  220		73
//					  우 미 양

// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스
import java.util.Scanner;
import java.io.IOException;

class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}
// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	int num,i,j;
	int[][] temp;
	char[][] rank;
	Record[] rc;
	
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		rc = new Record[num];
		temp = new int[num][3];
		rank = new char[num][3];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (i=0; i<num; i++)
		{
			rc[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",(i+1));

			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.printf("국어 영어 수학 점수 입력   (공백 구분) : ");

			temp[i][0] = rc[i].kor = sc.nextInt();
			temp[i][1] = rc[i].eng = sc.nextInt();
			temp[i][2] = rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot/3;
		}

		System.out.println();
		for (i=0; i<num; i++)
		{
			for(j=0; j<3; j++)
			{
				switch (temp[i][j] - temp[i][j]%10)
				{
					case 100: case 90: rank[i][j]='수'; break;
					case 80: rank[i][j]='우'; break;
					case 70: rank[i][j]='미'; break;
					case 60: rank[i][j]='양'; break;
					default: rank[i][j]='가'; break;
				}
			}
		}
	}
 // Sungjuk 인터페이스의 모든 메소드를 Override하지 않으면 SungjukImpl 클래스가 추상클래스가 되기때문에 Override해줘야 한다.
 //-- Sungjuk 인터페이스의 print() 메소드를 Override한 SungjukImpl 클래스의 print() 메소드
	@Override
	public void print()
	{
		System.out.println();
		//-- 입력된 질문들과 분리시키기 위해 개행을 해준다.
		for (i=0; i<num; i++)	//-- 단일포문은 입력된 인원수(num)만큼 반복하며 첫번째 학생(re[0], rank[0])부터 시작된다.
		{			
			System.out.printf("%s  %s  %3d %3d %3d\t%3d  %3d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			//-- 학번, 이름, 국어점수, 영어점수, 수학점수, 총합, 평균을 출력한다.
			System.out.printf("\t\t%3c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
			//-- rank[][] 배열은 해당 학생의 국어등급(rank[i][0]), 영어등급(rank[i][1]), 수학등급(rank[i][2])를 담고 있다.
			//   따라서 해당 rc[i] 학생의 등급이 출력된다.
		}
	}//end print()
}


// main() 메소드를 포함하는 외부의 다른 클래스	
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob = new SungjukImpl();


		ob.set();
		ob.input();
		ob.print();

	}
}