/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */
 
public class Search {
	
	public static final int BIT_PER_WORD = 32;
	
	// in the data array, except one element appears once, others twice.
	public static int xorArray(int[] data) {
		if (data.length == 0) {
			throw new RuntimeException("Empty array!");
		}
		int r = data[0];
		for (int i = 1; i < data.length(); i++) {
			r ^= data[i];
		}
		return r;
	}
	
	// two elements appear once, others twice.
	// return left.length(). with this, we can get right = data.length()-right.length();
	public static int split(int[] data, int[] left, int[] right) {
		if (data.length == 0) {
			throw new RuntimeException("Empty array!");
		}
		int r = xorArray(data);
		int leftIndex = 0;
		int rightIndex = 0;
		
		for (int i = 0; i < data.length(); i++) {
			for (int j = 0; j < BIT_PER_WORD; j++) {
				
			}
		} 
		
		return leftIndex;
	}

	public static void main(String[] args) {
	
	
	}
}
