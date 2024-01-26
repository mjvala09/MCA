import numpy as np
import cv2 as cv

img = cv.imread('../images/flower.jpg')

img = cv.resize(img, (img.shape[1] // 6, img.shape[0] // 8))
rows, cols = img.shape[:2]

# generating vignette mask using Guassian Kernals
y = cv.getGaussianKernel(int(1.5*rows), 200)
x = cv.getGaussianKernel(int(1.5*cols), 200)
xy = y * x.T

mask = 255 * xy / np.linalg.norm(xy)
mask = mask[int(0.5*rows):, int(0.5*cols):]
output = np.copy(img)

# Applying the mask to each channel in the input image
for i in range(3):
    output[:,:,i] = output[:,:,i] * mask

cv.imshow("ORIGINAL", img)
cv.imshow("VIGNETTE", output)
cv.waitKey(0)