/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */
 
public class Find {
	
	// return the min element value
	public static int search(int[] data) {
		int fromIndex = 0;
		int toIndex = data.length - 1;
		if (data[fromIndex] < data[toIndex]) {
			// Assending array
			return data[fromIndex];
		}
		while (fromIndex <= toIndex) {
			int mid = (fromIndex + toIndex) >>> 1;
			int midVal = data[mid];
			if (data[fromIndex] < midVal) {
				fromIndex = mid + 1; // goes right
			}
		}
	}

	public static void main(String[] args) {
		int[] d = {1,2,3,4,5,6,7};
		int[] d1 = {2,3,4,5,6,7,1};
		int[] d2 = {1};
		int[] d3 = {2, 1};
		int[] d4 = {4, 1, 2, 3};
	}
}
