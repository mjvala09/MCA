# creating list of different type of elements:
l1 = [1,"2",'3',4.4,5]
print("int : %d \nchar : %s\nfloat : %f"%(l1[0],l1[1],l1[3]))

for i in l1:
	print(type(i),end="\t: ")
	print(i)
print("====================================")
# ===========================================================

# creating list using range() function :
# range(start = 0, stop = n, stepsize = 1)
l2 = list(range(10))
for i in l2:
	print(i,end=", ")
print("\n====================================")

l3 = list(range(1, 10))
for i in l3:
	print(i,end=", ")
print("\n====================================")

l4 = list(range(1,11,2))			
for i in l4:
	print(i,end=", ")
print("\n====================================")
# ===========================================================

# Accessing list elements using loops:
l5 = list(range(10))
i = 0
while(i < len(l5)):
	print(l5[i], end=", ")
	i+=1
print("\n====================================")

# ===========================================================




							# operations on list 
print("\n\n\t\t\t: operations on list :")
l6 = [0,1,2,3,4,5,6,7,8,9,10]
print("ORIGINAL : ",end="")					# ORIGINAL
print(l6)
print()

print("APPENDING 20 : ",end="")				# APPEND
l6.append(20)
print(l6)
print()

print("EXTENDING 20,30,40 : ",end="")		# EXTEND
l6.extend([20,30,40])
print(l6)
print()

print("UPDATING FIRST ELE' : ",end="")		# UPDATE
l6[1] = 10
print(l6)
print()

print("UPDATE A RANGE : ", end="")			# UPDATE A RANGE
l6[2:4] = 50,100
print(l6)
print()

print("DELETE BY INDEX : ")					# DELETE BY INDEX
print("DELETE 100: ", end="")				
del l6[3]
print(l6)
print()
print("DELETE LAST ELE : ", end="")			
del l6[-1]
print(l6)
print()

print("DELETE BY VALUE : ", end="")	   		# DELETE BY VALUE
l6.remove(0)
print(l6)
print()

print("REVERSE : ",end="")					# REVERSE
l6.reverse()
print(l6)
print("\n\n\n\n\n")
#=============================================================

print("CONCATENATION AND MEMBERSHIP : \n")										
l7 = [1,2,3]								# CONCATENATE 2 LISTS
l8 = [10,20,30]
l9 = l7+l8
print("l7 : ",l7)
print("l8 : ",l8)
print("l9 : ",l9)

print(l9*2)									# REPETITION OF LISTS

print(10 in l9)								# MEMBERSHIP IN LIST
print(20 not in l9)
print("\n\n\n\n\n")
#=============================================================

# 					: ALIASING AND CLONING :

# 	ALIAS :	list1 = list2		: CHANGES APPLY ON BOTH
# 	CLONE : list1 = list2[:]	: CHANGES NOT APPLY ON BOTH
print("ALIASING AND CLONING :\n")
l11 = [1,2,3]
l12 = l11
print(l11,l12)
l11[1] = 1000
print(l11,l12)
l12[1] = 2000
print(l11,l12)

l11 = [1,2,3]
l12 = l11[:]
print(l11,l12)
l11[1] = 1000
print(l11,l12)
l12[1] = 2000
print(l11,l12)
print("\n\n\n\n\n")


#=============================================================

# 					: METHODS TO PROCESS LIST :

l13 = [1,2,3,4,5]
print(l13)
print("SUM : ",sum(l13))						# sum()
print("MIN : ",min(l13))						# min()
print("MAX : ",max(l13))						# max()
print("COUNT 1: ",l13.count(1))					# count()
print("LEN : ",len(l13))						# len()
print("INDEX : ",l13.index(3))					# index()
print("APPEND : ",l13.append(10))				# append()
print("INSERT : ",l13.insert(3,20))				# insert()
print("COPY : ",l13.copy())						# copy()
print("POP() : ",l13.pop())						# pop()
print("POP(x) : ",l13.pop(2))					# pop(x)
print("CLEAR : ",l13.clear())					# clear()
print("LIST : ",l13)

#=============================================================

# 					: PROGRAMS OF LIST :

# 1) find maximum and minimum in list elements :
list1 = [12,42,35,11,22,15]
maximum = 0
minimum = list1[0]
for i in list1:
	if i > maximum:
		maximum = i
	if i < minimum:
		minimum = i

print("MAXIMUM : ",maximum)
print("MINIMUM : ",minimum)

# 2) count the element occurence in list
list2 = [12,42,35,11,42,22,12,15,12]
ele = 12 # int(input("Enter ele. to be count : "))
counter = 0
for i in range(len(list2)):
	if ele == list2[i]:
		counter += 1
print("COUNT : ",counter)

# 3) find common elements in list :
s1 = set(list1)
s2 = set(list2)
print("COMMON : ",s1.intersection(s2))


#=============================================================

# 					: NESTED LIST :

nl1 = [[1,2,3],[4,5,6],[7,8,9]]
print(nl1)
for row in nl1:
	print(row)
for row in nl1:
	for ele in row:
		print(ele,end=" ")
	print()

# shorten way of for loop in list
# que : create list of square from 1 to 10
list3 = [i**2 for i in range(1,11)]
print(list3)
