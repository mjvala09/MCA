import numpy as np
import cv2

img1 = cv2.imread('../images/flower.jpg')
img2 = cv2.imread('../images/flower.jpg', cv2.IMREAD_GRAYSCALE)

cv2.imshow('Flower1', cv2.resize(img1, (img1.shape[1] // 5, img1.shape[0] // 5)))
cv2.imshow('Flower2', cv2.resize(img2, (img2.shape[1] // 5, img2.shape[0] // 5)))
cv2.waitKey(0)