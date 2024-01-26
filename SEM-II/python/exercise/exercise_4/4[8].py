# 8). Display prime numbers or non prime numbers between 1 and 10 on the basis of user’s choice. If user   inserts 1, than display Prime numbers. If user inserts 2, than display Non prime numbers. 

instruct = int(input("Choose one :\n\t(1) Prime number\n\t(2) Non-prime number\n->"))
for i in range(1,11):
	counter = 0
	for j in range(1,i):
		if(i%j == 0):
			counter+=1
	if(instruct == 1):
		if(counter == 1):
			print(i)
	elif(instruct == 2):
		if(counter > 1):
			print(i)
	else:
		print("Invalid choise")
		break
