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
		// invariant if k is exist must in [l, u]
		while (l < u - 1) {        // final configuration  lo upper
			int m = (l + u) >>> 1;
			if (a[m] <= key)
				l = m;
			else 
				u = m;
		}
		// l = u - 1 u
		return (a[u] == key) ? (u) : (a[l] == key ? l : -1);
	}
/*
func Search(n int, f func(int) bool) int {
    58		// Define f(-1) == false and f(n) == true.
    59		// Invariant: f(i-1) == false, f(j) == true.
    60		i, j := 0, n
    61		for i < j {
    62			h := i + (j-i)/2 // avoid overflow when computing h
    63			// h < j
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
	
	/** try to find a invariant. */
	public static int bbb(int[] a, int value) {
		int lo = 0, hi = a.length - 1;
		// how to find the invariant?
		// if value exists in the array, it must be in [lo, hi]
		// begin : correct
		while (lo < hi) {
			System.out.println("lo : " + lo + ", hi : " + hi);
			int mid = (lo + hi + 1) / 2; // guarantee increments m
			//  m = (l + u) / 2           not end
			//  l = 5  u = 9       m = 7
			//  l = 7
			//  (7 + 9) / 2 = 8
			//  l = 8
			//  (8 + 9) / 2 = 8
	        // 	
			if (a[mid] <= value) {
				lo = mid;
				// a[lo, hi] satifies
			} else {
				hi = mid - 1; 
				// still statifies
			}
			
		}
		// lo == hi
		System.out.println("-- lo : " + lo + ", hi : " + hi);
		return a[hi] == value ? hi : -1;
	}

    // l = 0 , u = 10
	// m = 5
	// a[5] == 3
	// u = 5, l = 0, m = 2;
	// a[2] == 3
	// u = 2, l = 0, m = 1;
	// a[1] = 2 < 3, l = 3
	public static int findMinPos(int a[], int k) {
		int l = 0, u = a.length-1;
		while (l < u) {
			System.out.println("findMinPos : l : " + l + ", u : " + u);
			int m = (l + u) >>> 1;
			if (a[m] >= k) {
				u = m;
			} else {
				l = m + 1;
			}
		}

		System.out.println("findMinPos : l : " + l + ", u : " + u);
		return a[l] == k ? l : -1;
	}

	public static void main(String[] args) {
		
		int[] a = {1, 2,3,3,3,3,3,3,3,3,3};
		//System.out.println(search(a, 3));
		//System.out.println(bsearch(a, 3));
		System.out.println(" bbb--> " + bbb(a, 3));
		int[] b = {1, 2};
		//System.out.println(search(b, 3));
		//System.out.println(bsearch(b, 3));
		System.out.println(" bbb --> " + bbb(b, -3));
		int[] c = {1,2,3,4,5};
		//System.out.println(search(c, 12));
		//System.out.println(bsearch(c, 12));
		System.out.println( " bbb --> " + bbb(c, 11));


		//--------------------------------------------
		System.out.println("findMinPos : " + findMinPos(a, 3));
		
		System.out.println("findMinPos : " + findMinPos(b, 2));
		System.out.println("findMinPos : " + findMinPos(c, 1));
	}
}

/*
l = 0, u = 1
while 0 < 0
*/
