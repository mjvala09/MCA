import pickle

list1 = [1, 2, 3, 4, 5, 6, 7, 8]

file1 = open("d:\\abc.dat", "wb")

pickle.dump(list1, file1)

file1.close()

print("Done")
