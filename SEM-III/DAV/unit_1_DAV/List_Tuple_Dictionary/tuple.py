tpl1 = ()
print(type(tpl1))				# <class 'tuple'>
tpl2 = (10,)					# tpl2 = (10) 	==   <class 'int'>
print(type(tpl2))				# <class 'tuple'>
tpl3 = (1,2,3.3,'4')
print(type(tpl3))				# <class 'tuple'>
tpl4 = 1,2,3,4
print(type(tpl4))				# <class 'tuple'>
lst = [1,2,3]
print(type(lst))				# <class 'list'>
tpl5 = tuple(lst)
print(type(tpl5))				# <class 'tuple'>

print(tpl1,"\t",tpl2,"\t",tpl3,"\t",tpl4,"\t",tpl5)
# ==================================================================

# Accessing the tuple elements :
t1 = (10,20,30,40,50)
print(t1[0],t1[4],t1[-1])
print(t1[-4],t1[-5])
print(t1,t1[:])					# [start, stop, stepsize]
print(t1[::2])					# [  o  , n-1 ,    1    ]
print(t1[-5:-1])

ten,twenty = t1[0:2]
print(ten,twenty)
print(20 in t1)					# MEMBERSHIP OPERATOR
print(200 in t1)				# same as in list.
print(20 not in t1)
print(200 not in t1)

print(t1*3)

for i in t1:
	print(i,end=", ")
print()
print("length : ",len(t1))


# ==========================================================

# 					: TUPLE_FUNCTION :
print("\n\n\n\t\t\t: TUPLE_FUNCTION : \n")
#	len(tpl)  
# 	min(tpl)  
# 	max(tpl)  
# 	tpl.count(x)  
# 	tpl.index(x)	
# 	sorted(tpl)		->		sorted(tpl, reverse = True)

t1 = (1,2,3)
print(t1)
print("len(tuple) : ",len(t1))
print("min(tuple) : ",min(t1))
print("max(tuple) : ",max(t1))
print("tuple.count() : ",t1.count(1))
print("tuple.index() : ",t1.index(2))
print("sorted(tuple) : ",sorted(t1))
print("sorted(tuple, reverse=False) : ",sorted(t1, reverse=False))
print("sorted(tuple, reverse=True) : ",sorted(t1, reverse=True))


# ================================================================
# num = eval(input("Enter element in () : "))
# print(num)				
# print(type(num))

# from string  ->  list  ->  tuple
st = "1,2,3"
print("string : ",st)
lst = [int(i) for i in st.split(',')]
print("list : ",lst)
t1 = tuple(lst)
print("tuple : ",t1)

'''
1)	Delete element from tuple
2)	Modify element in tuple
3)	Insert element in tuple
'''