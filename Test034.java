/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
=============================================================*/

// �� ����
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾�
// �̸� �Ǻ��Ͽ� �Է¹��� ���ĳ��� ������ ��츸
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�.
// ����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ���
// �Է� ������ ���� ������ ����ڿ��� �ȳ��� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : E
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������....

// ���ĺ� �� ���� �Է� : a
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : B
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : t
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : 1
// >> �Է� ����~!!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{

		// �� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int a;		

		// �� ���� �� ó��
		System.out.print("���ĺ� �� ���� �Է�: ");
		a = System.in.read();

		if((a>=65&&a<=90)||(a>=97&&a<=122))	//�빮�� �ҹ���
		{
			if(a==65||a==69||a==73||a==79||a==85||a==97||a==101||a==105||a==111||a==117) // ���� �빮�� �ҹ���

				System.out.println(" >> ���� OK~!!!");
		}
		else					// �ƴҰ�� 
			System.out.print("�Է� ����~!!\n");	

		 
	}
}
//���� ���
/*

���ĺ� �� ���� �Է�: A
 >> ���� OK~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է�: h
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է�: 1
�Է� ����~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/




	
	
	
	
	
	
	
	
	