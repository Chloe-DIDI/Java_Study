/*======================================
  ���� ����(Sort) �˰��� ����
  - ���� ����(Selection Sort)
========================================*/

/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
		�� ���� ����... �˻��ϱ� ����

�� ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ���� ...
*/

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test103
{
	public static void main(String[] args) 
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		52 42 12 62 60				0  1
		== -- 52�� 42 �ڸ� ��		
		��
		42 52 12 62 60				0  2
		==    -- 42�� 12�� ��
		��
		12 52 42 62 60				0  3
		==       -- 12�� 62 ��
		��
		12 52 42 62 60				0  4
		==			--  12�� 60 ��
		-----------------------------------1ȸ��
		12 42 52 62 60				1  2
		   == -- 42�� 52 ��
		   ��
		12 42 52 62 60				1  3
		   ==    --  42�� 62 ��
		��
		12 52 42 62 60				1  4
		     ==       --   ��
		��

		*/

		int i, j;

		
		System.out.print("Source Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		//--==>>Source Data : 52 42 12 62 60
		*/
		
		// ���� for �� (forEach ����)
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>>Source Data : 52 42 12 62 60

		//Selection Sort
		for (i=0; i<a.length-1; i++)	// ��~ (�񱳱��ص�����) �� 0     1    2   3
		{
			for (j=i+1; j<a.length; j++)				// ��~ (�񱳴������) �� 1234  234  34  4
			{
				if (a[i] > a[j])	//-- ��������
				//if (a[i] < a[j])	//-- ��������
				{
					//�ڸ� �ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		//--==>>Sorted Data : 52 42 12 62 60
		*/

		// ���� for �� (forEach ����)
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>>Sorted Data : 52 42 12 62 60
		
	}
}

// ���� ���
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/