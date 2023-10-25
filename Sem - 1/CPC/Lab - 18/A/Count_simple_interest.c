#include<stdio.h>
double SI(int ,int ,int );
void main(){
    int p,t,r;
    printf("Enter P R T : ");
    scanf("%d %d %d",&p, &r, &t);
    double si = SI(p,r,t);
    printf("S.I. = %.2lf",si);
}
double SI(int p,int r,int t){
    return (p*r*t/100.0);
}