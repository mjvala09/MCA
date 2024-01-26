lst=[1,2,3,4,5,6,7,8]
print(lst)
tpl=tuple(lst)
print(tpl)
n=int(input('enter position where you want to insert the data : '))
data=list(input('enter the data : '))
lst1=list(tpl[0:n])
lst2=list(tpl[n:])
lst3=lst1+data+lst2
tpl=tuple(lst3)
print(tpl)
