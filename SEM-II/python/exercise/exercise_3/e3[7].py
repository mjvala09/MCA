7. An online selling app wants to develop a module to calculate shipping charges on the purchase. 
Accept amount from the user and calculate the shipping charges. 
The shipping charges are as below:
	Shopping amount less than 1500 – The shipping charges is Rs. 100/-
		--Type the message: Please purchase (1500-amount) to avail shipping charge of Rs. 80/-
		--Please pay (amount+100)
	Shopping amount more than 1500 and less than 3000 – The shipping charges is Rs. 70/-
		--Type the message: Please purchase (3000-amount) to avail shipping charge of Rs. 50/-
		--Please pay (amount+70)
	Shopping amount more than 3000 – Free shipping + 7% discount on amount
		--Type a message: You saved (amount*7/100)
		--Please pay (amount – discount)
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
shopping_amount = int(input("Enter the shopping amount you want to purchase : "))
if(shopping_amount < 1500):
	print("The shipping charges is Rs. 100/-")
	print("Please purchase ",(1500-shopping_amount),"more to avail shipping charge of Rs. 80/-")
	print("please pay Rs.",(shopping_amount+100))

elif(shopping_amount == 1500):
	print("The shipping charges is Rs. 80/-")
	print("please pay Rs.",(shopping_amount+80))

elif(shopping_amount > 1500 and shopping_amount < 3000):
	print("The shipping charges is Rs. 70/-")
	print("Please purchase ",(3000-shopping_amount),"more to avail shipping charge of Rs. 50/-")
	print("please pay Rs.",(shopping_amount+70))

elif(shopping_amount == 3000):
	print("The shipping charges is Rs. 50/-")
	print("You are very close to get discount of 7%")
	print("please pay Rs.",(shopping_amount+50))

elif(shopping_amount > 3000):
	print("You saved ",(shopping_amount*7/100))
	print("please pay Rs.",(shopping_amount-(shopping_amount*(7/100))))
