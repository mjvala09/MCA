import argparse
parser=argparse.ArgumentParser(description="Enter a value for square :")
parser.add_argument("no", type=int, help="insert an integer value : ")
args = parser.parse_args()
ans = args.no**2
print("the square : ", ans)
