#include<stdio.h>
void main(){
    int a, b, co = 0;
    printf("Enter Size of Matrix (R C) : ");
    scanf("%d %d",&a,&b);
    int arr[a][b], i, j;
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1, j + 1);
            scanf("%d",&arr[i][j]);
            if(arr[i][j] == 0) co++;
        }
    }
    (co>(a*b/2))?printf("Your Matrix is Sparse Matrix.\n"):printf("Your Matrix is Not Sparse Matrix.\n");
}