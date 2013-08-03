#include <stdio.h>
#include <stdlib.h>
#include <assert.h>


static int randBetween(int from, int to)
{
		
}

void shuffle(int *a, int n) 
{
	assert(a != NULL);
	int i;
	for (i = 0; i < n; i++) {
		int rndIndex = randBetween(i, n);
		swap(a, i, rndIndex);
	}	
}

static void swap(int *a, int i, int j) 
{	
	assert(a != NULL);
	int t = *(a + i);
	*(a + i) = *(a + j);
	*(a + j) = t;
}

int main() 
{

}