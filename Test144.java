/*========================================
  ���� ����(Exception) ó�� ����
==========================================*/

// ���� �߻� �Ǿߴ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Test144
{
	private String[] data = new String[3];
	
	public void proc() throws IOException
	{

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

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

	public static void main(String[] args) throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}


