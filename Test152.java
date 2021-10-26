/* ==============================================
 	 컬렉션 프레임워크(Collection Framework)                           
===============================================*/

/*
 ○	큐(Queue)

	큐(Queue)는 FIFO(First Input First Output) 구조ㄹ
	먼저 입력된 자료를 먼저 출력하며,
	Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

 ※ Queue 인터페이스 인스턴스를 생성하기 위해서는
 	new 연산자를 이용하여 Queue 인터페이스를 구현한(implements) 
	클래스 생성자를 호출한다.

	ex) Queue ob = new LinkendList();


 ○	주요 메소드

 	- E element()
	  큐의 head 요소를 반환하며 삭제하지 않는다.

	- boolean offer(E o)
	  지정된 요소를 큐에 삽입한다.
	  
	- E peek()
	  큐의 head 요소를 반환하고 삭제하지 않으며 
	  큐 자료구조가 empty인 경우 null을 반환한다.

	- E poll()
 	  큐의 head 요소를 반환하고 삭제하며
 	  큐 자료구조가 empty 인 경우 null 을 반환한다.

	- E remove()
	  큐의 head 요소를 반환하고 삭제한다.

*/
import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		// Queue myQue = new Queue();	- 인터페이스 라서 직접 인스턴스 생성 Ⅹ
		Queue<Object> myQue = new LinkedList<Object>();

		// 데이터 준비
		String str1 = "이지영";
		String str2 = "장민지";		
		String str3 = "권순모";
		String str4 = "김소연";

		// myQue 라는 Queue 자료 구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		// [이지영, 장민지, 권순모, 김소연]
		// 실제 데이터 Ⅹ, 더미 데이터 ○ → 더미 데이터로 자료를 

		System.out.println(test);
		// true
		// => offer는 매개변수로 넘겨받은것을 적재하고, true/false를 반환하는 두가지 역할

		// Queue 자료구조에서 요소를 제거하지 않고 head 요소 변환
		System.out.println("값1 : " + (String)myQue.element());
		//							          --------------- 오브젝트
		System.out.println("값2 : " + (String)myQue.element());
		// 값1 : 이지영
		// 값2 : 이지영

		System.out.println();
		
		String val;

		// ①
		// peek()
		// 큐의 head 요소 반환, 제거 안함.
		// 큐가 empty 일 경우 null 반환
		
		/*
		while (myQue.peek() != null)
		{
			// poll()
			// 큐의 head 요소 반환, 제거함.
			// 큐가 empty 일 경우 null 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		// 요소 : 이지영
		// 요소 : 장민지
		// 요소 : 권순모
		// 요소 : 김소연
		*/

		// 위랑 비교
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		// 요소 : 장민지
		// 요소 : 김소연		

		/*
		// ②
		while (true) // 무한루프
		{
			val = (String)myQue.poll();
			
			if (val==null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		// 요소 : 이지영
		// 요소 : 장민지
		// 요소 : 권순모
		// 요소 : 김소연

		// ③
		while (!myQue.isEmpty()) 
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		// 요소 : 이지영
		// 요소 : 장민지
		// 요소 : 권순모
		// 요소 : 김소연
	
	}
}