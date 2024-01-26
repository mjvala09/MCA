# Write a python program which accepts the number one by one until the user enters 0. Find out total positive numbers, total negative numbers,average of the nos. and total numbers you entered.Write a python program which accepts the number one by one until the user enters 0. Find out total positive numbers, total negative numbers,average of the nos. and total numbers you entered.

lst = []
positive = []
negative = []
while True:
	value = int(input("Enter the number : "))
	if(value == 0):
		break
	lst.append(value)
	if(value > 0):
		positive.append(value)
	if(value < 0):
		negative.append(value)

print(lst)
print("POSITIVE : ",positive)
print("NEGATIVE : ",negative)
print("EVERAGE : ",int(sum(lst)/len(lst)))
print("Total numbers are entered : ",len(lst))