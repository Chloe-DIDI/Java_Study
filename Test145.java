/*========================================
  ���� ����(Exception) ó�� ����
==========================================*/


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test145
{
	private String[] data = new String[3];
	
	public void proc() //throws IOException
	{

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try
		{
			System.out.print("�̸� �Է�(����:Ctrl+z) : ");

			while ((str = br.readLine()) != null)
			{
				data[n++] = str;
				System.out.print("�̸� �Է�(����:Ctrl+z) : ");
			}

			System.out.print("�Էµ� ����...");
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
			System.out.println("���� �߻�~!!!");
			System.out.println("get Message : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace.............");

		}
	}


	public static void main(String[] args)  // throws IOException
	{
		Test145 ob = new Test145();
		ob.proc();							// ���ο��� ���߹� ó���� ��
	}
}



