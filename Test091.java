/*=========================
  ���� �迭 ����
  - �迭�� ����
===========================*/

// �� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
//	  �ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���.
//							      (�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)
//    ������ ���� �� ���� ���� �� ���� ��ҷ� ����ִ� ������ ���� �����
//							      ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���.

// Test092.java ���ϰ� ��~!!! �� ������ ���縦 �ٷ��

// �ּҰ� ����
public class Test091
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};	//--�迭 ����
		int[] copys;						//--���纻���� ���� �迭

		int temp;							//--�׽�Ʈ(�ǽ� ����)�� ���� �ӽ� ����
		

		//check~!!!
		copys = nums;		// nums�� copys�� �Ű� ���, ��, ���縦 ����~!

		temp = nums[0];		// temp �� 10 ��ٴ�

		nums[0] = 1000;		// nums ��������10 20 30 40 50�̿��µ�
							// nums[0]�� 1000�̶���ϴϱ� 1000 20 30 40 50���� �ٲٰٴܸ�
		for (int i=0; i<copys.length; i++)
			System.out.print(copys[i] + " ");
		System.out.println();

		System.out.println("temp : " + temp);
	}
}