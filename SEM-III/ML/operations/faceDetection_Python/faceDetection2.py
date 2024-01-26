import matplotlib.pyplot as plt
import cv2

img1 = cv2.imread("img3.jpg")
print(img1)
print(img1.shape)  # (4882, 3255, 3)

grayimg1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
print(grayimg1.shape)

face1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt2.xml")
eye1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_lefteye_2splits.xml")
mouth1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_smile.xml")

eye = eye1.detectMultiScale(img1, scaleFactor=1.1, minNeighbors=5, minSize=(40, 40))
face = face1.detectMultiScale(img1, scaleFactor=1.1, minNeighbors=5, minSize=(40, 40))
mouth = mouth1.detectMultiScale(img1, scaleFactor=1.1, minNeighbors=5, minSize=(4000, 4000))

for x,y,w,h in face:
    cv2.circle(img1, (x,y), (x+w,y+h), (0,255,0),5)
for x,y,w,h in eye:
    cv2.rectangle(img1, (x,y), (x+w,y+h), (0,255,0),5)
for x,y,w,h in mouth:
    cv2.rectangle(img1, (x,y), (x+w,y+h), (0,255,0),5)


cv2.imshow("face1", cv2.resize(img1, (img1.shape[1] // 5, img1.shape[0] // 7)))
cv2.waitKey(0)

# cv2.imshow("face1", cv2.resize(grayimg1, (grayimg1.shape[1] // 4, grayimg1.shape[0] // 7)))
# cv2.waitKey(0)


# plt.figure(figsize=(20,10))               matplotlib.pyplot
# plt.imshow(img1)
# plt.axis('off',emit=True)
