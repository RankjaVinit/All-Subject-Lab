#include<stdio.h>
void main(){
    int a1, b1, a2, b2;
    printf("Enter Size of Matrix - 1 (R C) : ");
    scanf("%d %d",&a1,&b1);
    a2 = b1;
    int M1[a1][b1],i ,j, k;
    for(i = 0;i < a1;i++){
        for(j = 0;j < b1;j++){
            printf("Enter Element (%d, %d) : ",i + 1, j + 1);
            scanf("%d",&M1[i][j]);
        }
    }
    printf("Enter Size of Matrix - 2 (R C) : %d X ",b1);
    scanf("%d",&b2);
    int M2[a1][b1];
    for(i = 0;i < a1;i++){
        for(j = 0;j < b1;j++){
            printf("Enter Element (%d, %d) : ",i + 1, j + 1);
            scanf("%d",&M2[i][j]);
        }
    }
    int M3[a1][b2];
    for(i = 0;i < a1;i++){
        for(j = 0;j < b2;j++){
            M3[i][j] = 0;
            for(k = 0;k < b1;k++){
                M3[i][j]+=(M1[i][k]*M2[k][j]);
            }
        }
    }
    printf("\nM1 X M2 = ");
    for(i = 0;i < a1;i++){
        for(j = 0;j < b2;j++){
            printf("%2d ",M3[i][j]);
        }
        printf("\n          ");
    }
    printf("\n");
} 