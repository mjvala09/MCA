import pickle

file1 = open("d:\\abc.dat", "rb")

data = pickle.load(file1)

file1.close()

print(data)