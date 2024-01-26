from matplotlib import pyplot as plt
import cv2

img = cv2.imread('img4.jpg')

img = cv2.cvtColor(img, cv2.COLOR_RGB2BGR)
mouthClassifier = cv2.CascadeClassifier(
    cv2.data.haarcascades + "haarcascade_mcs_mouth.xml"
)

mouth = mouthClassifier.detectMultiScale(img, scaleFactor=1.3, minNeighbors=20, minSize=(40,40))
for x,y,w,h in mouth:
    cv2.rectangle(img, (x,y), (x+w,y+h), (0,255,0), 20)

plt.imshow(img)
plt.show()