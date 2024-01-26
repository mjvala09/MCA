# 2). Accept set of numbers from the user, filter and display even numbers and odd numbers separately. Example: 
# Enter set of numbers: 2,8,7,6,4,5,7,9,11 
# Following are even numbers: 2,8,6,4 
# Following are odd numbers: 7,7,9,11 

import argparse

a=[a for a in input('enter three values : ').split()]
length=len(a)
print("Odd numbers are : ",end="\t")
for i in range(length):
	if(int(a[i]) % 2 != 0):
		print(a[i],end="\t")
print("\nEven numbers are : ",end="\t")
for i in range(length):
	if(int(a[i]) % 2 == 0):
		print(a[i],end="\t")
