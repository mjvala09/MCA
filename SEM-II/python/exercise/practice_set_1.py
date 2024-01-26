#1) write a program that print your name and your college name.
name = "Vala Manoj"
college = "Atmiya University"
print("name : ",name,"\nuniversity : ",college)


#2) write a program that prints your address with name.
address = "\nstreet 15,\nsky city\nveraval -362275"
print(name,address)


#3) write a program that accept two numbers and perform all basic mathematical operation and print.
no1 = float(input("Enter first number : "))
no2 = float(input("Enter second number : "))
print("addition : ",no1+no2)
print("subtraction : ",no1-no2)
print("multiplication : ",no1*no2)
print("division : ",no1/no2)
print("percentage : ",no1*no2/100)


#4) write a program to calculate simple interest.
# SI = PRN/100
p = 100
r = 10
n = 2
si = p*r*n/100
print(si)


#5)write a program to calculate 10% bonus of salary.
salary = 45000
bonus = salary*10/100
print("bonus of : ",bonus)
total_salary = salary + bonus
print("total salary : ",total_salary)


#6) write a program to convert KM into metre.
# 1km = 1000metre
km = int(input("enter kilometre : "))
metre = (km * 1000)
print(metre, "metre")


#7) the distance between two cities is input through keyboard.
#   write a program to convert and print this distance in feet, metre, inch and centimetre
#	km => feet = km * 3280.84
#	km => metre = km * 1000
#	km => inch = km * 39370.1
#	km => cm = km * 100000
km = int(input("Enter kilometre : "))
print(km, "kilometre =", km*3280.84, "feet")
print(km, "kilometre =", km*1000, "metre")
print(km, "kilometre =", km*39370.1, "inch")
print(km, "kilometre =", km*100000, "centimetre")


#8) write a program to find find volume of cylinder
#	volume = PI * Radius*Radius * Height
PI = 3.14
Radius = float(input("Enter Radius : "))
Height = float(input("Enter Height : "))
volume = PI * Radius * Radius * Height
print("Volume :",volume)


#9) write a program to calculate area of triangle
#	Base * height / 2
base = float(input("enter base of triangle : "))
height = float(input("enter height of triangle : "))
area = base * height / 2
print("area of triangle : ", area)


#10) write a program to calculate area and perimeter of rectangle
#	 area = height * width
#	 perimeter = 2(height + width)
width = float(input("enter width of triangle : "))
height = float(input("enter height of triangle : "))
area = height * width
perimeter = 2*(height + width)
print("area of rectangular :",area)
print("perimeter of rectangular :",perimeter)


#11) write a program to calculate area of circle
#	 area = PI * Radius * Radius
PI = 3.14
radius = float(input("enter radius : "))
area = PI * radius * radius
print("area of circle :",area)


#12) write a program to swap two value using third variable
no1 = 22
no2 = 44
print("before swaping :")
print("no1 =",no1)
print("no2 =",no2)
temp = no1
no1 = no2
no2 = temp
print("after swaping :")
print("no1 =",no1)
print("no2 =",no2)


#13) write a program to swap two values without using third variable
no1 = 22
no2 = 44
print("before swaping :")
print("no1 =",no1)
print("no2 =",no2)
no1 = no1+no2	#66=22+44
no2 = no1-no2	#22=66-44
no1 = no1-no2	#44=66-22
print("after swaping :")
print("no1 =",no1)
print("no2 =",no2)


#14) write a program to read the value of X and Y and print the result of following expression
#	 (X+Y)/(X-Y)
x = float(input("enter value of X : "))
y = float(input("enter value of Y : "))
print((x+y)/(x-y))


#15) write a program to convert nagative to positive and positive to nagative.
no = int(input("enter number : "))
#no = 0-no
no = no1
print(int(no))


#16) write a program to find out the net salary of an employee and get the basic salary from him.
#	 applicable TA 4%, DA 30%, HRA 15%, on basic salary.
#	 applicable 3% tax, 12% PF on basic salary.
basic_salary = float(input("enter basic salary : "))
salary1 = ((basic_salary*4/100) + (basic_salary*30/100) + (basic_salary*15/100))
print(salary1)
salary2 = ((basic_salary*3/100)+(basic_salary*12/100))
print(salary2)
net_salary = basic_salary+salary1-salary2
print(net_salary)

