#include<stdio.h>
void main(){
    char op;
    printf("Enter what you want to Do( + , - , / , * ) : ");
    scanf("%c",&op);
    int a, b;
    printf("Enter No.1 : ");
    scanf("%d",&a);
    printf("Enter No.2 : ");
    scanf("%d",&b);
    if(op == '+'){
        printf("%d + %d = %d\n",a,b,a+b);
    }
    else if(op == '-'){
        printf("%d - %d = %d\n",a,b,a-b);
    }
    else if(op == '*'){
        printf("%d * %d = %d\n",a,b,a*b);
    }
    else if(op == '/'){
        double d = (a * 1.0 )/ b;
        printf("%d / %d = %lf\n",a,b,d);
    }

}