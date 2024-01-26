i=10
print(type(i),"\t\t",i,int(i))		#int
f=10.1
print(type(f),"\t",f,int(f))		#float
c=3+0.5j
print(type(c),"\t",c)				#complex
d=4+2.5j
e=c+d
print(type(e),"\t",e)				#complex
'''
	print(type(c),c,int(c))
	   TypeError: int() argument must be a string,
	   a bytes-like object or a real number, not 'complex'
'''
# power of 10 using 'e' or 'E'
a=3.4e3
b=3.4E3
print(type(a),"\t",a)				#float	3400
print(type(b),"\t",b,"\n")			#float	3400

# Boolean(true/false/0/1)
no=5<10
print(no,"\t", type(no))		#True
no=5>10
print(no)						#False
no=True+True
print(no)
no=False-True
print(no)
no=True*True
print(no)