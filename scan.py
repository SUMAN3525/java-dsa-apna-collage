import cv2
import face_recognition
# Load the image
image_path = "path_to_your_image.jpg"
image = face_recognition.load_image_file(image_path)
# Find all face locations and encodings in the image
face_locations = face_recognition.face_locations(image)
face_encodings = face_recognition.face_encodings(image, face_locations)
# Print the number of faces detected
print(f"Found {len(face_locations)} face(s)")
# Load a known image for comparison
known_image = face_recognition.load_image_file("path_to_known_person.jpg")
known_encoding = face_recognition.face_encodings(known_image)[0]
# Loop through each face found in the image
for face_location, face_encoding in zip(face_locations, face_encodings):
    top, right, bottom, left = face_location
    # Compare the face to the known encoding
    results = face_recognition.compare_faces([known_encoding], face_encoding)
    # Draw a rectangle around the face
    cv2.rectangle(image, (left, top), (right, bottom), (0, 255, 0), 2)

    # Display the result
    if results[0]:
        cv2.putText(image, "Known Person", (left, top - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0, 255, 0), 2)
    else:
        cv2.putText(image, "Unknown", (left, top - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0, 0, 255), 2)
# Convert image from RGB (face_recognition) to BGR (OpenCV)
image_bgr = cv2.cvtColor(image, cv2.COLOR_RGB2BGR)
# Show the image
cv2.imshow("Face Recognition", image_bgr)
cv2.waitKey(0)
cv2.destroyAllWindows()