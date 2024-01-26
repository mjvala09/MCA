import numpy as np
import cv2 as cv

img = cv.imread("../images/single_tree.jpg")
img = cv.resize(img, (img.shape[0] // 4, img.shape[1] // 6))
cv.imshow("nature", img)

# Creating motion array
for i in range(1,10):
    size = i
    motion_array = np.zeros((size, size))
    motion_array[int((size-1)/2),:] = np.ones(size)
    motion_array = motion_array / size

    # Applying motion array to the image
    motion_image = cv.filter2D(img, -1, motion_array)
    cv.imshow("motion_image", motion_image)
    cv.waitKey(0)