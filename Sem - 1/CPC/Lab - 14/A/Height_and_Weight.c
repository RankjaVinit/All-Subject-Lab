#include<stdio.h>
void main(){
    int h[5], w[5], i, hc = 0,wc = 0;
    for(i = 0;i < 5;i++){
        printf("Enter Height and Weight of person %d (like H W ). : ",i + 1);
        scanf("%d %d",&h[i],&w[i]);
        if(h[i] > 170) hc++;
        if(w[i] < 50) wc++;
    }
    printf("%d person has height is greater then 170.\n",hc);
    printf("%d person has weight is less then 50.\n",hc);
}