/**
 *	author : wangjinlei
 *  email  : sea11107@mail.ustc.edn.cn
 */

public class Math {

	public static int abs(int d) {
		if (d < 0) {
			return 0 - d;
		}
		return d;
	}

	// poor implementation
	public static double poorPower(double base, int exponent) {
		boolean negative = (exponent < 0);
		return negative ? (1 / poorHelper(base, abs(exponent))) : poorHelper(base, abs(exponent));
	}
	
	private static double poorHelper(double base, int exponent) {
		double result = 1.0d;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	
	// We will provide an elegant implementation for you.
	// b^8 = ((b^2)^2)^2  b^20 = b^16 * b^4 = ...
	private static double elegantHelper(double base, int exponent) {
		double result = 1.0d;
		
		
		return result;
	}
	
	public static double power(double base, int exponent) {

		return 0.0d;
	}
	
	public static void main(String[] args) {
		System.out.println(poorPower(2.0, -3));
	}
}
