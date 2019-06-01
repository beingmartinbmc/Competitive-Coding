 #include<stdio.h>
 int main()
 {
      int n,t,ch;
      scanf("%d",&t);
      int i;
      for( i=1;i<=t;i++)
      {
           scanf("%d",&n);
           ch=n%12;
           switch(ch)
           {
                case 0 : n-=11;
                           printf("%d WS\n",n);
                           break;
                case 1 : n+=11;
                           printf("%d WS\n",n);
                           break;
                case 2 : n+=9;
                           printf("%d MS\n",n);
                           break;
                case 3 : n+=7;
                           printf("%d AS\n",n);
                           break;
                case 4 : n+=5;
                           printf("%d AS\n",n);
                           break;
                case 5 : n+=3;
                           printf("%d MS\n",n);
                           break;
             case 6 : n+=1;
                           printf("%d WS\n",n);
                           break;
                case 7 : n-=1;
                           printf("%d WS\n",n);
                           break;
                case 8 : n-=3;
                           printf("%d MS\n",n);
                           break;
                case 9 : n-=5;
                           printf("%d AS\n",n);
                           break;
             case 10 : n-=7;
                           printf("%d AS\n",n);
                           break;
             case 11 : n-=9;
                           printf("%d MS\n",n);
                           break;
           }
      }
      return 0;
 }
