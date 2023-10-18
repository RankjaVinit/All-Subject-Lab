#include<stdio.h>
void main(){
    int n;
    printf("Enter Number : ");
    scanf("%d",&n);
    int arr[n], copy[n], i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        copy[i] = arr[i];
    }
    for(i = 0;i < n;i++) printf("%d, ",copy[i]);
    printf("\b\b \n");
}