#include<stdio.h>
void main(){
    int n, a = 0,i,l,f,j;
    printf("Enter Number : ");
    scanf("%d",&n);
    l = n%10;
    n/=10;
    for(i = 1;n != 0;i++){
        a = a*10 + n%10;
        n/=10;
    }
    f = a%10;
    a/=10;
    n = l;
    n*=10;
    for(j = i - 2;j >= 1;j--){
        n+=a%10;
        a/=10;
        n*=10;
    }
    printf("Answer is %d\n",n + f);
}
