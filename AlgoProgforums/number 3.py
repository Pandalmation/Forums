with open(input('Enter file name: '),'r',encoding='utf-8') as f:
    words = [len(word) for line in f for word in line.rstrip().split(" ")]
    avgwordlen = float(sum(words))/float(len(words))
    avgwordlen= "{:.1f}".format(avgwordlen)
    print ("average word length is: ", avgwordlen)
f.close()