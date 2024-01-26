# 4). Create a tuple using a tuple() class. 
# -Modify the 1st element of the tuple. 
# -Display the 3rd to 6th element from the tuple. 
# -Display the 3rd to 6th element from the tuple using negative index. 

lst = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
print(lst)
tpl = tuple(lst)
print(tpl)
# tpl[0] = "MCA"  -->TypeError: 'tuple' object does not support item assignment
print(tpl[2:6])
print(tpl[-8:-4])
