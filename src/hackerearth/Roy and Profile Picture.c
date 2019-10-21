#include "stdio.h"
#include "string.h"
void profilepicture(int W,int H,int L)
{
    if(W<L||H<L)puts("UPLOAD ANOTHER");
    else
        if(W>=L&&H>=L)
    {
        if(W==H)
            puts("ACCEPTED");
        else puts("CROP IT");
    }
}
void main()
{
    int L,N,W,H;
    int i;
    scanf("%d",&L);
    scanf("%d",&N);
    for(i=1;i<=N;i++)
    {
        scanf("%d",&W);
        scanf("%d",&H);
        profilepicture(W,H,L);
    }
}
