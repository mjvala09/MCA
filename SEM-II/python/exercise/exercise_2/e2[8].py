import argparse
parser = argparse.ArgumentParser(description="enter two integer value for all basic arithmetic operation.")
parser.add_argument("number", type=int, nargs=2, help="only two integer value are accepted.")
args=parser.parse_args()
print(args)
no1=int(args.number[0])
no2=int(args.number[1])

print("Addition 	",(no1+no2))
print("Subtraction 	",(no1-no2))
print("Division 	",(no1/no2))
print("Multiplication 	",(no1*no2))
