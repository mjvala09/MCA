# it stores unique key
# key should be immutable(string, tuple, dictionary) type
d0 = {1:'one', 2:'two', 3:'three', 2:'second'}
print(d0)	# two is replaced by second
d1 = {'roll' : 10, 'name' : 'python', 'department' : 'BCA'}
print(d1)
print(type(d1))								# <class 'dict'>

# ACCESSING ELEMENTS						# ACCESSING
print('ROLL : ',d1['roll'])					# d1[key]
print('NAME : ',d1['name'])	
print('DEPARTMENT : ',d1['department'])	

# UPDATING ELEMENTS							# UPDATING
d1['roll'] = 100
print(d1)

d1['department'] = 'MCA'
print(d1)

# DELETING ELEMENTS							# DELETING
del d1['roll']
print(d1)

# INSERTING ELEMENTS						# INSERTING
d1['new'] = 'new_element'
print(d1)

# MEMBERSHIP OPERATOR						# MEMBERSHIP
print('name' in d1)
print('program' in d1)
print('name' not in d1)
print('program' not in d1)

# DICTIONARY METHODS						# METHOD
d2 = d1.copy()								# copy()
print(d2)



