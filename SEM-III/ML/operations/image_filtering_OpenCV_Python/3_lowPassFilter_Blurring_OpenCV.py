import numpy as np
import cv2 as cv

img = cv.imread("../images/wooden.jpg")

for i in range(1,10,2):
    result = cv.blur(img, (i,i))

    cv.imshow("result", result)
    cv.waitKey(0)