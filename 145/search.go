package main 

import (
	"fmt"
	"sort"
)

func main() {
	a := []int {1,2,3,3,3,4,5,6,7}
	fmt.Println(sort.SearchInts(a, 1))
	fmt.Println(sort.SearchInts(a, -1))
	fmt.Println(sort.SearchInts(a, 9))
}
