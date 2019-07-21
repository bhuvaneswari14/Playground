#include<stdio.h>
int main()
{
 int array[100],search,c,n,count=0;
scanf("%d",&n);
  for(c=0;c<n;c++)
    scanf("%d",&array[c]);
          scanf("%d",&search);
          for(c=0;c<n;c++)
          {
            if(array[c]==search)
            {
              printf("%d",c+1);
              count++;
            }
          }
          if(count==0)
          printf("%d isn't present in the array.",search);
          return 0;
          }
