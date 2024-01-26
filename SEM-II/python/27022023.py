a=b=7,'hi'
print(a,b)

a,b=7,'hi'
print(a,b)

print('hi \n' * 5)
a=3
b=34
print(a,b)
print(a,b, sep="-")
city = "Rajkot"
print(city)
print("city is : "+ city)
print("city is : ",city)
print("city is : %s"%city)
print("city is : {0}".format(city))

a = 7
b = 25
print("three value are : {0}, {1} and {0}".format(a,b))

take input from user
a = input("enter value : ")		#we can enter any type of value
print(a)
print(type(a))		#type is always str(string) until we specified
a = float(input("enter float or decimal value : "))
print(a)

#calculation
a = int(input("a = "))
b = int(input("b = "))
print("addition",a+b)
print("subtraction",a-b)
print("multiplication",a*b)
print("division",a/b)

#simple interest(SI=PRN/100)
p = 1000
r = 10
n = 2
si = (p*r*n/100)
print("simple interest of 1000 by rate:10 and years 2 : ",si)

def add(a,b):
	"""to add two number
	and display it"""
	print("sum : ",(a+b))
add(3,4)

print(3.4e3)
"""to show power of 10
we can use 'e' or 'E' 
before the power """

#complex
a = 3+3j
b = 2+2j
print(a+b)

#binary	octal	hexa decimal
bi = 0b101
oc = 0o7
hx = 0xDA
print("binary : {0}\noctal : {1}hexa decimal : {2}".format(bi,oc,hx))

no = 7
print("binary : ",bin(no))
print("octal : ",oct(no))
print("hexa decimal : ",hex(no))

#explicitly conversation of data type
a=3.4
print(a)
b=int(a)
print(b)
c=float(101)
print(c)
d=a<b
print(d)
d=a>b
print(d)
d=True+True+2
print(d)
print(d+5)

#sequence
#1)str(string)
a = "good"
b = 'morning'
print(a,b)
c = "hello good morning"
print(c[2])
print(c[-2])
print(c[-7:18])
print(c[11:18])
print(c[-7:18]*5)