#include <stdio.h>
int func(int l,int r,int k)
{
    int i,d=0;
    for(i=l;i<=r;i++)
        if(i%k==0)
            d++;
    return d;
}
int main()
{
    int l,r,k;
    scanf("%d %d %d",&l,&r,&k);
    int result=func(l,r,k);
    printf("%d",result);
    return 0;
}
