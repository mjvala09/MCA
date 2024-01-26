import cv2

print("1 : Image\n2 : Video")
choise = int(input("Enter your choice : "))
if(choise == 1):
    img1 = cv2.imread("img4.jpg")
    face1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt.xml")
    face = face1.detectMultiScale(img1, scaleFactor=1.1, minNeighbors=5, minSize=(40, 40))

    for x,y,w,h in face:
        cv2.rectangle(img1, (x,y), (x+w,y+h), (0,255,0),50)

    cv2.imshow("face1", cv2.resize(img1, (img1.shape[1] // 4, img1.shape[0] // 7)))
    cv2.waitKey(0)
else:
    img1 = cv2.VideoCapture("video1.mp4")
    while True:   
        isTrue, img1 = img1.read()
        imgGRAY = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
        face1 = cv2.CascadeClassifier(cv2.data.haarcascades + "haarcascade_frontalface_alt.xml")
        face = face1.detectMultiScale(imgGRAY, scaleFactor=1.3, minNeighbors=5, minSize=(40, 40))

        for x,y,w,h in face:
            cv2.rectangle(imgGRAY, (x,y), (x+w,y+h), (0,255,0),50)

        cv2.imshow("face1", cv2.resize(img1, (img1.shape[1] // 4, img1.shape[0] // 7)))
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break
# print(img1)
# print(img1.shape)  # (4882, 3255, 3)

# img1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
# print(img1.shape)

