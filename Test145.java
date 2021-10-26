/*========================================
  ■■■ 예외(Exception) 처리 ■■■
==========================================*/


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test145
{
	private String[] data = new String[3];
	
	public void proc() //throws IOException
	{

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try
		{
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
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("get Message : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace.............");

		}
	}


	public static void main(String[] args)  // throws IOException
	{
		Test145 ob = new Test145();
		ob.proc();							// 내부에서 폭발물 처리한 것
	}
}



