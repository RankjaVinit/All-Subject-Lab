#include<stdio.h>
void main(){
    int b,p;
    printf("Enter base and power (B P) : ");
    scanf("%d %d",&b,&p);
    int j,i,ans = b,x = b;
    if(b == 0 && p == 0) printf("0^0 is Indeterminate form.\n");
    else if(p == 0) printf("%d^%d = 1\n",b,p);
    else {
        for(i = p;i > 1;i--){
            ans = 0;
            for(j = 1;j <= b;j++){
                ans+=x;
            }
            x = ans;
        }
        printf("%d^%d = %d\n",b,p,ans);
    }
}