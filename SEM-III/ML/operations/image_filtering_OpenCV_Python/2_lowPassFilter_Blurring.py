import cv2 as cv
import numpy as np

for i in range(10):
    img = cv.imread('../images/wooden.jpg')
    kernal_identity = np.array([[0,0,0],[0,i,0],[0,0,0]])
            # filter2D(src, ddepth, kernel)
    img1 = cv.filter2D(img, -1, kernal_identity)
    cv.imshow("identity", img1)

    cv.imshow("img",img)
    cv.waitKey(0)