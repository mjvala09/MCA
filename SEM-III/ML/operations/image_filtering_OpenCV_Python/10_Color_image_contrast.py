import numpy as np
import cv2

img = cv2.imread('../images/forContrast2.jpg')

img_yuv = cv2.cvtColor(img, cv2.COLOR_BGR2YUV)

img_yuv[:,:,0] = cv2.equalizeHist(img_yuv[:,:,0])

output = cv2.cvtColor(img_yuv, cv2.COLOR_YUV2BGR)

cv2.imshow('ORIGINAL', cv2.resize(img, (img.shape[1] // 5, img.shape[0] // 5)))
cv2.imshow('YUV', cv2.resize(output, (output.shape[1] // 5, output.shape[0] // 5)))
cv2.waitKey(0)