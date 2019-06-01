#include <stdio.h>
#include <string.h>

int main(){
    char str[2000];
    while(gets(str) != NULL){
        int len = strlen(str);
        for(int i=0; i<len - 1; i++){
            if(str[i] == '/' && str[i+1] == '/')
                break;
            if(str[i] == '-' && str[i+1] == '>'){
                str[i] = '.';
                for(int j = i + 1; j <= len - 1; j++)
                    str[j] = str[j + 1];
                len -= 1;
            }
        }
        puts(str);
    }
    return 0;
}
