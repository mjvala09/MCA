import cv2 as cv
import numpy as np

img = cv.imread('../images/signBoard.jpg')
kernal_identity = np.array([[0,0,0],[0,1,0],[0,0,0]])
kernal_3x3 = np.ones((3,3), np.float32) / 9
# kernal_5x5 = np.ones((5,5), np.float32) / 25
kernal_5x5 = np.ones((7,7), np.float32) / 25
# kernal_9x9 = np.ones((25,25), np.float32) / 625   # more blurred
print(kernal_identity)
print(kernal_3x3)
print(kernal_5x5)
img1 = cv.filter2D(img, -1, kernal_identity)
cv.imshow("identity", cv.resize(img1, (img1.shape[1] // 4, img1.shape[0] // 4)))

img2 = cv.filter2D(img, -1, kernal_3x3)
cv.imshow("3x3", cv.resize(img2, (img2.shape[1] // 4, img2.shape[0] // 4)))

img3 = cv.filter2D(img, -1, kernal_5x5)
cv.imshow("5x5", cv.resize(img3, (img3.shape[1] // 4, img3.shape[0] // 4)))


cv.imshow("img",cv.resize(img, (img.shape[1] // 4, img.shape[0] // 4)))
cv.waitKey(0)