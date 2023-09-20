#include<stdio.h>
void main(){
    int n, sum = 0,a ,i = 1;
    printf("Enter how many numbers do you want to enter : ");
    scanf("%d",&n);
    while(i <= n){
        printf("Enter No.%d : ",i);
        scanf("%d",&a);
        sum+=a;
        i++;
    }
    printf("Sum = %d, Average = %.2lf\n",sum,sum/(float)n);
}