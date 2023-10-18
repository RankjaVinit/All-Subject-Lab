#include<stdio.h>
void main(){
    int n;
    printf("Enter Number : ");
    scanf("%d",&n);
    int arr[n], i, count = 0;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        if(arr[i] % 3 == 0) count++;
    }
    printf("count = %d\n",count);
}