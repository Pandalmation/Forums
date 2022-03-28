#include<iostream>
using namespace std;

int FactIteration(int n) {
    int fact = 1;
    int i;
    for (i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}

int main() {
  int n;
  cout << "Enter a positive integer: ";
  cin >> n;
  cout << "Factorial of " << n << " = " << FactIteration(n);
  return 0;
}