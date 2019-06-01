#include <stdio.h>

int isSorted(int *a, int n){
    for(int i=0; i<n-1; i++){
        if(a[i] >= a[i+1])
            return 0;
    }
    return 1;
}
int main() {
	int t, n;
	scanf("%d", &t);
	while(t--){
	    scanf("%d", &n);
	    int a[n];
	    for(int i=0; i<n; i++)
	        scanf("%d", &a[i]);
	    printf("%d\n", isSorted(a, n));
	}
	return 0;
}
