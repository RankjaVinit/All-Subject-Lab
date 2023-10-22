#include<stdio.h>
void main(){
    int a, b;
    printf("Enter Size of Matrix (R C) : ");
    scanf("%d %d",&a,&b);
    int arr[a][b], i, j;
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1, j + 1);
            scanf("%d",&arr[i][j]);
        }
    }
    printf("upper triangle : \n");
    for(i = 0;i < a;i++){
        for(j = 0;j <= i;j++) printf("   ");
        for(j = i + 1;j < b;j++) printf("%2d ",arr[i][j]);
        printf("\n");
    }
}