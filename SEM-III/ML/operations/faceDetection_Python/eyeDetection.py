import cv2
import numpy as np

face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt2.xml")
eye_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_lefteye_2splits.xml")

if face_cascade.empty():
    raise IOError('Unable to load the face cascade classifier xml file')
if eye_cascade.empty():
    raise IOError('Unable to load the eye cascade classifier xml file')
ds_factor = 0.5
while True:
    capture = cv2.VideoCapture("http://10.100.101.34:8080/video")
    ret, frame = capture.read()
    # frame = cv2.resize(frame, (frame.shape[1] // 5, frame.shape[0] // 5))
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray, 1.3, minNeighbors=5, minSize=(40,40))
    for (x,y,w,h) in faces:
        cv2.rectangle(frame, (x,y), (x+w, y+h), (0,255,0), 5)
        roi_gray = gray[y:y+h, x:x+w]
        roi_color = frame[y:y+h, x:x+w]
        eyes = eye_cascade.detectMultiScale(gray, 1.3, minNeighbors=5, minSize=(40,40))
        for (x_eye,y_eye,w_eye,h_eye) in eyes:
            cv2.rectangle(frame, (x_eye,y_eye), (x_eye+w_eye,y_eye+h_eye), (0,255,0),5)

            cv2.imshow('Eye Detector', frame)
            cv2.waitKey(0)
capture.release()
cv2.destroyAllWindows()
