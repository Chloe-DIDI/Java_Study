/*=====================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
=======================*/

// 사용자로부터 처음 입력받은 인원 수 만큼의
// 학생 이름과 전화번호를 입력받고
// 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
// 단, 배열을 활욜하여 처리할 수 있도록 한다.

// 실행 예)
// 입력 처리 할 학생 수 입력(명, 1~10) : 24
// 입력 처리 할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 손범석 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 채지윤 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 최현정 010-3333-3333

//------------------------
// 전체 학생 수 : 3명
//------------------------
//   이름    전화번호
// 손범석  010-1111-1111	
// 채지윤  010-2222-2222
// 최현정  010-3333-3333
//------------------------
//계속하려면 아무 키나 누르세요...


import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
	//Scanner 인스턴스 생성
    Scanner sc = new Scanner(System.in);

	//사용자가 입력하는 학생 수를 담아둘 변수
    int memCount = 0;

	do
	{
		System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
        memCount = sc.nextInt();
	}
	while (memCount<1 || memCount>10);
    
	//테스트
	//System.out.println("사용자가 입력한 인원수 확인 : " + memCount);

	//배열 생성(이름 배열, 전화번호 배열)
	// - 사용자로부터 입력받은 인원수 만큼의 배열방 구성

	//이름 저장 배열
	String[] names = new String[memCount];

	//전화번호 저장 배열
	String[] tels = new String[memCount];
	//『String[] tels = new String[names.lenght];』 와 동일한 구문
	
	for (int i=0; i<memCount; i++)
	{ 
	System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
	 // 손범석 010-1111-1111
     names[i] = sc.next();
     tels[i] = sc.next();
	}
	

	// 최종 결과(이름, 전화번호) 출력
	System.out.println();
	System.out.println("---------------------------------");
	System.out.printf("전체 학생 수 : %d명\n", memCount);
	System.out.println("---------------------------------");
	System.out.println("이름    전화번호");

	for(int m=0; m<memCount; m++)
		System.out.printf("%4s %14s\n", names[m], tels[m]);
	
	System.out.println("---------------------------------");


	
	}
}


//내가 푼 것
/*
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{

    Scanner sc = new Scanner(System.in);
    int n;
    String[] name;
    String[] tel;
    
     do{
        System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
        n = sc.nextInt();
    }while(n<1 || n>10);
 
    name = new String[n];
    tel = new String[n];
    
    for(int i=0;i<n;i++) {
        System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i+1);
        name[i] = sc.next();
        tel[i] = sc.next();
    }
    
    // 출력하기
    System.out.println("---------------------------------");
    System.out.printf("전체 학생 수 : %d명\n", n);
    System.out.println("---------------------------------");
    System.out.println("이름\t전화번호");
    for(int i=0;i<n;i++)
        System.out.println(name[i]+" "+tel[i]);
    
    System.out.println("---------------------------------");
 
    }
 
}
*/
//실행결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 손범석 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 채지윤 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 최현정 010-3333-3333
---------------------------------
전체 학생 수 : 3명
---------------------------------
이름    전화번호
손범석 010-1111-1111
채지윤 010-2222-2222
최현정 010-3333-3333
---------------------------------
계속하려면 아무 키나 누르십시오 . . .

*/
