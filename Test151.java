/*=====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

import java.util.Stack;

public class Test151
{	
	// 정적 문자열 배열 선언 및 초기화
	public static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	// 사용자 정의 생성자
	public Test151
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → <String>
		Stack<String> st = new Stack<String>();
	}

	// st 라는 Stack 자료구조에 데이터 담기
	// st = colors; (X)

	for (String color : colors )
	{
		st.push(color);

	}

	st.push(
	// 출력 메소드
	popStack(st);




	// 출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while(!=st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();

	public static void main(String[] args)
	{
		new Test151;
	}
	}
}