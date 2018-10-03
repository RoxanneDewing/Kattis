import sys


def main():
    list1 = []
    fin = []
    data = sys.stdin.read()
    list1 = data.split('\n')
    num = int(list1[0])
    for x in range(num):
        temp =  list1[x+1]
        t = temp.split(' ')
        if t[0] == 'entry':
            if t[1] in fin:
                print(t[1]+' entered (ANOMALY)')
            else:
                print(t[1]+' entered')
                fin.append(t[1])
                
        else:
            if t[1] in fin:
                print(t[1]+ ' exited')
                fin.remove(t[1])
            else:
                print(t[1]+ ' exited (ANOMALY)')
            
        #print(list1[x+1])
        
        

if __name__ == "__main__":
	main()