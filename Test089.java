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
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
 
  ����Ϸ��� �ƹ�Ű�� ��������...
*/
public class Test089
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][5];

		int a = 65;

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<=i; j++)
			{
			if (i%2==1)
			{
				arr[i][i-j]=a++;
			}
			else
				{
				arr[i][j]=a++;
				}
			}
		}


		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
	}
}

//������
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/