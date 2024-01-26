import cv2

img = cv2.imread('../images/forContrast.jpg',0)
img = cv2.resize(img, (img.shape[1] // 5, img.shape[0] // 5))

contrast = cv2.equalizeHist(img)

cv2.imshow("ORIGINAL", img)
cv2.imshow("CONTRAST", contrast)
cv2.waitKey(0)
