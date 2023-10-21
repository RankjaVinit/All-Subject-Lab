#include<stdio.h>
void main(){
    int a, b;
    printf("Enter size of Matrix (R C) : ");
    scanf("%d %d",&a,&b);
    int M1[a][b], M2[a][b], i, j;
    printf("Enter Matrix - 1 \n");
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1,j + 1);
            scanf("%d",&M1[i][j]);
        }
    }
    printf("Enter Matrix - 2 \n");
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1,j + 1);
            scanf("%d",&M2[i][j]);
        }
    }
    printf("Addition of Matrix : \n");
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("%d ",M1[i][j]);
        }
        if(i == a - 1) printf(" +  ");
        else printf("    ");
        for(j = 0;j < b;j++){
            printf("%d ",M2[i][j]);
        }
        if(i == a - 1) printf(" =  ");
        else printf("    ");
        for(j = 0;j < b;j++){
            printf("%d ",M1[i][j] + M2[i][j]);
        }
        printf("\n");
    }
}