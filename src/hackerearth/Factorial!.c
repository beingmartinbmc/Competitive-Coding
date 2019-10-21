#include <stdio.h>
int fact(int n)
{
    int i;
    int f=1;
    for(i=1;i<=n;i++)
    f=f*i;
    return f;
}
int main()
{
    int N;
    scanf("%d",&N);
    int result=fact(N);
    printf("%d",result);
    return 0;
}
