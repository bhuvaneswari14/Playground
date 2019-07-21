#include<stdio.h>
int main()
{
  int q,r,n=365,m=4;
  q=n/m;
  r=n%m;
  printf("Quotient: %d\n",q);
  printf("Remainder: %d\n",r);
  return 0;
}