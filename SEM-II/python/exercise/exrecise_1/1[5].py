# 5). Create a dictionary with at least 10 values and perform the following task: 
# -Display all the elements of the dictionary. 
# -Check the class of the dictionary you made. 
# -Display the value stored in the key 7. 
# -Change the value stored in the key 7. 
# -Display all the values only.

dct = {1:"one", 2:"two", 3:"three", 4:"four", 5:"five",
	   6:"six", 7:"seven", 8:"eight", 9:"nine", 10:"ten"}
print(dct)
print(type(dct))
print(dct[7])
dct[7] = "seventh_index"
print(dct.values())