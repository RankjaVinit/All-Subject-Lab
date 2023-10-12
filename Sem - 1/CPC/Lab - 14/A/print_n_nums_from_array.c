#include<stdio.h>
void main(){
    int n;
    printf("Enter how numbers do want to enter : ");
    scanf("%d",&n);
    int arr[n], i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    printf("from Number 1 : ");
    for(i = 0;i < n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\b\b \nfrom Number %d : ",n);
    for(i = n - 1;i >= 0;i--){
        printf("%d, ",arr[i]);
    }
    printf("\b\b \n");
}