#include "stdio.h"
#include "ctype.h"
void decode(char A[],int k,int n)
{
    int i;char y;
    for(i=0;i<n;i++)
    {
        if(isalnum(A[i]))
        {
            if(isalpha(A[i]))
            {
            if(isupper(A[i]))
                y='A';
            else
                y='a';
            int x=A[i];
            x=y+((x+k-y)%26);
            char c=x;
            A[i]=c;
            }
            if(isdigit(A[i]))
            {
            y='0';
            int x=A[i];
            x=y+((x+k-y)%10);
            char c=x;
            A[i]=x;
            }
        }
    }
    printf("%s",A);
}
int main()
{
    char A[1000];
    gets(A);
    int k;
    scanf("%d",&k);
    decode(A,k,strlen(A));
}
