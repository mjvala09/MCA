import cv2
from matplotlib import pyplot as plt

img = cv2.imread('left-ear.jpg')

earClassifier = cv2.CascadeClassifier(
    cv2.data.haarcascades + "haarcascade_mcs_leftear.xml"
)

ears = earClassifier.detectMultiScale(
    img, scaleFactor=1.3, minNeighbors=5, minSize=(40,40)
)

for x,y,w,h in ears:
    cv2.rectangle(img, (x,y), (x+w,y+h), (0,255,0), 20)

img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
plt.imshow(img)
plt.show()