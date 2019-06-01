#include <stdio.h>

void prime(int n)
{
    int i;
    int c=0;
    for(i=2;i<n;i++)
        if(n%i==0)
            c++;
    if(c==0)
    printf("%d ",n);
}
void main()
{
    int n;
    int i;
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    prime(i);
}