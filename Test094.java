
class Rect
{
	private int w,h;

	//getter   ���� �������� �ְԸ�����ִ°�
	public int getW()
	{
		return w;
	}

	public void setW(int w)
	{
		this.w =w;
	}
}




//�ܺ��� �ٸ� Ŭ����
public class Test094
{
	// �� �ܺ��� �ٸ� Ŭ������ �޼ҵ�
	public static void main(String[] args)
	{
		Rect ob = new Rect();
		
		/*
		ob.w = 1000;
		ob.w -= 20000;
		System.out.println("������ �� Ȯ�� " + ob.w);
		*/

		ob.setW(200);

		System.out.println("������ �� Ȯ�� : " + ob.getW());
	}
}