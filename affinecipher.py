# count=-1
# while(True):
# 	a=int(input("enter a number"))
# 	cno1=a*5+8
# 	cno2=cno1%26
# 	print(cno2)
# 	for letter in 'abcdefghijklmnopqrstuvwxyz':
#     		count=count+1
# 			if(a==count):
#         		print(letter)
# 	if  int(input("Enter 1 to continue")) :
# 		True
# 	else:
# 		False 

s=True
while s==True:
    a = int(input("enter a number"))
    count = -1
    cno1 = a * 5 + 8
    cno2 = cno1 % 26
    print(cno2)
    for letter in 'abcdefghijklmnopqrstuvwxyz':
        count = count + 1
        if cno2 == count:
            print(letter)
    io=int(input("Enter 1 to continue"))
    if io==1:
        s=True
    else:
        s=False
