#include<stdio.h>
void main(){
    printf("Sum of Series 1 - 2 + 3 - 4 + 5 - ... \nSum of how many terms do you want to do : ");
    int i = 2,n,sum = 1;
    scanf("%d",&n);
    while(i <= n){
        if(i % 2 == 0) sum-=i;
        else sum+=i;
        i++;
    }
    printf("Sum of First %d Terms is %d.\n",n,sum);

}