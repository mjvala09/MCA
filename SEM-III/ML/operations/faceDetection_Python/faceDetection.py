import cv2

img1 = cv2.imread("img2.jpg")
print(img1)
print(img1.shape)  # (4882, 3255, 3)

grayimg1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
print(grayimg1.shape)

face1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt.xml")
face = face1.detectMultiScale(grayimg1, scaleFactor=1.1, minNeighbors=5, minSize=(40, 40))

for x,y,w,h in face:
    cv2.rectangle(grayimg1, (x,y), (x+w,y+h), (60,55,60),50)

# cv2.imshow("face1", cv2.resize(img1, (img1.shape[1] // 5, img1.shape[0] // 7)))
# cv2.waitKey(0)

cv2.imshow("face1", cv2.resize(grayimg1, (grayimg1.shape[1] // 4, grayimg1.shape[0] // 7)))
cv2.waitKey(0)
