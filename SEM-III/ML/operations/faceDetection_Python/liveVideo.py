import cv2 
import numpy as np

capture = cv2.VideoCapture('http://10.100.101.34:8080/video')

faceClassifier = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt.xml")
eyeClassifier = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_eye.xml")
# print(cv2.data)
while True:
    isTrue, img = capture.read()
    imgGRAY = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    face = faceClassifier.detectMultiScale(imgGRAY, scaleFactor=1.1, minNeighbors=5, minSize=(100,100))
    eye = eyeClassifier.detectMultiScale(imgGRAY, scaleFactor=1.1, minNeighbors=5, minSize=(320,320))
    for x,y,w,h in face:
        cv2.rectangle(img, (x,y),(x+w,y+h),(255,0,255),4)
    
    
    for x,y,w,h in eye:
        cv2.rectangle(img, (x,y),(x+w,y+h),(255,255,0),4)
    
    img = cv2.resize(img, (img.shape[1] // 4, img.shape[0] // 4))

    cv2.imshow("LIVE VIDEO", img)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
capture.release()
cv2.destroyAllWindows()