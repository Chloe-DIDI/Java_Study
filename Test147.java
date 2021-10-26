/*========================================
  ■■■ 예외(Exception) 처리 ■■■
==========================================*/

//Test146.java 파일과 비교~!!!
//오류나는거 맞음 예외처리 예시니까~!

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value<=0)
		{
			// 예외 생성(발생)
			throw new Exception("value 는 0 보다 작거나 같을 수 없습니다.");
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test147
{	
	public static void main(String[] args)
	{
		Demo2 ob = new Demo2();
	
		try
		{
			
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
