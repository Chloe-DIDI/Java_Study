/*========================================
  ■■■ 예외(Exception) 처리 ■■■
==========================================*/

//Test147.java 파일과 비교~!!!
//오류나는거 맞음 예외처리 예시니까~!


class Demo
{
	private int value;

	public void setValue(int value)
	{
		if (value<=0)
			return;

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test146
{	
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}
