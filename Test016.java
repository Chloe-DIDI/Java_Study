/*===============================================
  ■■■ 자바의 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : java.util.Scanner
=================================================*/

//※java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	디폴트(default)로 사용되는 단락문자는 공백이다.
//	작성된 다음 토큰은 『next()』 메소드를 사용
//	다른 형태(자료형)의 값으로 변환할 수 있다.


import java.util.Scanner;

public class Test016
{
	public static void main(String[] args) //throws IOException
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		String name;		//--이름
		int kor, eng, mat;	//--국어,영어,수학 점수

		//○ 연산 및 처리
		System.out.print(" 이름을 입력하세요 : ");
		//br.readLine();
		name = sc.next();

		System.out.print("국어점수 입력 : ");
		//kor  =  "90"
		// ↑      ↑
		//문자열 = 정수형 이니까 이걸 같게 만들어줘야되니까
		//kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());	//-> 이렇게써도됨
		kor = sc.nextInt();

		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		mat = sc.nextInt();

		//○결과 출력

		System.out.println();
		System.out.println(">>이름 : " + name);
		System.out.println(">>총점 : " + (kor + eng + mat));
											//!	↑()안부터 먼저 실행됨







	}
}
