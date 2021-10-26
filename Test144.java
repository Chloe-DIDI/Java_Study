/*========================================
  ■■■ 예외(Exception) 처리 ■■■
==========================================*/

// 예외 발생 되야댐!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test144
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		System.out.print("이름 입력(종료:Ctrl+z) : ");

		while ((str = br.readLine()) != null)
		{
			data[n++] = str;
			System.out.print("이름 입력(종료:Ctrl+z) : ");
		}

		System.out.print("입력된 내용...");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}



