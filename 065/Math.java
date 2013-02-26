/**
 *	author : wangjinlei
 *  email  : sea11107@mail.ustc.edn.cn
 */

public class Math {

	// exponent negtive ? 
	public static double poorPower(double base, int exponent) {
		
		double result = 1.0d;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	
	public static double power(double base, int exponent) {

		return 0.0d;
	}
	
	public static void main(String[] args) {
		System.out.println(1.21 * 1.21);
	}
}
