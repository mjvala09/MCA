instruct='y'
no = int(input("Enter one number :- "))
while(instruct == 'y' or instruct == 'Y'):
	for i in range(1,11):
		print(no," X ",i," = ",(no*i))


	instruct=input("Do you want know another table ? ")
	if(instruct!='y' and instruct!='Y'):
		break;
	no = int(input("Enter one number :- "))
