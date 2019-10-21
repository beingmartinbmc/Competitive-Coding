#include <stdio.h>

typedef long long int lli;

int isPalindrome(lli a){
    lli rev = 0;
    int r = 0;
    lli k = a;
    while(a > 0){
        r = a % 10;
        rev = rev * 10 + r;
        a /= 10;
    }
    return rev == k;
}

int main(){
    int t;
    lli n;
    scanf("%d", &t);
    while(t--){
        scanf("%lld", &n);
        if(isPalindrome(n)) printf("YES\n");
        else printf("NO\n");
    }
}
