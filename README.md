# ConsoleProject_ParkingLot 🚗
<br>

 
## 22.09.19 📅
-----------------------------

### 1. 유스케이스 다이어그램
<br>

[초안]
![image](https://user-images.githubusercontent.com/111114507/191259115-f3f4b65a-0d8f-4b42-8bd0-ce185cde36da.png)
![image](https://user-images.githubusercontent.com/111114507/191260929-1b4f039b-b8b9-4b49-b681-15851a8561ab.png)
<br>

- 회원 : 회원가입, 입차, 출차, 결제 => 차량인증(정규표현식)
- 관리자 
    - 매출 조회, 회원 목록 조회, 주차장 관리 => 관리자 인증
    - -> 주차장 관리 : 요금변경(default값 존재), 총 주차대수 변경, 차량조회(입출차기록, 결제금액/결제예정금액, 차량 사진 ... )
<br>

### 2. 유스케이스 명세서

![image](https://user-images.githubusercontent.com/111114507/191260666-df86611b-123f-4646-84de-e1437ebadacc.png)
<br>

#### [손정원👩 - 입차 & 출차]  
![image](https://user-images.githubusercontent.com/111114507/191261732-2e6ce701-263a-4bab-8d17-d9e89f1ca3b3.png)
![image](https://user-images.githubusercontent.com/111114507/191261732-2e6ce701-263a-4bab-8d17-d9e89f1ca3b3.png)
<br>

#### [김찬수🧑 - 결제]  
![image](https://user-images.githubusercontent.com/111114507/191262792-81f8b41e-7d0d-41c7-82c1-e9a4c97fbd88.png)
<br>

#### [고윤섭🧑 - 매출조회]  
![image](https://user-images.githubusercontent.com/111114507/191263037-c625369b-b4de-426d-9d98-1b3ab189b5d9.png)
<br>

#### [심승복🧑 - 회원관리]  
![image](https://user-images.githubusercontent.com/111114507/191263301-d3e472bb-b385-47c6-8fd2-50e1891556ee.png)
<br>

#### [김종민🧑 - 주차장관리]  
![image](https://user-images.githubusercontent.com/111114507/191263414-edbda19d-208b-4099-87cc-1d33d59ff970.png)
<br>

### 3. 시나리오
#### [사용자]  
![image](https://user-images.githubusercontent.com/111114507/191264355-a51c48fb-ba5f-4491-a392-23dc10cf6b39.png)
<br>

#### [관리자]  
![image](https://user-images.githubusercontent.com/111114507/191264475-709717c2-ef5e-4e46-9c2a-0200d52e401c.png)
<br>

#### [시스템]  
![image](https://user-images.githubusercontent.com/111114507/191264595-66851a94-1303-4eac-adee-bf54a1d4e66d.png)