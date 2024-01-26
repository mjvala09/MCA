import numpy as np
import cv2 as cv

img = cv.imread("../images/word.jpg")

img1 = cv.cvtColor(img, cv.COLOR_BGR2GRAY)

cv.imshow("ORIGINAL", cv.resize(img1, (img1.shape[1] // 6,img1.shape[0] // 6)))

arr = np.ones((5,5), np.uint8)

erode_image = cv.erode(img1, arr, iterations=3)
cv.imshow("ERODE", cv.resize(erode_image, (erode_image.shape[1] // 6,erode_image.shape[0] // 6)))

dilate_image = cv.dilate(img1, arr, iterations=3)
cv.imshow("DILATE", cv.resize(dilate_image, (dilate_image.shape[1] // 6, dilate_image.shape[0] // 6)))

cv.waitKey(0)