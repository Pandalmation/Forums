import os

file= input("Please enter filename.txt: ")
openfile= open(os.getcwd() + "\\" + file, "r")
newfile= open("newfile.txt", "w")
filecontent= list(openfile.read().split("\n"))
count= 1
for i in filecontent:
    if i != '':
        print(str(count) + ".", i, file=newfile, end=" ")
        count += 1
openfile.close()
newfile.close()