#include<stdio.h>
#include<math.h>
int main()
{
  float r,a,pi=3.14,l;
  scanf("%f%f",&r,&a);
  l=(2*r*a*pi)/360;
  printf("%.2f",l);
  return 0;
}