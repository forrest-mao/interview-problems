/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */
 
public class Find {
	
	// return the min element value
	public static int search(int[] data) {
		int fromIndex = 0;
		int toIndex = data.length - 1;
		// assending order
		if (data[fromIndex] < data[toIndex]) {
			return data[fromIndex];
		}

		int min = 0;
		while (true) {
			if (fromIndex + 1 == toIndex) {
				// only two elements left
				min =  min(data[fromIndex], data[toIndex]);
			}
			
			int midIndex = (fromIndex + toIndex) >>> 1;
			int midVal = data[midIndex];
			
			if (midVal > data[fromIndex]) {
				fromIndex = midIndex + 1; // goes right 
			} else {
				toIndex = midIndex - 1; // goes right
			}
		}

		return min;
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}

	
	// to be continued.
	public static void main(String[] args) {
		int[] d = {1,2,3,4,5,6,7};
		System.out.println(search(d));
		int[] d1 = {2,3,4,5,6,7,1};
		System.out.println(search(d1));
		int[] d2 = {1};
		System.out.println(search(d2));
		int[] d3 = {2, 1};
		System.out.println(search(d3));
		int[] d4 = {4, 1, 2, 3};
		System.out.println(search(d4));
	}
}
