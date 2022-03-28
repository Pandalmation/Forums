#include<iostream>
using namespace std;

int FactRecursion(int n) {
  if(n > 1) 
    return n * FactRecursion(n - 1);
  else
    return 1;
}

int main() {
  int n;
  cout << "Enter a positive integer: ";
  cin >> n;
  cout << "Factorial of " << n << " = " << FactRecursion(n);
  return 0;
}

