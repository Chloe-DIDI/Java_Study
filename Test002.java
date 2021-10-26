/*================================
■■■자바 컴파일 및 실행■■■
==============================*/
//도구->사용자그룹->1번에잇어야 ctrl 1 or2 햇을때 컴파일,실행된다
//shift ctrl 1 단축키


public class Test002
{
	public static void main (String[] args)
	{
		//①
		//System.out.println("Welcome to JAVA");
		//System.out.println("First JAVA Program");

		//②
		//System.out.print("첫 번째 프로그램");
		//System.out.print("두 번째 프로그램");

		//③
		//System.out.print(첫 번째 프로그램);
		//System.out.print(두 번째 프로그램);
		//-> 에러발생 
		//()안에 ""안넣으니까 에러발생함


		//④
		System.out.print("첫 번째\n 프로그dpn");

		//※ println() 과 print() 메소드의 차이는
		//   라인 스킵(줄바꿈, 개행) 유무 차이
		
		//System.out.print("\\n");
		//『\n』을 문자열에 포함하면 라인 스킵 가능
		//만약 \n을 출력을 하고싶으면 \\n하면된다.



	}
}

//실행결과
/* ①
Welcome to JAVA
First JAVA Program
계속하려면 아무 키나 누르십시오 . . .
*/

//실행결과
/* ②
첫 번째 프로그램두 번째 프로그램계속하려면 아무 키나 누르십시오 . . .
*/

//③
//에러 발생(컴파일 에러)

//④
/*
첫 번째
 프로그램
두 번째 프로그램
계속하려면 아무 키나 누르십시오 . . .
*/