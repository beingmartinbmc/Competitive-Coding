#include <stdio.h>

int f(const void *a, const void *b){
    return (*(int *)a - *(int *) b);
}

int getSum(int *a, int n){
    int x = 0, b = 0;
    for(int i=0; i<n; i++){
        if((i & 1) == 1)
            x = x * 10 + a[i];
        else
            b = b * 10 + a[i];
    }
    return x + b;
}

int main() {
	int t;
	scanf("%d", &t);
	while(t -- ){
	    int n;
	    scanf("%d", &n);
	    int a[n];
	    for(int i=0;i <n; i++)
	        scanf("%d", &a[i]);
	    qsort(a, n, sizeof(int), f);
	    printf("%d\n", getSum(a, n));
	}
}