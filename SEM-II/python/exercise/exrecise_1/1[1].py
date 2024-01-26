# 1). Insert string into the variable and perform following tasks: 
# -Print the type of the variable with a message “The type of the variable is:” 
# -Print the string with a message “The string is:” 
# -Display the 3rd character of the string 
# -Display character from 4th to 6th from the string 
# -Change the 3rd character of the string replace it with ‘A’. 

a = "morning"
print("The type of the variable is: ", type(a))
print("The string is : ", a)
print(a[2])
print(a[3:5])
# a[2]='A'	->TypeError: 'str' object does not support item assignment