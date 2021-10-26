/* =======================================
 	  객체 직렬화(Object Serialization)             
==========================================*/

/*
○ 객체 직렬화(Object Serialization)는

   메모리에 생성된 클래스 객체르를 멤버 변수의 현재 상태를
   그대로 보존해서 파일에 저장하거나
   네트워크를 통해 전달할 수 있는 기능으로
   멤버 변수의 값을 보존한다거나
   다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다.

					------ 내용물이란 객체를 구성하는 데이터들,,
   즉, 객체 직렬화는 내용물을 바이트 단위로 변환하여 
   파일(저장) 또는 네트워크를 통해 송수신(스트림)이 가능하게
   만들어주는 것으로 이 때, 객체란 멤버 변수의 메모리만으로
   구성된 것을 말한다.

   따라서, 메소드와 생성자는 객체 직렬화의 대상에서 제외된다~!!! check~!!!!!!!


○ 객체 직렬화의 장점

   객체 자체의 내용을 입출력 형식에 구애받지않고
   객체를 파일에 저장함으로써 영속성(영구적)을 제공할 수 있으며
   객체 자체를 네트워크를 통해 손쉽게 교환할 수 있게 된다.

   객체 직렬화는 자바 1.1 이후에 도입되었는데
   그 이유는 RMI(원격객체통신) 와 Bean(진짜 그냥 Bean 객체/빈것아니다) 때문이었다.
   RMI는 원래 객체 통신을 지원해야 하기 때문에
   객체가 그대로 이동할 수 있어야 한다.
   따라서 이를 지원하기 위해서는 객체 직렬화가 필수적이었다.

   또한 Bean 은 설계 시 상태에 대한 정보를 저장할 때
   이 객체 직렬화를 사용하면 편하게 객체 상태를 저장할 수 있다.

※ RMI(Remote Method Invocation)
   서로 다른 가상 기계장치에 존재하는 함수를
   호출하고 실행하는 기능을 담당한다.
   서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의
   통신 구조를 지원하는 개념으로 이해하면 좋겠다.

※ Bean(빈)
   C/S 구조적 모델에서 서버측 구조에 해당하며
   재사용 간으한 소프트웨어 개체를 만들 수 있게 하는 컴포넌트 기술.
   작성된 개체의 공유가 가능하며 프로젝트에 쉽게 포함시킬 수 있도록 한다.
   클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리

 ○ 인터페이스
   
   객체 직렬화를 하기 위해 먼저 객체 직렬화가 가능하도록
   java.io.Serialization 인터페이스를 구현해 주어야 한다.
   이 인터페이스는 객체 직렬화가 제공되어야 한다는 사실을 
   jvm에게 알려주는 역할을 한다.
   또한,  인터페이스는 
   다른 인터페이스와 달리 구현해야 할 메소드가 없기 때문에 
   단지 선언만 해주면 된다.

   형식)
   1
   public class 클래스명 implemnetns Serialization
   {
	   //...
   }


   2
   Serialization 인터페이스를 구현한 후
   ObjectInputStream 클래스와 ObjectOutputStream 클래스를 이용하여
   객체 단위로 입출력을 수행하게 된다.

   ※ 멤버 변수가 static 으로 선언된 경우
   (즉, 클래스 변수일 경우)
   객체 직렬화의 대상에서 제외된다.

   ○ Object Stream

   java.io.ObjectInputStream
   ObjectInputStream =클래스는 ObjectOutputStream 클래스에 의해
   파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의
   직렬화를 해체하는 기능을 제공한다.
   단, java.io.Serialization 인터페이스와
   java.io.Enternalizable 인터페이스를 지원해주는 객체에 대해서만 
   사용이 가능하다.
   즉, Serialization 인터페이스와 Enternalizable 인터페이스를 
   구현한 객체에서만 사용이 가능하다는 것이다. 
   이때, readObject() 메소드를 이용하여
   스트림으로부터 직렬화된 객체를 읽을 수 있으며
    이렇게 읽은 객체는 배열, 문자열 또는 각 객체 등 
	원래의 형(Type)으로 캐스팅 해 주어야 한다.
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

//해쉬테이블 내용 파일에 저장하기
public class Test173
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		// 테스트
		//System.out.println(appDir);
		//--==>> C:\JavaStudy

		// 파일 객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir → C:\JavaStudy
		//-- appDir 위치(경로)를 중심으로 "\\data\\test.ser"를 
		//	 구성하겠다는 의미.
		//-- 결과적으로 『C:\JavaStudy\data\test.ser』 구성

		// 테스트(확인)
		// ①
		//System.out.println(f0.getParentFile().exists());
		//--==>> false

		// 테스트(확인)
		// ② 『C:\JavaStudy』 경로에 『data』 디렉터리 생성 후 확인
		//System.out.println(f0.getParentFile().exists());
		//--==>> true

		//디렉터리 구성이 존재하지 않는 상황이라면...
		if(!f0.getParentFile().exists())
		{
			//디렉터리를 만들겠다.
			f0.getParentFile().mkdir();
		}

		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// 생성한 h1 이라는 Hashtable 자료구조에 요소 추가
		h1.put("3", "가가가");
		h1.put("4", "나나나");
		h1.put("2", "다다다");
		h1.put("5", "라라라");
		h1.put("1", "마마마");

		// 테스트(확인)
		System.out.println(h1.get("1"));
		//--==>> 마마마

		// 파일 전용 출력 스트림 생성(수도꼭지 열기)
		FileOutputStream fos = new FileOutputStream(f0);//f0라는 배를 띄운것
		//-- 파일 전용 출력 스트림(물줄기)에 
		//	 f0 라는 파일 객체를 띄우겠다... (흘려 내보낼 수 있도록...)
		//InputStreamReader isr = new InputStreamReader(System.in);

		// 객체 전용 출력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 객체 전용 출력 스트림(물줄기)으로
		//   fos 라는 파일 전용 출력 스트림을 감싸겠다.
		//BufferedReader br = new BufferedReader(isr);

		// 위의 구문과 동일한 구문
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		//위의 개념과 비교할 구조적으로 동일한 구문
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//※ ObjectOutputStream 클래스는 
		//	 객체들을 출력하는 기능을 제공하는 클래스로
		//	 출력 스트림에 출력하기 전에
		//   내부적으로 객체 직렬화를 수행하게 된다.
		//   자바 기본형 데이터 또는 객체들을
		//   파일에 저장하거나 네트워크를 통해 전달하기 위해
		//   전달할 객체를 직렬화하는 기능을 제공하는 것이다.

		// 생성된 스트림에 내보낼 객체를 기록
		oos.writeObject(h1);

		oos.close();
		//-- ObjectOutputStream 리소스 반납

		fos.close();
		//-- FileOutputStream 리소스 반납

		// 내보내기 끝~!!!!!

		//-----------------------------------------------------------직렬화

//저장된 파일 내용 해쉬테이블로 불러오기
		// 읽어들이기 시작~!!!!

		if (f0.exists())		//--f0 파일 객체가 존재한다면...
		{						//oputput으로 내보냈으니 읽어들이땐 input
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStream)로 부터 읽어들인 객체(Object)를 ( → readObject 를 통해 처리)
			// 원래의 형(Hashtable)으로 캐스팅하여
			// h2 라는 Hashtable 자료구조에 담아내기
			Hashtable h2 = (Hashtable)ois.readObject();
			//위에 한줄이랑 밑에 두줄이랑 같은 뜻
			// Object obj = ois.readObject();
			// Hashtable h2 = (Hashtable)obj;
			
			ois. close();
			//-- ois 리소스 반납 → ObjectInputStream 리소스 반납

			fis.close();
			//-- fis 리소스 반납 → FileInputStream 리소스 반납

			//-------------------------------------------여기까지 수행하면 읽어들이는 작업 끝~!!!!!!!


			// 읽어들인 h2 객체의 내용 확인 
			String key;
			String value;

			// ※ Iterator 사용할 수 없음
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- key 값을 읽어들이는 과정

				//확인 
				//System.out.println(key);
				//--==>>
				/*
				5
				4
				3
				2
				1
				*/

				value = (String)h2.get(key);
				//-- key 를 활용하여 value 얻는 과정

				System.out.println(key + " → " + value);
				//--==>> 
				/*
				5 → 라라라
				4 → 나나나
				3 → 가가가
				2 → 다다다
				1 → 마마마
				*/
			}
		}
			
	}
}
