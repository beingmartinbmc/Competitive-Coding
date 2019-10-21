#include <stdio.h>
typedef long long int lli;

void rearrange(lli *a, lli n){
    for(int i=0; i<n; i++){
        a[i] += (a[a[i]] % n) * n;
    }
    for(int i=0; i<n; i++)
        a[i] /= n;
    for(int i=0; i<n; i++) printf("%lli ", a[i]);
    printf("\n");
}

int main() {
	int t;
	lli n;
	scanf("%d", &t);
	while(t--){
	    scanf("%lld", &n);
	    lli a[n];
	    for(int i=0; i<n; i++) scanf("%lli", &a[i]);
	    rearrange(a, n);
	}
	return 0;
}
