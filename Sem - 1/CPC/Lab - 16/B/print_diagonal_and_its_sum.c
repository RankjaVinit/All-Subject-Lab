#include<stdio.h>
void main(){
    int n;
    printf("Enter Size of Square Matrix : ");
    scanf("%d",&n);
    int arr[n][n], i, j, s = 0;
    for(i = 0;i < n;i++){
        for(j = 0;j < n;j++){
            printf("Enter Element (%d, %d) :",i + 1, j + 1);
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Diagonal Element : ");
    for(i = 0;i < n;i++){
        printf("%d, ",arr[i][i]);
        s+=arr[i][i];
    }
    printf("\b\b \nSum = '%d'\n",s);
}