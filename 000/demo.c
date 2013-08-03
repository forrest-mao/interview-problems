#include <stdio.h>

long add(int i, int j) {
	return i + j;
}

void cunit(int result, long expect) {
	if (result == expect) {
		printf("ok\n");
	} else {
		printf("fail, expect %l but get %d\n", expect, result);
	}

}

int main() 
{
	// case 1
	cunit(add(0, 0), 0);
	
	// case 2
	cunit(add(1, 2), 3);

	// case 3
	cunit(add(-1, 0), -1);
	
	// case 4
	cunit(add(20, 20), 40);
	// ...
}
