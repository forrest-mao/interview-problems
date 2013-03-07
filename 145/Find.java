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
/*
func Search(n int, f func(int) bool) int {
    58		// Define f(-1) == false and f(n) == true.
    59		// Invariant: f(i-1) == false, f(j) == true.
    60		i, j := 0, n
    61		for i < j {
    62			h := i + (j-i)/2 // avoid overflow when computing h
    63			// i ≤ h < j
    64			if !f(h) {
    65				i = h + 1 // preserves f(i-1) == false
    66			} else {
    67				j = h // preserves f(j) == true
    68			}
    69		}
    70		// i == j, f(i-1) == false, and f(j) (= f(i)) == true  =>  answer is i.
    71		return i
    72	}
    73	
*/
// Define f(-1) == false and f(n) == true.
// Invariant: f(i-1) == false, f(j) == true.
	public static int bb(int[] a, int key) {
		int i = -1, j = a.length;
		while (i < j) {
		System.out.println("i : " + i + ", j : " + j);
			int h = i + 1 + (j - i) / 2 ;
			if (a[h] < key) 
				i = h + 1;  // preserves a[i-1] < x
			else 
				j = h;      // preserves a[j] >= x
		}
// i == j, f(i-1) == false, and f(j) (= f(i)) == true  =>  answer is i.
// 
		System.out.println("i : " + i + ", j : " + j);
		//return (i < a.length)?(a[i] == key? i : -1): -1;
		return i;
	}

	public static int bb2(int[] a, int key) {
		int i = 0, j = a.length;
		while (i < j) {
			int h = i + (j - i) / 2 ;
			if (a[h] < key) 
				i = h + 1;
			else 
				j = h;
		}
		return (i < a.length) ? (a[i] == key? i : -1) : (-1);
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
	
	public static int bbb(int[] a, int value) {
		int lo = 0, hi = a.length - 1;

		while (lo < hi) {
			System.out.println("lo : " + lo + ", hi : " + hi);
			int mid = (lo + hi + 1) / 2;
			if (a[mid] <= value) {
				lo = mid;
			} else {
				hi = mid - 1; //avoid IndexOutOfBoundsException
			}
		}
		System.out.println("-- lo : " + lo + ", hi : " + hi);
		return a[hi] == value ? hi : -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2,3,3,3,3,3,3,3,3,3};
		//System.out.println(search(a, 3));
		//System.out.println(bsearch(a, 3));
		System.out.println(" bb--> " + bb(a, 3));
		int[] b = {1, 2};
		//System.out.println(search(b, 3));
		//System.out.println(bsearch(b, 3));
		System.out.println("bb --> " + bb(b, -3));
		int[] c = {1,2,3,4,5};
		//System.out.println(search(c, 12));
		//System.out.println(bsearch(c, 12));
		System.out.println( "bb --> " + bb(c, 11));
	}
}

/*
l = 0, u = 1
while 0 < 0
*/
