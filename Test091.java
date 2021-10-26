/*=========================
  ■■■ 배열 ■■■
  - 배열의 복사
===========================*/

// ※ 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
//	  주소값 복수 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//							      (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
//    데이터 복사 → 깊은 복사 → 실제 요소로 들어있느 ㄴ값에 대한 복사로
//							      원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법.

// Test092.java 파일과 비교~!!! ← 데이터 복사를 다룬다

// 주소값 복사
public class Test091
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};	//--배열 원본
		int[] copys;						//--복사본으로 만들 배열

		int temp;							//--테스트(실습 진행)를 위한 임시 변수
		

		//check~!!!
		copys = nums;		// nums를 copys에 옮겨 닮기, 즉, 복사를 수행~!

		temp = nums[0];		// temp ← 10 담겟다

		nums[0] = 1000;		// nums 위에보면10 20 30 40 50이였는데
							// nums[0]을 1000이라고하니까 1000 20 30 40 50으로 바꾸겟단말
		for (int i=0; i<copys.length; i++)
			System.out.print(copys[i] + " ");
		System.out.println();

		System.out.println("temp : " + temp);
	}
}