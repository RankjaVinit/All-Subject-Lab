#include<stdio.h>
void main(){
    double p, roi, t;
    printf("\nEnter 'P' : ");
    scanf("%lf",&p);
    printf("\nEnter 'ROI' : ");
    scanf("%lf",&roi);
    printf("\nEnter 'T' : ");
    scanf("%lf",&t);
    printf("\nSimple interest is %lf.\n",p * roi * t / 100);
}