#include <stdio.h>
#include <stdbool.h>

int f(const void *a, const void *b){
    return (*(int *)b - *(int *)a);
}

void display(int *a, int n){
    for(int i=0; i<n; i++)
        printf("%d ", a[i]);
    printf("\n");
}

void arrangeAlternative(int *a, int n){
    bool max = true;
    int b[n];
    int p = 0, q = n - 1, index = 0;
    for(int i=0; i<n; i++){
        if(max){
            b[index] = a[p];
            p += 1;
            index += 1;
        }
        if(!max){
            b[index] = a[q];
            q -= 1;
            index += 1;
        }
        max = !max;
    }
    display(b, n);
}

int main() {
	int t;
	scanf("%d", &t);
	while(t--){
	    int n;
	    scanf("%d", &n);
	    int a[n];
	    for(int i=0; i<n; i++)
	        scanf("%d", &a[i]);
	    qsort(a, n, sizeof(int), f);
	    arrangeAlternative(a, n);
	}
	return 0;
}
