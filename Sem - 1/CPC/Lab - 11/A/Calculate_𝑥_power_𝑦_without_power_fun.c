#include<stdio.h>
void main(){
    double b,p,i,a = 1;
    printf("Enter Base and Power (B P) : ");
    scanf("%lf %lf",&b,&p);
    if(b == 0 && p == 0) printf("0 power 0 is Indeterminate Form. \n");
    else {
        for(i = 1;i <= p;i++){
            a*=b;
        }
        printf("%.lf power %.lf = %.lf\n",b,p,a);
    }
}