#include<stdio.h>
void main(){
    int a, b, p = 0, n = 0, o = 0;
    printf("Enter size of Matrix (R C) : ");
    scanf("%d %d",&a,&b);
    int arr[a][b], i, j;
    for(i = 0;i < a;i++){
        for(j = 0;j < b;j++){
            printf("Enter Element (%d, %d) : ",i + 1,j + 1);
            scanf("%d",&arr[i][j]);
            if(arr[i][j] < 0) n++;
            else if(arr[i][j] > 0) p++;
            else o++;
        }
    }
    printf("Count of : Positive Number :- %d, Negative Number :- %d, Zero :- %d\n", p, n, o);
}