/*=====================
  ■■■ 배열 ■■■
  - 배열 선언과 초기화
=======================*/
/*
○ 배열의 개요
	
	1. 배열이란 크기와 성격이 같은 일련의 원소들이 모여
	   공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로
	   『동질적인 성격을 가진 자료들(데이터)』에 대해
	   개벽적으로 자료형(Data Type)을 부여하지 않고
	   하나의 이름을 가지고 일괄적으로 처리할 목적으로 사용된다.

	2. 자바에서 배열은 다음과 같은순서에 의행 사용된다.
	   배열 선언→  배열에 메모리 할당 → 배열 요소의 사용
	   ---------
		→ 이름 선점 하는 과정이라 봐도 무방


○ 형식 및 구조

	자료형[] 변수명;
	변수명 = new 자료형[요소크기];	
	변수명[인덱스] = 값;

	int[] arr;			==>> int[] arr = new int[3];26,27줄 합펴서 작성가능!
	arr = new int[3];		-->> 방을 3개 만들어라
	arr[0] = 10;			-->> arr 0번방에 10 담아라
	arr[1] = 20;			-->> arr 1번방에 20 담아라
	arr[2] = 30;			-->> arr 2번방에 30 담아라

*/
public class Test074
{
	public static void main(String[] args)
	{
		//배열 선언
		int[] arr;		// int arr[];	둘다 사용가능
						//int 배열 타입의 arr

		//int arr			//인트 타입의 arr
		
		//메모리 할당
		arr = new int[10];

		//배열은 다음과 같이 선언과 동시에
		//메모리 할당 및 초기화가 가능하다.
		int[] arr2 = new int[10];	//아직 무슨값이 들어갈진모르겟지만 10개정도방달라
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};	//얘들아 맘에드는방 들어가렴~! 
		int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

		// 배열 요소 사용(접근)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// ※ 값을 할당하지 않은 나머지 배열 공간은
		//	  자동으로 초기화 된다. → 0 (int형 배열)
		
		int num = 10;
		System.out.println("num : " + num);
		//--==>> num : 10

		System.out.println("arr : " + arr);
		//--==>> arr : [I@15db9742
		//-- 배열을 출력하기 위해 배열변수를 일반 변수처럼 사용하여
		//	 출력하는 구문으로 작성하게 되면
		//	 배열의 각 방에 들어있는 데이터가 출력되는 것이 아니라
		//   우리가 알아볼 수 없는 코드가 출력된다.
		//   그리고, 이 코드는 메모리의 주소값이 아니다.
		//   (자바는 메모리 주소값에 사용자가 직접 접근하는 것을 허용하지 않기 때문에...)

		System.out.println("arr[0] : " + arr[0]);
		//--==> arr[0] : 1
		System.out.println("arr[1] : " + arr[1]);
		//--==> arr[1] : 2
		System.out.println("arr[2] : " + arr[2]);
		//--==> arr[2] : 3
		
						// 맨앞에 "" 이거 ②결과나올때 앞에 한칸띄울려고
		System.out.println(" "+arr[0] + " "  + arr[1] + " "  + arr[2] + " " 
							+ arr[3] + " " + arr[4] + " " + arr[5] + " "
							+ arr[6] + " " + arr[7] + " " + arr[8] + " "
							+ arr[9]);
		//--==>> 1 2 3 0 0 0 0 0 0 0

		//반복문을 활용하여 배열에 담긴 데이터 전체 출력
		for (int i=0; i<10; i++)		// i → 0 1 2 3 4 5 6 7 8 9
		{
			//테스트 ①
			//System.out.println("i : " + i);					
			

			//테스트 ②
			//System.out.printf("%2d", arr[i]);

			//테스트 ③
			System.out.printf("arr 배열의 %d번째 방 : %2d\n",i,arr[i]);
		}
		
			System.out.println();   //②, ③ 일때 필요 ①은 이거 없어도 결과 나옴

	}
}
		

/*
①
i : 0
i : 1
i : 2
i : 3
i : 4
i : 5
i : 6
i : 7
i : 8
i : 9

②
 1 2 3 0 0 0 0 0 0 0

③
arr 배열의 0번째 방 :  1
arr 배열의 1번째 방 :  2
arr 배열의 2번째 방 :  3
arr 배열의 3번째 방 :  0
arr 배열의 4번째 방 :  0
arr 배열의 5번째 방 :  0
arr 배열의 6번째 방 :  0
arr 배열의 7번째 방 :  0
arr 배열의 8번째 방 :  0
arr 배열의 9번째 방 :  0
*/