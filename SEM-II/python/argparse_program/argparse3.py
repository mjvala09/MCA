import argparse
parser = argparse.ArgumentParser(description="Enter multiple value :")
parser.add_argument('val', nargs='+')
args = parser.parse_args()
for a in args.val :
    print(a)