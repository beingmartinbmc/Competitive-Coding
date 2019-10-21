#include <stdio.h>

int main()
{
int i,n,a;
long long int m=1;
scanf("%d",&n);
for(i=0;i<n;i++){
scanf("%d",&a);
m=(m*a)%1000000007;
}
printf("%lli",m);
return 0;
}