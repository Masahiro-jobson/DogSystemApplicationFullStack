I made full stack application with Spring Boot, React, MySql.
This system is Dog System Application to manage dog age, name, address, and type.

Backend code is written by Spring Boot framework with Java language.
I made 6 classess as below.
To enable connection between Frontend and Backend side, I added @CrossOrigin in DogController.<br/>
<img width="315" alt="image" src="https://github.com/user-attachments/assets/e668ca4c-5c27-4f69-a0af-6acfd35541f9" />
<br/>
Frontend code is written by React with Java Script.
I used Material UI to visualize contents much better for users.
I set useState for each values (age, name, address,type) and set functions for each value too.
And, use those functions for the event handler(onChange) which happens when each text field is changed.<br/>
<img width="157" alt="image" src="https://github.com/user-attachments/assets/b6193429-7a67-4b9b-9de5-dffaccb949ee" />
<br/>
For database, I used MySql with phpMyAdmin for managing in the local server.
It allows to store datas (e.g, age, name, address, type) that user inputs.<br/>
<img width="880" alt="image" src="https://github.com/user-attachments/assets/bfdbd15a-bd4f-4ab5-b51d-8691a1540d88" />
<br/>
Regarding API, I used postman to check a communication between java and react.
It enables to try how codes works after inputs each data and how the result is when user inputs from the website.
1. When I tried "POST" to the database<br/>
<img width="625" alt="image" src="https://github.com/user-attachments/assets/072df322-230d-48c6-a2b6-ac3868668a78" />
<br/>
2. When I "GET" all datas from the database.<br/>
<img width="1005" alt="image" src="https://github.com/user-attachments/assets/e90ae2fa-ad10-4cad-ae8e-a6fd2cee2fc5" />
<br/>
Finally, the website outlook is the image below.
1. User inputs view<br/>
<img width="1183" alt="image" src="https://github.com/user-attachments/assets/e1f62dcd-4a53-4a20-9bca-66dbe6e3103d" />
<br/>
2. User outputs view <br/>
<img width="1166" alt="image" src="https://github.com/user-attachments/assets/9ec6e86a-37ea-4fb7-8c7e-fcffa7a35a07" />

