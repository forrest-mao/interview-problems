
class Position {
	int row;
	int col;

	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}
}


class Matrix {
	
	public int[][] data;
	public int m;
	public int n;

	public Matrix(int m, int n) {
		data = new int[m][n];
		this.m = m;
		this.n = n;
	}

	public Position lookup(int value) {
		int r = n - 1;
		int c = 0;
		while (r >=0 && c < m) {
			if (data[r][c] == value) { // found
				return new Position(r, c);
			} else if (data[r][c] > value) { // row search

			} else { // col search
			}
		}
		
		return null;
	}

	// binarysearch
	public Position rowSearch(int row, int value) {
		int low = 0; hi = n - 1;
		while (low <= hi) {
			int mid = (low + hi) >>> 1;
			int midVal = data[row][mid];

			if (midVal == value) {
				return new Position(row, mid);
			} else if (midVal > value) {

			} else {

			}
		}

		return null;
	}

	// binarysearch
	public Position colSearch(int col, int value) {


		return null;
	}
	
}


public class Lookup {

	public static void main(String[] args) {

	}

}
