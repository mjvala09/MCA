
marks1 = int(input("Enter first marks : "))
marks2 = int(input("Enter second marks : "))
marks3 = int(input("Enter third marks : "))
marks4 = int(input("Enter fourth marks : "))
if(marks1 > (marks2 and marks3 and marks4)):
	print("marks1 ",marks1," is highest among all")
elif(marks2 > (marks1 and marks3 and marks4)):
	print("marks2 ",marks2," is highest among all")
elif(marks3 > (marks1 and marks2 and marks4)):
	print("marks3 ",marks3," is highest among all")
elif(marks4 > (marks1 and marks2 and marks3)):
	print("marks4 ",marks4," is highest among all")
else:
	print("marks are same!")