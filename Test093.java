/*=============================
  ���� Ŭ���� �ν��Ͻ� ����
===============================*/

import java.util.Scanner;

class CircleTest2
{
	//���� ����(Information Hiding)
	//��� ����, �ν��Ͻ� ����, ���� ����
	//��pricvate�� �̶�� ���������������� ������
	//Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰٴٴ� �ǹ�
	//int�� ���� 0���� �ʱ�ȭ ����
	private int r;
	
	//int r;

	// getter / setter ����
	int getR()
	{
		return r;
	}
	void setR(int r)
	{
		this.r = r;
	}

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}
	void write(double a)
	{
		System.out.println("������ : " + r);
		System.out.println("��  �� : " + a);
	}

}
public class Test093
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.r = 10;
		//System.out.println("���� ������ : " + ob1.r);

		ob1.setR(10);
		System.out.println("���� ������ : " + ob1.getR());


	}
}