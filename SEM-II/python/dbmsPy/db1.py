import MySQLdb
con = MySQLdb.connect(host='localhost',database='exam2',user='root',password='')
cursor = con.cursor()

# for i in rows:
# 	id = i[0]
# 	name = i[1]
# 	email = i[2]
# 	print('%-6d %-15s %-80s'%(id,name,email))

str = "insert into users(name,email) values('one','one@gmail.com')"
cursor.execute(str)
con.commit()
cursor.execute("select id, name, email from users")
rows = cursor.fetchall()
for i in rows:
	id = i[0]
	name = i[1]
	email = i[2]
	print('%-6d %-15s %-80s'%(id,name,email))

cursor.close()
con.close()