#include "stdio.h"
#include "string.h"
#include <ctype.h>
int main()
{
    char A[101];
    fgets(A,101,stdin);
    int i;
    for(i=0;i<strlen(A);i++)
    {
        if(isalpha(A[i]))
        {
        if(islower(A[i]))
            A[i]=toupper(A[i]);
        else if(isupper(A[i]))
            A[i]=tolower(A[i]);
        }   
    }   
    puts(A);
    return 0;
}
