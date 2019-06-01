#include <stdio.h>
#include <stdlib.h>
#define max(a, b) (a>b)?a:b

int f(const void *a, const void *b){
    return *(int *)b - *(int *)a;
}

int getNegativeCount(int *a, int n){
    int c = 0;
    for(int i=0; i<n; i++)
        if(a[i] < 0)
            c += 1;
    return c;
}

int getMaxSum(int *a, int n){
    int s = 0, answer = 0;
    int count = getNegativeCount(a, n);
    if(count == n){
        qsort(a, n, sizeof(int), f);
        return a[0];
    }
    for(int i=0; i<n; i++){
        s += a[i];
        if(s < 0)
            s = 0;
        answer = max(answer, s);
    }
    return answer;
}

int main() {
	int t, n;
	scanf("%d", &t);
	while(t --){
	    scanf("%d", &n);
	    int a[n];
	    for(int i=0; i<n; i++)
	        scanf("%d", &a[i]);
	    printf("%d\n", getMaxSum(a, n));
	}
	return 0;
}
