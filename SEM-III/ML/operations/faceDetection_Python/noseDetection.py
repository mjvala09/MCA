from matplotlib import pyplot as plt
import cv2

img = cv2.imread('img4.jpg')

noseClassifier = cv2.CascadeClassifier(
    cv2.data.haarcascades + "haarcascade_mcs_nose.xml"
)

nose = noseClassifier.detectMultiScale(
    img, scaleFactor=1.3, minNeighbors=5, minSize=(40,40)
)

for x,y,w,h in nose:
    cv2.rectangle(img, (x,y), (x+w,y+h), (0,255,0), 20)

img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
plt.imshow(img)
plt.show()