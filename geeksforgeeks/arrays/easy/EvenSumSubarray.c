#include <stdio.h>

int getCount(int *a, int n){
    int even = 1, odd = 0, sum = 0;
    for(int i=0; i<n; i++){
        sum = ((sum + a[i]) % 2 + 2) % 2;
        if(sum == 0)
            even += 1;
        else
            odd += 1;
    }
    return even * (even - 1)/ 2 + odd * (odd - 1) / 2;
}
int main() {
	int t, n;
	scanf("%d", &t);
	while(t > 0){
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0; i<n; i++)
	        scanf("%d", &a[i]);
	    printf("%d\n", getCount(a, n));
	    t -= 1;
	}
	return 0;
}