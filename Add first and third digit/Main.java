#include<stdio.h>
int main()
{
  int n,m,o,p=0;
  scanf("%d",&n);
  m=n%10;
  o=n;
  while(n>=10)
  {
    n=n/10;
  }
  o=n;
  p=o+m;
  printf("%d",p);
  return 0;
}