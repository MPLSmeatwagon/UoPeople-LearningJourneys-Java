# function that compares 2 parameters and returns 
def compare(a, b):
    if a > b:
        x = 0
        while x < 40:
            print(x*" ", a)
            a = a - 1
            x = x + 1
            compare(a, b)
        else:
            y = 0
            print(x*' ' - " " * y, a)
            a = a - 1
            y = y + 1
    elif a == b:
        print('a and b equal:', a)
    else:
        print(a*" ", a)
        a = a + 1
        compare(a, b)

#get 2 numbers from user and store them in variables
numA = int(input('Enter number "a": '))
numB = int(input('Enter number "b": '))

compare(numA, numB)
