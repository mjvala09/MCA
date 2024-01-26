import argparse
parser=argparse.ArgumentParser(description="enter an integer value :")
parser.add_argument("no1", type=int, help="insert integer value")
parser.add_argument("no2", type=int, help="insert integer value")
args=parser.parse_args()
sum = args.no1 + args.no2
print(sum)