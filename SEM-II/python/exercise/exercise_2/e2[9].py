import argparse
parser = argparse.ArgumentParser(description="enter values.")
parser.add_argument("number", nargs='*', type=int, help="you can enter number of values.")
args=parser.parse_args()
print(args.number)