#	str, byte, byte_array, list, tuple, range.

#1)str
a = "string"
b = 'string'
c = """this is string of sequence data type in python"""
print(a,b,c)

# Accessing string
print(c[2])
print(c[8:14])
print(c[-6:-1])
print(c * 5)
print(c[8:14] * 10)
#------------------------------------------------------

#2)bytes datatype
#0-255 positive number
lst = [10,20,30,40,50,60]
print(lst)
by = bytes(lst)
print(by)
print(by[3])
print(by[-3])
print(by[1:3])
#by[1] = 50		#TypeError: 'bytes' object does not support item assignment

#------------------------------------------------------
#3)bytearray datatype
lst = [10,20,30,40,50]
print(lst)
by = bytearray(lst)
print(by)
print(by[3])
print(by[-3])
print(by[1:3])

#modification allowed
print(by[1])
by[1] = 5
print(by[1])

#by[5] = 60		# IndexError: bytearray index out of range

#------------------------------------------------------
#4)list datatype
lst = [10,20,30,40,50,60]
print(lst)
print(lst)
print(lst[3])
print(lst[-3])
print(lst[1:3])
print(lst*5)
lst[5] = "list"
print(lst)

#------------------------------------------------------
#5)tuple datatype
tpl = ( 'this', 'is', "tuple", 'if', 4, ' element')
print(tpl)
print(tpl[0])
print(tpl[0:3])
print(tpl[-4])
print(tpl * 3)
#tpl[2] = "hello"	TypeError: 'tuple' object does not support item assignment


#6)range datatype
rng = (10, 20, 30, 40, 50)
a = range(10)
for i in a:print(i)
a = range(10, 21, 1)
print(a)
for i in a:print(i)