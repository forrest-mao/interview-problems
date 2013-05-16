/**
 * Author : wangjinlei
 * Email  : sea11107@mail.ustc.edu.cn
 */
 
public class Atoi {
	
	// alpabet to long
	public static int atoi(String s) {
		
		return helper(0, s);
	}
	
	private static int helper(int index, String s) {
		boolean negative = false;
		char firstChar = s.charAt(0);
		if (firstChar == '-') {
			negative = true;
			++index;
		}
		return -1;
	}
	 
	 
	public static long atol(String s) {
		int sign = 1;
		long result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(0) == '-') {
				sign = -1;
			} else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
				result = 10 * result + (s.charAt(i) - '0');
			} else {
				throw new RuntimeException("Invalid input!");
			}
		}
		
		return sign * result;
	} 
	 
	public static void main(String[] args) {
		// to be filled here....		

		System.out.println(atol("-123"));
		System.out.println(atol("321232"));
	}
}
