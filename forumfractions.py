#import math and fraction library
import math
from fractions import Fraction
#insert a numerator
n= int(input("Enter a numerator: "))
while True:
    if (n>0):
        break
    else:
        n= int(input("Numerator must be a positive integer. Please try again: "))
        continue
#insert a denominator
d= int(input("Enter a Denominator: "))
while True:
    if (d>0):
        break
    else:
        d= int(input("Denominator must be a positive integer. Please try again: "))
        continue
#math modules used
gcd= math.gcd(n,d)
w= (n//d)
r= n%d
ngcd= n//gcd
dgcd = d//gcd
gcdnd = math.gcd(ngcd,dgcd)

#If it is a Proper fraction + can be reduced or not
while True:
    if (n<d):
        print(n,"/",d, "is a proper fraction.")
        if gcd>1:
            print("This proper fraction can be reduced: ",Fraction(n,d))
            break   
        else:
            print("This proper fraction cannot be reduced any further.")
            break
#If it is an improper fraction + mixed number + whole number + can be reduced or not
    if (n>d):
        print(n,"/",d, "is a improper fraction.")
        if gcd==1 and d>1:
            print("This improper fraction cannot be reduced any further.")
            print("The mixed number is ",w,"and", r,"/",d)
            break
        if gcd==1:  
            print("This improper fraction cannot be reduced any further.")
            print("The whole number is ",w)
            break
        if gcdnd==1 and dgcd>1:
            print("This improper fraction can be reduced to: ",Fraction(n,d))
            print("The mixed number is ",w,"and",ngcd-(w*dgcd),"/",(dgcd))
            break
        else: 
            print("The improper fraction can be reduced further to become: ",ngcd,"/",(dgcd),"the whole number is ",w)
            break