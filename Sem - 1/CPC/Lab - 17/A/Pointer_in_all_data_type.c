#include<stdio.h>
void main(){
    int a = 0;
    char b = 'A';
    float c = 1.2;
    double d = 2.3;

    int *Pa = &a;
    char *Pb = &b;
    float *Pc = &c;
    double *Pd = &d;

    printf("Int : \n");
    printf("%d\n",Pa);
    printf("%d\n\n",*Pa);
    printf("char : \n");
    printf("%d\n",Pb);
    printf("%c\n\n",*Pb);
    printf("float : \n");
    printf("%d\n",Pc);
    printf("%f\n\n",*Pc);
    printf("double : \n");
    printf("%d\n",Pd);
    printf("%lf\n",*Pd);
}