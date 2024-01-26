import numpy as np
import cv2
from matplotlib import pyplot as plt

img = cv2.imread("../images/building.jpg")
img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
cv2.imshow("original", cv2.resize(img, (img.shape[1] // 6, img.shape[0] // 6)))

south_west = np.array([[0,-1,-1],
                       [1,0,-1],
                       [1,1,0]])
south_east = np.array([[0,1,1],
                       [-1,0,1],
                       [-1,-1,0]])
north_west = np.array([[1,0,0],
                       [0,0,0],
                       [0,0,-1]])

south_west_image = cv2.filter2D(img, -1, south_west) + 128
south_east_image = cv2.filter2D(img, -1, south_east) + 128
north_west_image = cv2.filter2D(img, -1, north_west) + 128

plt.imshow(south_east_image),plt.show()
plt.imshow(north_west_image),plt.show()
plt.imshow(south_west_image),plt.show()
