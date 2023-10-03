#include<stdio.h>
void main(){
    int i, j, k = 65;
    for(i = 1;i <= 5;i++){
        for(j = 1;j <= 6 - i;j++){
            printf(" ");
        }
        for(j = 1;j <= i;j++){
            if(i%2 == 0) printf("%c ",k++);
            else printf("%d ",j);
        }
        printf("\n");
    }
}