/*====================================
	■■■ 자바의 개요 및 특징 ■■■
	-변수와 자료형
	-키워드 및 식별자
======================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 25;
		//char degree "A";

		String name = "최수지";
		//String name = " 박혜진 " ;
		//※ 스코프 영역 안에서 변수명은 식별자~!!

		//String #name = "이찬호"
		//--『$』와 『_』를 제외한 다른 특수문자는
		//변수의 이름으로 활용할 수 없다
		//하지만, 그나마 사용 가능한 이들 특수문자도
		//함부로 사용하는 것은 고려해야 한다.

		//int tel = 01012342345;
		//이렇게쓰면 앞에 정수로 나타나지기때문에 
		//앞에 0 떼고 결과값이 나온다

		String tel = "01012342345";
		String _tel = "010-1111-2222";

		String 주소 = "경기도 고양시";
		
		//결과 출력
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("주소 : " + 주소);

		//결과출력
		/*
		name : 최수지
		tel : 01012342345
		주소 : 경기도 고양시
		*/
	
	
	}
}