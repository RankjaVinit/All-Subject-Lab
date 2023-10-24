#include<stdio.h>
void main(){
    printf("Series is : 1 + 4 + 9 + 16 + 25 + 36 + ... + n\nSum Till Which Term do you want : ");
    int n;
    scanf("%d",&n);
    int i = 1,sum = 0;
    while (i <= n)
    {
        sum+=(i*i);
        i++;
    }
    printf("\nSum is : %d\n\n",sum);
}