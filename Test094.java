
class Rect
{
	private int w,h;

	//getter   값을 꺼내갈수 있게만들어주는것
	public int getW()
	{
		return w;
	}

	public void setW(int w)
	{
		this.w =w;
	}
}




//외부의 다른 클래스
public class Test094
{
	// 그 외부의 다른 클래스의 메소드
	public static void main(String[] args)
	{
		Rect ob = new Rect();
		
		/*
		ob.w = 1000;
		ob.w -= 20000;
		System.out.println("설탕의 양 확인 " + ob.w);
		*/

		ob.setW(200);

		System.out.println("설탕의 양 확인 : " + ob.getW());
	}
}