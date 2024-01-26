# 6). Take an input from the user. Also ask number of rows to be displayed. Make a right angle triangle   using that input. 

symbol = input("Enter symbol for triangle :- ")
rows = int(input("Number of rows :- "))
columns = int(input("Number of columns :- "))
for i in range(rows):
	for j in range(columns):
		print(symbol,end=" ")
	print()
