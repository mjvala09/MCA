# finding substring from string
st='one two three one two'
print(st.count('one'))
print(st.count('one',1))
print(st.count('one',1,20))
# Replacing a substring
st='good morning'
print(st)
st=st.replace('morning','afternoon----------------')
print(st)
r1='afternoon'
r2='evening'
st=st.replace(r1,r2)
print(st)

# upper()	lower()	  swapcase()	title()
st='Good Morning'
print("upper()		:",st.upper())
print("lower()		:",st.lower())
print("swapcase()	:",st.swapcase())
print("title()		:",st.title())

# isalnum()		isalpha()	isdigit()	islower()	isupper()
ck1='a'
ck2='A'
ck3='1'
ck4='a12b'
ck5='abc'
print(ck5.isalpha())
print(ck4.isalnum())
print(ck1.islower())
print(ck2.isupper())
print(ck3.isdigit())

mobile = '1234567890'
print(mobile)
if(mobile.isdigit() == True):
	print('success')
else:
	print('Enter valid mobile number')

# Sort a string into alphabetic order
str=['bbb','aaa','ddd','ccc']
print(str)
str.sort()
print(str)
for i in str:
	print(i,end="\t")