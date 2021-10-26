/* ==============================================
 	 컬렉션 프레임워크(Collection Framework)     
===============================================*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용 → 자료형

import java.util.Vector;


// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;	// 이름
	private int age;		// 나이

	// getXxx()	→ getter
	// setXxx()	→ setter

	// getter / setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// 생성자 (매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 생성자 (매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}
public class Test158
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v에
		// 채지윤 13세 /  김진령 7세 / 장진하 5세
		// 담아내기

		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("채지윤");
		st1.setAge(13);
	
		MyData st2 = new MyData();
		st2.setName("김진령");
		st2.setAge(7);

		MyData st3 = new MyData();
		st3.setName("장진하");
		st3.setAge(5);
		
		v.add(st1);
		v.add(st2);
		v.add(st3);
		*/
		
		// ②
		/*
		MyData st1 = new MyData("채지윤",13);
		MyData st2 = new MyData("김진령",7);
		MyData st3 = new MyData("장진하",5);
		
		v.add(st1);
		v.add(st2);
		v.add(st3);
		*/

		// ③
		v.add(new MyData("채지윤",13));
		v.add(new MyData("김진령",7)); 
		v.add(new MyData("장진하",5)); 

		// 벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름 : 채지윤, 나이 : 13세
		// 이름 : 김진령, 나이 : 7세
		// 이름 : 장진하, 나이 : 5세

		// ①
		for ( MyData md : v )
			System.out.printf("이름 : %s, 나이 : %d세\n", md.getName(), md.getAge());
		System.out.println();
		
		// ②
		for (int i=0;i<v.size();i++)
			System.out.printf("이름 : %s, 나이 : %d세\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();

		// ③
		for ( Object temp : v )
		//	 ------------- 업캐스팅 (MyData를 Object 형식으로)
			System.out.printf("이름 : %s, 나이 : %d세\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		//												   ------------- 다운캐스팅
		System.out.println();

		// 이름 : 채지윤, 나이 : 13세
		// 이름 : 김진령, 나이 : 7세
		// 이름 : 장진하, 나이 : 5세

	}
}





