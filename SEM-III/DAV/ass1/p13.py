start = int(input("Enter the first element : "))
end = int(input("Enter the last element : "))
ODD = 0
EVEN = 0
for i in range(start, end+1):
	if(i % 2 == 0):
		EVEN += i
	if(i % 2 != 0):
		ODD += i
print("EVEN : ",EVEN)
print("ODD : ",ODD)