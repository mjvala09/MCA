

# Converting list into Dictionary :
state_name = ['Gujarat','Maharastra','Karnataka','Madhyapradesh','Rajasthan']
capital_name = ['Gandhinagar','Mumbai','Bangaluru','Bhopal','Jaipur']
z = zip(state_name,capital_name)
print(z)
d = dict(z)
print(d)
for i,j in d.items():
	print(i,"\t",j)

# # Converting String into Dictionary:
# # FIRST WAY :
# str = '1=abc,2=bcd,3=cde,4=def'
# print(str)
# lst=[]
# for i in str.split(','):
# 	j = i.split('=')
# 	print(j)
# 	lst.append(j)
# print(lst)
# d=dict(lst)
# print(d)
# d1={}
# for key,value in d.items():
# 	d1[int(key)]=value
# print(d1)
# # ==============================================================
# # SECOND WAY :
# from collections import OrderedDict
# str = '1=abc,3=cde,2=bcd,4=def'
# d={}
# for i in str.split(','):
# 	j,k = i.split('=')
# 	d[int(j)]=k
# print(d)
# print(type(d))

# print(OrderedDict(d ))
# print(d)
# print(d.fromkeys('1','xxx'))
# print(d)

# print(d.setdefault(6))
# print(d.values())

# a,b = 10,20
# x = lambda a,b : a+b
# j=x
# print(j)

# def modify (a):
# 	print(id(a))
# # def modify1 (a):
# # 	a=7
# # 	print(id(a))
# a=7
# modify (a)
# print(id(a))
# modify1(a)
# print(id(a))


# square = lambda x:x*x
# print(square(10))

# big = lambda a,b:a if a>b else b
# print(big(6,5))

# def gen1(a,b):
# 	while a<=b:
# 		yield a
# 		a=a+1
# 		yield a
# print(gen1(5,6))


