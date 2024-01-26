import matplotlib.pyplot as plt
year = [2, 3, 4, 5, 10]
populations = [100, 200, 250, 400, 500]
# plt.plot(year,populations)
# plt.scatter(year,populations)
plt.hist(populations, bins=20)
plt.xlabel('year')
plt.ylabel('total population')
plt.title('yearly population in the world')
plt.legend()
plt.savefig("first.png")
plt.show()
