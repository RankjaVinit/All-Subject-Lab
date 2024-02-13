#include <stdio.h>
    struct Book
    {
        char bookTitle[30];
        char author[30];
        char publication[30];
        int price;

    };
    
void main() {
    int i ;
    struct Book b[3];
    for ( i = 0; i < 3; i++)
    {
        printf("Enter Book Title: \n" );
        scanf("%s",&b[i].bookTitle);
        printf("Enter Author name: \n" );
        scanf("%s",&b[i].author);
        printf("Enter Publication: \n" );
        scanf("%s",&b[i].publication);
        printf("Enter Price: \n" );
        scanf("%d",&b[i].price);
    }
        printf("\n");
    for ( i = 0; i < 3; i++)
    {
            printf("Book Title: %s \n",b[i].bookTitle);
            printf("Author: %s \n",b[i].author);
            printf("Publication: %s \n",b[i].publication);
            printf("Price %d \n",b[i].price);
    }
    
    
}