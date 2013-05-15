/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */
 
public class Symmetric {
	
	// ------------------------------------------------------------------
	public static boolean commonWay(String str) {
		int low = 0; 
		int high = str.length() - 1;
		while(low < high && str.charAt(low) == str.charAt(high)) {
			low++;
			high--;
		}
		return low >= high;
	}
	
	
	// -------------------------------------------------------------------
	public static boolean even(int i) {
		return (i & 1) == 0;
	}
	
	public static int right(int len) {
		if (even(len)) {
			return len >> 1;
		}
		return len >> 1 + 1;
	}
	
	public static int left(int len) {
		if (even(len)) {
			return len >> 1 - 1;
		}
		return len >> 1;
	}
	
	// another way to check a string is symmetric or not
	public static boolean isSymmetric(String s) {
		int len = s.length();
		int right = right(len);
		int left = left(len);
		
		while (right <= len - 1 && left >= 0 && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right == len;
	}

	// ------------------------------------------------------------------
	
	
	
	
	// ------------------------------------------------------------------
	public static void main(String[] args) {
		
		// test case for another to check whether a string is symmetric or not.
		{
			System.out.println(isSymmetric(""));	
			System.out.println(isSymmetric("a"));	
			System.out.println(isSymmetric("abc"));	
			System.out.println(isSymmetric("abccba"));	
			System.out.println(isSymmetric("abcddc"));	
		}
		
		System.out.println("\n");
		
		// test case for the classical way to test a string symmetric or not.
		{
			System.out.println(commonWay(""));	
			System.out.println(commonWay("a"));	
			System.out.println(commonWay("abc"));	
			System.out.println(commonWay("abccba"));	
			System.out.println(commonWay("abcddc"));	
		}
	}
}
