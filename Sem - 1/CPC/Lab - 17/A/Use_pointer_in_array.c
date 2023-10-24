#include<stdio.h>
void main(){
    int n;
    printf("how many number do you want to enter : ");
    scanf("%d",&n);
    int arr[n], i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",arr + i);
    }
    for(i = 0;i < n;i++){
        printf("%d, ",*arr + i);
    }
    printf("\b\b \n");
}