# 6. Accept an integer from the user, display number of digits user has input.
# Note: Give output up to 3 digits, else display the message: Number of
# digits is more than 3 (Hint: I/p: 16, O/p: You have entered 2 digits) 

value = input("Enter an integer value : ")
length = len(value)

if(length <= 3):
	print("You has entered ",length," digit")
elif(length > 3):
	print("Number of digits are more than 3")