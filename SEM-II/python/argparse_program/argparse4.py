# import argparse
# parser = argparse.ArgumentParser(description="help")
# parser.add_argument("no1", type=int, help="enter only integer")
# parser.add_argument("no2", type=int, help="enter only integer")
# args = parser.parse_args()
# print(args.no1+args.no2)

# + * ?

# import argparse
# parser=argparse.ArgumentParser(description="help")
# parser.add_argument('no1',nargs='+', type=int,help='Enter Number only')
# args=parser.parse_args()
# print(args.no1)


# names = (1,2,3,4,5,6,7,8,9)
# unique = int(input("enter integer: "))
# pos = int(input("position:"))
# temp1 = list(names[0:pos-1])
# temp1.append(unique)
# temp1.append((names[pos:]))

# print(temp1)





# f = open("text.txt", 'w')
# f1 = open("text1.txt", 'w')
# f2 = open("text2.txt", 'w')
# f3 = open("text3.txt", 'w')
# f.write("hello")
# f1.write("hello1")
# f2.write("hello2")
# f3.write("hello3")
# f.close()
# f1.close()
# f2.close()
# f3.close()

# from zipfile import*
# f = ZipFile("textzip.zip", 'w', ZIP_DEFLATED)
# f.write("text.txt")
# f.write("text1.txt")
# f.write("text2.txt")
# f.write("text3.txt")
# f.close()

# from zipfile import*
# f = ZipFile("textzip.zip",'r',ZIP_DEFLATED)
# f.extractall()
# f.close()

def fun(lst1):
	lst1.append(10)
	print(lst1)
	print(id(lst1))
	print(lst1 is lst)

lst = [1,2,3]
print(lst)
print(id(lst))

fun(lst)
lst.append(11)
print(lst)
print(id(lst))
print(lst is lst)