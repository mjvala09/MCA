import argparse
parser = argparse.ArgumentParser(description="Enter a numeric value.")
parser.add_argument("number", type=int, help="only integer value can be accepted.")
args=parser.parse_args()
num = (int(args.number)+2)
print(num)