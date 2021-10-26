/* =================================
 	   자바의 기본 입출력 (I/O)             
==================================*/

// OutputStream 실습

import java.io.OutputStream;
import java.io.IOException;

public class Test169
{
	public static void main(String[] args) throws IOException
	{
		//System.in : 자바의 표준 입력 스트림
		//System.out : 자바의 표준 출력 스트림

		OutputStream out = System.out;	//수도꼭지 틈

		byte[] ch = new byte[3];

		ch[0] =  65;	// A		//데이터들
		ch[1] =  97;	// a
		ch[2] =  122;	// z

		
		out.write(ch);	//-- 밖으로 내보낼 데이터(변수)를 스트림에 기록
						// 물줄기에다가 데이터를 띄운다
		
		out.flush();	//-- 기록된 스트림을 내보내는(밀어내는) 기능을 수행
						// 지금은 Buffer를 활용하지 않고 있는 상황이기 때문에
						// 생략이 가능한 코드
						// (Buffered 되어 있는 스트림(Stream)일 경우 생략 불가)
						// 물을 흘려 내보낸다
		
		out.close();	//-- 출력 스트림(물줄기)에 대한 리소스 반납
						// (out 스트림을(수도꼭지를) 잠가버린 상황)
						// 수도꼭지 잠근것
		

		System.out.println("절대적인 신뢰를 갖는 구문.....");	//수도꼭지를 잠궈서 이건 안나온다.
		//-- 『out.close()』를 작성한 이후 출력되지 않는 구문
		//	  출력되는 스트림(물줄기)을 닫았기 때문에...

	}
}