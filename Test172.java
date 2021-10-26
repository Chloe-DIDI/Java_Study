/* =================================
 	   �ڹ��� �⺻ ����� (I/O)             
==================================*/

// Reader Writer �ǽ�


import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172	//2�� ������ ��~!!!!!!!!!!!!!!!(�ؿ� 1������ ����Ȯ������!)
{						// ����� ����Ʈ ����� �Է½�Ʈ����  �Ѱ� ����
	public void process(InputStream is)
	{
		int data;		//��������

		System.out.println("���ڿ� �Է�(����Ctrl+z)");	//����ް�

		try
		{	
			// �Ű����� is ��� ����Ʈ ��� ��ü(InputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(��InputStreamReader �� ����)
			//Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
								// �̰� ���� 
			Reader rd = new InputStreamReader(is);	//���ڱ�ݽ�Ʈ������ ����� ƴ

			//����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			//���� ��Ʈ������ ��ȣ���Ͽ�
			//(�� OutputStreamWriter �� ����)
			//Wrtier Ÿ���� wt ���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);//����Ʈ ����� ��½�Ʈ��
			
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
		ob.process(System.in);		//1��. ����Ʈ ����� �Է½�Ʈ��
	}
}

// ���� ���
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