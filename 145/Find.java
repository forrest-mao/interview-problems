/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */

public class Find {
/*
---------------------------------------------
--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|

*/
	
	// a good one
	public static int search(int[] a, int key) {
		int l = 0, u = a.length - 1; 
		while (l < u - 1) {        // final configuration  lo upper
			int m = (l + u) >>> 1;
			if (a[m] <= key)
				l = m;
			else 
				u = m;            // avoid u = l
		}
		return (a[u] == key) ? (u) : (a[l] == key ? l : -1);
	}

	// still in debug stage
	public static int bsearch(int[] a, int key) {
		int low = 0, hi = a.length - 1;
		while (low <= hi - 1) {
			int mid = (low + hi) >>> 1;
			if (a[mid] >= key) {
				low = mid;
				if (low == hi - 1)
					break;
			} else {
				hi = mid - 1; // hi can be -1, we dont want	
				if (hi < 0)
					return -1;
			}
		}
		return a[hi] == key ? hi : -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2,3,3,3,3,3,3,3,3,3};
		System.out.println(search(a, 3));
		System.out.println(bsearch(a, 3));
		
		int[] b = {1, 2};
		System.out.println(search(b, 3));
		System.out.println(bsearch(b, 3));

		int[] c = {1,2,3,4,5};
		System.out.println(search(c, 12));
		System.out.println(bsearch(c, 12));
	}
}

/*
l = 0, u = 1
while 0 < 0
*/
