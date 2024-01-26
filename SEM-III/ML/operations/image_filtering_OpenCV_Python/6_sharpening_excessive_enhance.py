import numpy as np
import cv2 as cv

img = cv.imread("../images/single_tree.jpg")
cv.imshow("ORIGINAL", cv.resize(img, (img.shape[1] // 4, img.shape[0] // 4)))

# Creating arrays for SHARPENING
sharpening_arr = np.array([[-1,-1,-1],
                           [-1,9,-1],
                           [-1,-1,-1]])
excessive_arr = np.array([[1,1,1],
                          [1,-7,1],
                          [1,1,1]])
edge_enhancements = np.array([[-1,-1,-1,-1,-1],
                              [-1,2,2,2,-1],
                              [-1,2,8,2,-1],
                              [-1,2,2,2,-1],
                              [-1,-1,-1,-1,-1]]) / 8

# Applying SHARPENING arrays to the image
sharpening_arr_image = cv.filter2D(img, -1, sharpening_arr)
excessive_arr_image = cv.filter2D(img, -1, excessive_arr)
edge_enhancements_image = cv.filter2D(img, -1, edge_enhancements)

# Displaying the image
cv.imshow("SHARPENING", cv.resize(sharpening_arr_image, (sharpening_arr_image.shape[1] // 7, sharpening_arr_image.shape[0] // 7)))
cv.imshow("EXCESSIVE", cv.resize(excessive_arr_image, (excessive_arr_image.shape[1] // 7, excessive_arr_image.shape[0] // 7)))
cv.imshow("EDGE ENHANCEMENTS", cv.resize(edge_enhancements_image, (edge_enhancements_image.shape[1] // 7, edge_enhancements_image.shape[0] // 7)))

cv.waitKey(0)