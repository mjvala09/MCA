# list1 = [1,2,3]
# list2 = ["one","two","three"]
# z = zip(list1,list2)
# # print(z)

# dic1 = dict(z)
# print(dic1)



# String to dictionary
dick = {}
str = "1=one;2=two;3=three"
for i in str.split(';'):
	j,k = i.split('=')
	dick[int(j)] = k
print(dick)