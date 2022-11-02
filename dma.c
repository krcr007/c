#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *ptr;
    int i;
    int n;
    printf("Enter the number of elements:");
    scanf("%d", &n);
    // ptr = (int *)malloc(10 * sizeof(int));
    ptr = (int *)calloc(n, n*sizeof(int));
    for (i = 1; i < n+1; i++)
    {
        printf("Enter the value no %d of this array\n", i);
        scanf("%d", &ptr[i]);
    }
    for (i = 1; i < n+1; i++)
    {
        printf("Enter the value no %d of this array:\t%d\n", i, ptr[i]);
    }

   // printf("%lu",sizeof(ptr));
   printf("Enter the new size of the array:");
   scanf("%d",&n);
    ptr = (int *)realloc(ptr, n*sizeof(int));
    for (i = 1; i < n+1; i++)
    {
        printf("\nEnter the new  value no %d of this array\n", i);
        scanf("%d", &ptr[i]);
    }
    for (i = 1; i < n+1; i++)
    {
        printf("Enter the new value no %d of this array:\t%d\n", i, ptr[i]);
    }
    free(ptr);
   

    return 0;
}