#include<stdio.h>
void main(){
    int a,b;
    char o;
    printf("Enter (No.1  Operation  No.2) : ");
    scanf("%d %c %d",&a,&o,&b);
    switch(o){
        case '+' : printf("%d + %d = %d\n",a,b,a+b);
                    break;
        case '-' : printf("%d - %d = %d\n",a,b,a-b);
                    break;
        case '*' : printf("%d * %d = %d\n",a,b,a*b);
                    break;
        case '/' : printf("%d / %d = %d\n",a,b,a/(float)b);
    }
}