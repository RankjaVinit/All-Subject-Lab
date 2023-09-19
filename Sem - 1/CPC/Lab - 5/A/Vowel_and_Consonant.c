#include<stdio.h>
void main(){
    char ch;
    printf("Enter Any character : ");
    scanf("%c",&ch);
    if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
        printf("%c is Vowel.\n",ch);
    }
    else printf("%c is Consonant.\n",ch);
}