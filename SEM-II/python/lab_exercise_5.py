# # 1 Create a list using range function and do following activities: 
# 	# - append some value,
# 	# - update some value, 
# 	# - Delete the value (by position and by value).
# lst = list(range(0,10))
# print(lst)
# print('Before appended values :')
# for i in lst:
# 	print(i, end=' ')
# print()
# lst.append(10)
# lst.append(11)
# lst.append(12)
# print('After appended some values :')
# for i in lst:
# 	print(i, end=' ')
# print()
# lst[5] = 10
# print('After updated some values :')
# for i in lst:
# 	print(i, end=' ')
# print()
# lst.remove(10)
# lst.remove(11)
# print('After removed 10 and 11 :')
# for i in lst:
# 	print(i, end=' ')
# print()
# print('After removed 10th index value :')
# lst.pop(10)
# for i in lst:
# 	print(i, end=' ')


# # 2 Take 3 strings from user as an input, and display it in the reverse order.
# str = [i for i in(input('Enter first string : ')).split()]
# # print(str)
# for i in str[::-1]:
# 	print(i,end="\t")


# # 3 Take string from the user, then ask user to insert one string so that we can give number of time that particular string is repeated.
# str = [i for i in(input('Enter first string : ')).split()]
# print(str)
# print(str.count(input('Insert string to count : ')))


# # 4 Accept value of tuple from the user. Apply all functions to process tuple.
# lst = [int(i) for i in(input('Enter values for the tuple : ').split())]
# tpl = tuple(lst)
# print(tpl)
# print("length	:	",len(tpl))
# print("min	:	",min(tpl))
# print("max	:	",max(tpl))
# print("index	:	",tpl.index(55))
# print("count	:	",tpl.count(11))
# print("sorted	:	",sorted(tpl))


# # 5 Accept values from the user in the form of key:value, apply all dictionary methods.
# dic = {}
# str = input("Enter values in the form of key:value seperated by commas : ")
# for i in str.split(','):
# 	print(i)
# 	j,k = i.split(':')
# 	dic[int(j)] = k
# print(dic)

# dic2 = {}
# str = input("Enter values in the form of key:value seperated by commas : ")
# for i in str.split(','):
# 	print(i)
# 	j,k = i.split(':')
# 	dic2[int(j)] = k
# print(dic2)

# dic.update(dic2)
# print(dic)

# dic1 = dic.copy()
# print(dic1)
# print(dic.keys())
# print(dic.values())
# print(dic.items())

# values = ('abc','def','ghi','jkl')
# dic1 = dic.fromkeys(values,1)
# print(dic1)
# d=dic1.pop('def')
# print(d)
# print(dic1)

# d=dic1.popitem()
# d=dic1.popitem()
# d=dic1.popitem()
# print(d)
# print(dic1)

# dic.clear()
# print(dic)




# 6 Accept student_name:age from the user. Perform following operations on it: 
# i). Give total of all students age, 
# ii). Find an average age of student, 
# iii). Student with highest age 
# iv). Give facility so as user can know the age of any student by inputting the students age.
# student = {}
# str = input("Student name : age ")
# for stud in str.split(","):
# 	name,age = stud.split(":")
# 	student[name] = int(age)
# print(student)
# total = sum(student.values())
# print('total :',total)

# average = total/len(student)
# print('average :',average)

# max = max(student, key= lambda x: student[x])
# print('max :',max)

# age = int(input('Enter age to know the name of the student : '))
# value = {v for v in student if student[v]==age}
# print(value)





# 7 Ask user to fill array with string. Give two facilities: 
# i). Allow user to search for an element from the string, 
# ii). Also give the position at which the search element was found.
from numpy import*
arr = array(input('Enter string : ').split())
print(arr)
srch = input('Enter search string : ')
count = 0
for i in arr:
	count += 1
	if(i == srch):
		print(i,'at position',count)



# 8 Take following values from the user: 
# -Name (It must allow only alphabet in capital letters), 
# -Age (Only number), 
# -Address (Must be alpha numeric). 
# If all the constraints are fulfilled than display all values






