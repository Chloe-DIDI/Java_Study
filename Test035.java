/*===========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
=============================================================*/

// �� ����
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾� �̸� �Ǻ��Ͽ�
// �ҹ��ڸ� �Է¹޾��� ���... �빮�ڷ� ��ȯ�ϰ�,
// �빮�ڸ� �Է¹޾��� ���... �ҹ��ڷ� ��ȯ�ϴ�
// ���α׷��� �ۼ��Ѵ�.
// ��, �Է��� ��System.in.read()�� �޼ҵ带 Ȱ���Ͽ� �����Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> a
// ����Ϸ��� �ƹ� Ű�� ��������....

// ���� ��)
// ���ĺ� �� ���� �Է� : C
// >> c
// ����Ϸ��� �ƹ� Ű�� ��������....

// ���� ��)
// ���ĺ� �� ���� �Է� : 7
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������....



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test035
{
	public static void main(String[] args) throws IOException
	{
		
		//�� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;		


		// �� ���� �� ó��
		System.out.print("���ĺ� �� ���� �Է�: ");
		a = System.in.read();


		// �� ��� ���
			
		if (a>=65&&a<=90)					//�빮��
		{
			a +=32;							// �빮�� �� �ҹ��ڷ�

			System.out.printf(">> %c\n",a);
		}
			else if(a>=97 && a<=122)		//�ҹ���
			{		
	
			a -= 32;						//�ҹ��� �� �빮�ڷ�					
			
			System.out.printf(">> %c\n",a);

			}else							// �� ��

			System.out.println(">> �Է� ����~!!!!");	
	
	
	
	
	}
}

//���� ���
/*

���ĺ� �� ���� �Է�: a
>> A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է�: G
>> g
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է�: 1
>> �Է� ����~!!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/