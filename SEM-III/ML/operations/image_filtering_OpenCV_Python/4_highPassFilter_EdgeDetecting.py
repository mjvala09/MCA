import numpy as np
import cv2

img = cv2.imread("../images/intersect.png")


    #  Sobel filter
sobel_horizontal = cv2.Sobel(img, cv2.CV_64F, 1,0, ksize = 5)
sobel_vertical = cv2.Sobel(img, cv2.CV_64F, 0, 1, ksize = 5)

cv2.imshow("original", cv2.resize(img, (img.shape[1] // 4, img.shape[0] // 4)))
cv2.imshow("sobel_horizontal", cv2.resize(sobel_horizontal, (sobel_horizontal.shape[1] // 4, sobel_horizontal.shape[0] // 4)))
cv2.imshow("sobel_vertical", cv2.resize(sobel_vertical, (sobel_vertical.shape[1] // 4, sobel_vertical.shape[0] // 4)))

cv2.imshow("original", img)
cv2.imshow("sobel_horizontal", sobel_horizontal)
cv2.imshow("sobel_vertical", sobel_vertical)


    #  Laplacian filter
laplacian_filter = cv2.Laplacian(img, cv2.CV_64F)
cv2.imshow("Laplacian", laplacian_filter)


canny_filter = cv2.Canny(img, 50, 240)
cv2.imshow("Canny filter", canny_filter)
cv2.imshow("normal", img)
cv2.waitKey(0)