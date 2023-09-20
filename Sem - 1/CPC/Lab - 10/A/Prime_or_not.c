#include<stdio.h>
void main(){
    int n, i = 2,c = 2;
    printf("Enter Number : ");
    scanf("%d",&n);
    while (i <= n/2)
    {
        if(n % i == 0) c++;
        i++;
    }
    if(c == 2) printf("%d is Prime Number. \n",n);
    else printf("%d is composite Number. \n",n);    
}