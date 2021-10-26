/* =================================
 	   자바의 기본 입출력 (I/O)             
==================================*/

// Reader Writer 실습


import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172	//2번 밑으로 쭉~!!!!!!!!!!!!!!!(밑에 1번있음 순서확인하자!)
{						// 여기로 바이트 기반의 입력스트림을  넘겨 받음
	public void process(InputStream is)
	{
		int data;		//변수선언

		System.out.println("문자열 입력(종료Ctrl+z)");	//출력햇고

		try
		{	
			// 매개변수 is 라는 바이트 기반 객체(InputStream)를
			//문자 스트림으로 변환하여
			//(→InputStreamReader 가 수행)
			//Reader 타입의 rd에서 참조할 수 있도록 처리
								// 이건 번역 
			Reader rd = new InputStreamReader(is);	//문자기반스트림으로 무룰기 틈

			//바이트 기반 스트림인 자바 기본 출력 스트림(System.out)을
			//문자 스트림으로 변호나하여
			//(→ OutputStreamWriter 가 수행)
			//Wrtier 타입의 wt 에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);//바이트 기반의 출력스트림
			
			while ((data = rd.read()) != -1)
			{
				wt.write(data);
				wt.flush();
			}

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		Test172 ob = new Test172();
		ob.process(System.in);		//1번. 바이트 기반의 입력스트림
	}
}

// 실행 결과
/*
문자열 입력(종료Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .
*/