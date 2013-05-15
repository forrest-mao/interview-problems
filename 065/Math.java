/**
 *  author : wangjinlei
 *  email  : sea11107@mail.ustc.edn.cn
 */

public class Math {
	
	public static final int BIT_PER_WORD = 32;
	

	private static int abs(int d) {
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
	
	// -------------------------------------------------------------------------------------------
	
	// We will provide an elegant implementation for you.
	// b^8 = ((b^2)^2)^2  b^20 = b^16 * b^4 = ...
	private static double elegantHelper(double base, int exponent) {
		double result = 1.0d;
		for (int i = 0; i < BIT_PER_WORD; i++) {
			int mask = (i == 0) ? (1) : (2 << i - 1);
			if ((exponent & mask) != 0) { 
				result *= power2E(base, i);
			}
		}
		return result;
	}
	
	// exponent是2的幂
	private static double power2E(double b, int e) {
		double p = b;
		for (int i = 0; i < e; i++) {
			p *= p;
		}
		return p;
	}
	
	public static double power(double base, int exponent) {
		boolean negative = (exponent < 0);
		return negative ? (1 / elegantHelper(base, abs(exponent))) : elegantHelper(base, abs(exponent));
	}
	
	public static void main(String[] args) {
		
		System.out.println(poorPower(2.0, -3));
		System.out.println(power(2.0, 3));
		System.out.println(power(2.0, -3));
		System.out.println(power(2.0, 0));
		
	}
}
