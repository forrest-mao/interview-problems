#include <stdio.h>
#include <malloc.h>

struct Node {
	int v;
	struct Node *next;
};


struct Node* insert(struct Node *head, int v) {
	struct Node *n = (struct Node *)malloc(sizeof(struct Node));
	n->v = v;
	n->next = NULL;
	if (head == NULL) {
		// first node
		return n;
	}
	n->next = head;
	head = n;
	return head;
}

void print(struct Node *head) {
	struct Node *begin;
	for (begin = head; begin != NULL; begin = begin->next) {
		printf("%d, ", begin->v);
	}
	printf("\n");
}

// has no circle
void del(struct Node *head, int k) {
	struct Node **entry = &head;
	struct Node *begin;
	for (begin = head; begin != NULL; begin=begin->next) {
		if (begin->v == k) {
			// delete the node
            *entry = begin->next;
		}
		// Move entry
		entry = &begin->next;
	}
}

int main() {
	struct Node *n = insert(NULL, 1);
	n = insert(n, 2);
	n = insert(n, 3);
	print(n);
}
