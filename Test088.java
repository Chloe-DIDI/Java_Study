/*=========================
  ���� �迭 ����
  - �迭�� �迭(2���� �迭)
===========================*/

// �� ���� 
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
 
 ����Ϸ��� �ƹ� Ű�� ��������...

*/
public class Test088
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][5];

		int a = 65;

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<=i; j++)
			{			//-----
			arr[i][j]= a++;
			}
		}


		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%3c", arr[i][j]);
			
			System.out.println();
		}
	}
}

//������
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/