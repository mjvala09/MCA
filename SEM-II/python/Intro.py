'''
	1) single line comment #____
	2) multi line comment """___"""
'''
a=b=7,'hi'
print(a,b)
a,b,c=7,'hi','hello'		#  all values are stored sequential
print(a,b,c)
print(b)
print('many ' * 7)
print(
		'hello how are you'
)
#	'\n' new line
print('\tfirst line\and\second line')	# '\n' for new line and '\t' for tab
a=3
b=4
print(a,b)
print(a,b, sep="-")
print(a,b, sep='+')
#----------------------------------------------------------------------------
city='Rajkot'
print(city)
print("city is :" , city)			#	first way to showing variable
print("city is : " + city)			#	second way to showing variable
print("city is : %s"%city)			#	third way to showing variable
print("city is : {0}" .format(city))#	forth way to showing variable

#placeholder
a=7
b=25
print("three values are : {0},{1},{1}" .format(a,b)) #index from {0}{1}{2}...

#Take input from user
a=input("enter the values : ")
print("values are : " + a)	#Loosely coupled language
b=float(input("enter values : "))
print(b)
print(b,type(b))