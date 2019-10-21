#include "stdio.h"
#include "string.h"
void main()
{
    char A[100];
    int i,d=0;
    scanf("%[^\n]",A);
    int n=strlen(A);
    for(i=0;i<n/2;i++)
        if(A[i]==A[n-i-1])
            d++;
    if(d==n/2)
        printf("YES\n");
    else
        printf("NO\n");
}
