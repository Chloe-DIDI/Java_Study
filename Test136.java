/*========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ����
==========================================*/
/*
�� StringTokenizer Ŭ������
   ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� 
   ���ڿ��� ��ū(token)�̶�� �Ѵ�.

   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer �� import �ؾ� �Ѵ�.

   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
   ���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű���� 
   ����� ���� �����ϰ� �ִ�.

�� ������
   - ����
   StringTokenizer(String str)
   StringTokenizer(String str, String delim)
   StringTokenizer(String str, String delim, boolean returnDelims)
   �� �־��� ���ڿ� str �� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
   	  ����(����)���ڴ� delim �� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	  ���� returnDelims �� true ���
	  ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test136
{
	public static void main(String[] arg) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");	//"���,����,�ٳ���,�丶��"
		strTemp = br.readLine();
		//-- "���,����,�ٳ���,�丶��"


		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp �� ��� ���ڿ���...
		//   ��,���� �����ڷ�...

	
		strArr = new String[st.countTokens()];		// st.countTokens() �� 4
		//-- int countTokens()
		//   : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.
		
		// �� �긦 Ȱ���ϴ� ��� ��
		n=0;
		while (st.hasMoreTokens())		// true / false
		{
			strArr[n++] = st.nextToken();
		}
		//-- ��st.hasMoreTokens()�� 
		//	  : ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ.
		//		�� �̻� ����� ��ū�� �������� ���� ��� false �� ��ȯ
		//		Ȯ�� ����� ��ȯ�� ��...
		//		���� ������ �о���̴� ���(��)�� �̵���Ű�� �ʴ´�.

		//-- ��nextToken()�� 
		//	  : ���� ��ū�� ���´�.
		//		���� ��ū�� ������ ���(��) �̵���Ű�� �ȴ�
		//		�����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//		�ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.



		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");

		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �Ľ��� ���ڿ� �Է�(�ĸ�����) : ���� ���� �ٴ� ���
		//		 �Ľ̵� ��ū(���ڿ�) : ���� ���� �ٴ� ���
		//		 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

	}

}


