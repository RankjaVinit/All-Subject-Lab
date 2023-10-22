#include<stdio.h>
void main(){
    int a, b, i, j;
    printf("Enter Size of matrix (R C) : ");
    scanf("%d %d",&a,&b);
    int arr[a][b];
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1,j + 1);
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Transpose of a matrix : \n");
    for(i = 0;i < b;i++){
        for(j = 0;j < a;j++){
            printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
}