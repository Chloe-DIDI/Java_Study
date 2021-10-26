/* ==============================================
 	 컬렉션 프레임워크(Collection Framework)                           
===============================================*/

// Map → Hashtable, HashMap
// - java.util.Map 인터페이스는	
//	 키(Key)를 값(value)에 매핑(mapping)하며,
//	 동일한 키를 등록할 수 없고, 유일해야 하며(고유해야 하며)
//	 각 키는 한 개의 값만을 매핑해야 한다.
//	 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

/*
 ○ Hashtable<K, V> 클래스
 	
	- 해시테이블 구조를 객체 모델링한 클래스로 
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

	- 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
	  구분된 데이터 구조이다.

	- 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
	  이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

	- 또한, Hashtable 클래스는 key 또는 value 의 값으로 null을 허용하지 않는다.
*/

import java.util.Hashtable;

public class Test166
{
	private static final String[] names
		= {"서승균","김진희","최현정","손범석","최수지","이찬호"};

	private static final String[] tels
		= {"7202","9032","8143","7043","6988","5057"};

	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht 라고 명명한 Hashtable 자료구조에
		// 배열(names, tels)에 담겨있는 데이터를 요소로 담아내기
		// → put(k,v)

		for (int i=0;i<names.length;i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht 라는 Hashtable 의 값을 key 를 이용하여 검색
		// → get(k)
		String findName1 = "최현정";
		String str = ht.get(findName1);
		if (str != null)
			System.out.println(findName1 + " 전화번호 : " + str);
		System.out.println();
		// 최현정 전화번호 : 8143


		// ht 라는 Hashtable 자료구조에 key가 존재하는지의 여부 확인
		// → containsKey(k)
		String findName2 = "윤유동";
		if (ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다. ");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다. ");
		System.out.println();
		// 윤유동 데이터가 존재하지 않습니다.

		String findName3 = "이찬호";
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " 데이터가 존재합니다. ");
		else
			System.out.println(findName3 + " 데이터가 존재하지 않습니다. ");
		System.out.println();
		// 이찬호 데이터가 존재합니다.


		// ht 라는 Hasttable 자료구조에 value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "7202";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다. ");
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다. ");
		System.out.println();
		// 7202 데이터가 존재합니다.

		
		// ht 라는 Hasttable 자료구조에서 『김진희』 데이터 삭제
		// → remove()
		ht.remove("김진희");
		// 『remove()』 메소드는 인자값으로 key 를 넘겨받지만 
		//  이 때, key만 삭제되는 것이 아니다.
		//  해당 key와 연결되어(매핑되어) 있는 value 도 함께 remove() 된다.
		if (ht.containsKey("김진희"))
			System.out.println("김진희가 존재합니다. ");
		else
			System.out.println("어디갔어?");
		System.out.println();
		// 어디갔어?


		// 삭제(remove()) 이후 value 존재하는지 확인
		if (ht.contains("9032"))
			System.out.println("9032 데이터가 존재합니다. ");
		else
			System.out.println("9032 데이터가 존재하지 않습니다. ");
		System.out.println();
		// 9032 데이터가 존재하지 않습니다.

	
		// null 관련 처리 관찰
		// ht.put(null, null);		// key 와 value 모두 null	→ 런타임에러
		// ht.put("장진하", null);	// value 가 null			→ 런타임에러
		// ht.put(null, "2587");	// key 가 null				→ 런타임에러

	
		// 중복된 key 입력
		ht.put("손범석","1234");
	
		System.out.println(ht.get("손범석"));
		System.out.println();
		// 1234
		// 기존 "7043" 에서 "1234"로 변경되었음을 확인
		// (덮어쓰기 개념)


		// 중복된 value 입력
		ht.put("권순모","8143");

		System.out.println(ht.get("최현정"));
		System.out.println(ht.get("권순모"));
		System.out.println();
		// 8143
		// 8143

		// ※ value는 중복된 값이 입력되어도 기존 데이터에 아무런 영향을 미치지 않음.

	}
}




