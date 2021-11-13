import os

file= input("Please enter filename.txt: ")
openfile = open(os.getcwd() + "\\" + file, "r", encoding="utf-8")
readfile = openfile.read().split()
titles = ("Mr.","Ms.","Dr.","Jr.","Mrs.")
newline= " "

for i in readfile:
    if "?" not in i and "!" not in i:
        newline+=(i + " ")
        if i not in titles and "." in i.split(" "):
            pass
        if i not in titles and "." in i[-1]:
            newline+="\n"
    else:
        newline+=(i+"\n")

print(newline)