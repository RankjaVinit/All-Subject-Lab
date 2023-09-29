
#include<stdio.h>
void main(){
    int i;
    double term = 1, ans = 1;
    for(i = 1;i <= 1000;i++){
        term/=(float)i;
        ans+=(float)term;
    }
    printf("e = %.7f\n",ans);
}