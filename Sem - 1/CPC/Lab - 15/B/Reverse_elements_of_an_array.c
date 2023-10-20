#include<stdio.h>
void main(){
    int n;
    printf("How many Number od you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, j = n - 1;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < j;i++){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        j--;
    }
    for(i = 0;i < n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\b\b \n");
}