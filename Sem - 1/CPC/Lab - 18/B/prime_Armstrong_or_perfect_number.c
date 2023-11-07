#include<stdio.h>
void prime(int n);
void Armstrong(int n);
void perfect(int n);
void main(){
    int n;
    printf("Enter number : ");
    scanf("%d",&n);
    prime(n);
    Armstrong(n);
    perfect(n);
}
void prime(int n){
    int i;
    for(i = 2;i <= n/2;i++){
        if(n%i == 0){
            printf("Number is Composite.\n");
            break;
        }
    }
    if(i > n/2) printf("Number is Prime.\n");
}
void Armstrong(int n){
    int i = n, sum = 0;
    while(i != 0){
        sum+=((i%10)*(i%10)*(i%10));
        i/=10;
    }
    if(sum == n) printf("Number is Armstrong.\n");
    else printf("Number is Not Armstrong.\n");
}
void perfect(int n){
    int i, sum = 0;
    for(i = 1;i < n;i++){
        if(n%i == 0) sum+=i;
    }
    if(sum == n) printf("Number is Perfect.\n");
    else printf("Number is Not Perfect.\n");
}