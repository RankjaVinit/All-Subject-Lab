#include<stdio.h>
void main(){
    int n,c = 0,i,a;
    printf("Enter Number : ");
    scanf("%d",&n);
    a = n;
    printf("-> LIST <-\n");
    for(i = 0;i <= 9;i++){
        c = 0;
        a = n;
        while(a != 0){
            if((a%10) == i) c++;
            a/=10;
        }
        if(c > 0) printf("Frequency of '%d' is %d\n",i,c);
    }
}