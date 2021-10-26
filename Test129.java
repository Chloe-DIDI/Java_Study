/*========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
==========================================*/
import java.math.BigDecimal;

public class Test129
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.1234567489");

		// movePointLeft() : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.7891234567489

		// ������ : divide() �� ��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. �� ����
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);	// static final
		System.out.println(c);
		//--==>> 1000.0000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1

		// toBigInteger() �� BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		//--==>> 123456789

	}
}