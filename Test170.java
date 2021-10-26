/* =================================
 	   �ڹ��� �⺻ ����� (I/O)             
==================================*/

// Reader �ǽ�
// Test168.java ���ϰ� ��~!!!!!!!!


import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;

public class Test170
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		//System.in			: �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		//InputStreamReader : ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������
		//
		//Reader			: ���� ��� ��Ʈ�� ��ü
		
		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����Ctrl+z)");

		while ((data = rd.read()) != -1)	// ���ڱ������ ��Ʈ�� �޾ƿ�
		{
			ch = (char)data;
			//System.out.write(ch);
			/*
			���ڿ� �Է�(����Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/

			System.out.print(ch);
			/*
			���ڿ� �Է�(����Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

		}
	}
}