#include<stdio.h>
void main(){
    int i;
    char c;
    for(i = 0;i <= 127;i++){
        c = (char)i;
        printf("'%d' -> '%c'  \n",i,c);
    }
}