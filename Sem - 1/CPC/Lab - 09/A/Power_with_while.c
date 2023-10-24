#include<stdio.h>
void main(){
    int b, p, ans = 1,i = 1;
    printf("Enter Base And Power(B P) : ");
    scanf("%d %d",&b,&p);
    if(b == 0 && p == 0) printf("0 Power 0 is Indeterminate Form.\n");
    else { 
        while(i <= p){
            ans*=b;
            i++;
        }
        printf("\n%d Power %d = %d\n",b,p,ans);
    }
}