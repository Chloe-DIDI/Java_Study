
public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"); → 에러발생 (컴파일 에러)
		System.out.print("CCC\n");
		//--==>>AAABBBCCC

		System.out.println();			//--개행
		//System.out.print();			//--==>> 에러 발생(컴파일 에러)

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n"); // --『\n』 개행
		System.out.printf("12345678901234567890%n"); // --『%n』 개행

		//System.out.printf();	//--==>> 매개변수 없이 쓰면 에러난다(컴파일에러)
								//괄호 안이 매개변수

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%d10\n", 123);
		System.out.printf("%d8\n", 1234);
		System.out.printf("%d010\n", 123);
		//--==>>10앞에 0넣으면 빈자리0으로 참

		//실행 결과
		/*
		
		123
		12310
		12348
		123010

		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);	//-> 이 방식으로 사용하기 
		//--==>>							//음수랑 양수랑 둘다 사용가는 한 방법
		/*
		+365
		+365
		*/

		System.out.printf("%d\n", +365);
		//-->> 365

		//System.out.printf("%-d\n", +365);
		//--==>> 에러발생(런타임 에러)

		
		System.out.printf("-%d\n", 365);
		//--==>> -365

		
		System.out.printf("%d\n", -365);
		//--==>> -365
	
		System.out.printf("%(d\n", -365);		//→음수일땐 ()
		//--==>>(365)
		System.out.printf("%(d\n", 365);		//→양수일땐 그냥
		//--==>> 365
		
		//System.out.printf("%d\n", 'A');
		//--==>> 에러 발생 ( 런타임 에러)
		System.out.printf("%s\n", 'A');		//문자열s 문자는c
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365);		//h는 16진수로 표현하는 것
		//--==> 16d
		System.out.printf("%o\n", 24);		//o은 8진수로 표현하는 것
		//--==>> 30

		System.out.printf("%b\n", true);	// true (참 거짓 논리형)   
		//--==>> true						//"ture" (t r u e문자열)  두개 다름

		System.out.printf("%f\n", 123.23);
		//--==>> 123.230000
		System.out.printf("%.2f\n", 123.23);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.236);
		//--==>> 123.24

		
		// System.out.printf("%10d\n", 123);
		System.out.printf("%8.2f\n", 123.236);
		//8.2에서 8은 ________ 8칸 먼저 확보
		//.2f 실행됨
		//--==>>__123.24
		System.out.printf("%2.2f\n", 123.236);
		// 1123.24 표현해야되는 데이터는있는데 2는 너무작으면 그냥 그대로나옴
		//--==>> 123.24
	}
}
//실행결과
/*

AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
12310
12348
123010
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .

*/