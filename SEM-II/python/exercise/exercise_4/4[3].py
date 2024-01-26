instruct='y'
no = int(input("Enter number :- "))
while(instruct == 'y' or instruct == 'Y'):
	counter=0
	for i in range(1,no):
		if(no%i==0):
			counter+=1
			if(counter==2):
				print(no," is non-prime number")
				break
	if(counter!=2):
		print(no," is prime number")
	instruct=input("Do you want to check another number ? ")
	if(instruct!='y' and instruct!='Y'):
		break;
	no = int(input("enter number :- "))