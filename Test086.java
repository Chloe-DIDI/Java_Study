/*=========================
  ���� �迭 ����
  - �迭�� �迭(2���� �迭)
===========================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136

*/

/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136


*/

public class Test086
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];


		// �迭�� �迭 �� �濡 ��� ä���ֱ�
		int n=0;
		for (int i=0; i<4; i++)				    // ��~  i �� 0 1 2 3
		{
			for (int j=0; j<4; j++)				// ��~  j �� 0 1 2 3
			{
				 n++;							// n �� 1 2 3 4 5 ... 16
				 arr[i][j] = n;

				 arr[i][4] += arr[i][j];
				 arr[4][j] += arr[i][j];
				 arr[4][4] += arr[i][j];

			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%4d", arr[i][j]);
				System.out.println();
			
		}
	}
}

//������
/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42
  13  14  15  16   58
  28  32  36  40  136
*/

/*

		int a[][] = new int[5][5];

		int n=1;

		for (int i=0; i<5; i++)			  
		{
			for (int j=0; j<5; j++)	
				
				arr[i][j] = n;
				n++;
			
				a[i][4] = a[i][4] + a[i][j];
				a[4][j] = a[4][j] + a[i][j];
				a[4][4] = a[4][4] + a[i][j];
			}


		}
		//��ü ��� ���
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
		
	}
*/