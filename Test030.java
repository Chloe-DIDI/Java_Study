/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
=============================================================*/

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������... ¦������, Ȧ������, ������
//����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�.


// ���� ��)
// ������ ���� �Է� : 14
// 14��¦��
// ����Ϸ��� �ƹ�Ű��...

// ������ ���� �Է� : 3
// 3 �� Ȧ��
// ����Ϸ��� �ƹ�Ű��...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		

		/*  //--==>>�̰� 0�� ¦���� ����������ϱ� �ȵ�

		if (n%2==0)
		{
			System.out.println( n + " �� ¦��");
		}
		else if ((n%2!=0))
		{
			System.out.println( n + " �� Ȧ��");
		}
		else
		{
			System.out.println( n + " �� ��");
		}     
		*/

		String strResult = "�Ǻ��Ұ�";
		

		if(n%2!=0)
		{
			strResult = "Ȧ��";
		}
		else if(n==0)
		{
			strResult = "��";
		}
		else if(n%2==0)
		{
			strResult = "¦��";
		}

		System.out.println(n+ "��" +strResult);

	}
}

//������
/*
������ ���� �Է� : 3
3��Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/