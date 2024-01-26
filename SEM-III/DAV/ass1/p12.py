number = int(input("Enter any integer number : "))
sum = 0
while True:
	sum += int(number % 10)
	number /= 10
	if(number < 1):
		break
print(sum)