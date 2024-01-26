# 4). Accept a character from the user tell user that whether entered number is Vowel or Consonant. Example: 
	# Enter one character: a 
	# a is Vowel 
	# Do you want to check another character? Y 
	# Enter one character: s 
	# s is consonant 
	# Do you want to check another character? N 
	# Thank you for using my Program 
vowel = ['a','e','i','o','u','A','E','I','O','U']
instruct='y'
ch = input("Enter one character :- ")
length=len(vowel)
while(instruct == 'y' or instruct == 'Y'):
	counter=0
	for i in range(length):
		if(ch==vowel[i]):
			print(ch," is Vowel")
			break;
	for i in range(len(vowel)):
		if(ch!=vowel[i]):
			counter+=1
	if(counter==length):
		print(ch,' is a consonent')
	instruct=input("Do you want to check another characher ? ")
	if(instruct!='y' and instruct!='Y'):
		break;
	ch = input("Enter one character :- ")
print("Thank you for using my Program ")