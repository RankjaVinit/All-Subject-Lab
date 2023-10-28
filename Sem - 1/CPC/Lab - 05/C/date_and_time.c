#include<stdio.h>
#include<time.h>

void main()
{
    time_t t;   // not a primitive datatype
    time(&t);

    printf("\nThis program has been started at (date and time): %s\n\n", ctime(&t));
}