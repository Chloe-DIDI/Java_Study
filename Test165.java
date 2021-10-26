/* ==============================================
 	 컬렉션 프레임워크(Collection Framework)                           
===============================================*/

// Set → HashSet, TreeSet
// - 순서 없음.
// - 중복을 허용하지 않는 구조(기본)

/*
 ○ TreeSet<E> 클래스

 	java.util.HashSet<E> 클래스는 
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test165
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set에 요소 추가 → add();
		set.add("하울의움직이는성");
		set.add("이웃집토토로");
		set.add("아기공룡둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("미래소년코난");
		set.add("원령공주");

		// Iterator를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// 겨울왕국 귀멸의칼날 미래소년코난 아기공룡둘리 원령공주 이웃집토토로 인사이드아웃 짱구는못말려 하울의움직이는성

		
  //================================================================

		// TreeSet에 객체를 적재한다면?
		
		// TreeSet 자료구조 인스턴스 생성
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		
		// set2.add(GradeVO);	: 객체로 넣을 수 없다. 인스턴스 생성해서 넣어야 함.
		// GradeVO ob = new GradeVO();
		set2.add(new GradeVO("20211523", "김김", 90, 80, 70));
		set2.add(new GradeVO("20211524", "이이", 91, 81, 71));
		set2.add(new GradeVO("20211525", "박박", 98, 78, 88));
		set2.add(new GradeVO("20211526", "최최", 72, 49, 99));
		set2.add(new GradeVO("20211527", "정정", 56, 31, 90));

		// Iterator 를 활용한 set 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (lt2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		// 컴파일 에러발생

		// MyComparator 클래스 설계 / TreeSet 생성 구문 변경 후 다시 실행
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		// GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		// GradeVO를 출력했기 때문에 해시코드가 출력
		// 속성값으로 찍어서 출력!
	
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())		
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n",
							vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(),
				vo.getMat(), vo.getTot());
		}
		System.out.println();
		
		
		
	}	
}

// VO → Value Object 
// DTO → Data Transfer Object
// DAO → Data Access Object
class GradeVO
{
	// 주요 속성 구성
	private String hak;			// 학번
	private String name;		// 이름
	private int kor, eng, mat;	// 국어점수, 영어점수, 수학점수

	// 사용자 정의 생성자 → 5개의 매개변수를 가진 생성자
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak; 
		this.name = name;
		this.kor = kor; 
		this.eng = eng; 
		this.mat = mat; 
	}

	// 사용자 정의 생성자 → 매개변수 없는 생성자
	// 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	// default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	// 추가로 정의한 생성자
	GradeVO()
	{
	}
	
	String getHak()
	{
		return hak;
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}
	
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의(총점 산출)
	int getTot()
	{
		return kor + eng + mat;
	}
}


class MyComparator<T> implements Comparator<T>
// T - the type of objects that may be compared by this comparator
//	Comparator 인터페이스를 상속해서 클래스를 생성하고,
//	기준을 잡아서 비교가 이뤄지도록 오버라이딩한다.
{
	@Override
	public int compare(T o1 ,T o2)	// 요소와 요소를 비교해서 
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준(오름차순)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//			『20211523』						『20211524』
		// return 20211523 - 20211524;
		// -1

		// 학번 기준(내림차순)
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// 총점 기준(오름차순)
		// return s1.getTot() - s2.getTot();

		// 총점 기준(내림차순)
		// return s2.getTot() - s1.getTot();

		
		// 이름 기준(오름차순)
		// return s1.getName().compareTo(s2.getName());

		// 이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());
	}
}

