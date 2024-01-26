# 1). Accept an integer from user tell user that whether entered number is even or odd. Example:  
# 	Enter the number: 7 
# 	7 is an odd number 
# 	Do you want to check another number? Y 
# 	Enter the number: 2 
# 	2 is an even number 
# 	Do you want to check another number? N 


instruct='Y'
while(instruct == 'Y' or instruct == 'y'):
	no = int(input("enter an integer number :- "))
	if(no%2 == 0):
		print(no," is an even number.")
		instruct=input('Do you want to check another number ? ')
	elif(no%2 == 1):
		print(no," is an odd number.")
		instruct=input('Do you want to check another number ? ')