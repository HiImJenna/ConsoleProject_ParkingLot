# ConsoleProject_ParkingLot 🚗
<br>

<details>
<summary>Project</summary>

### 1. [09.19](https://github.com/HiImJenna/ConsoleProject_ParkingLot#220919-)
### 2. [09.20](https://github.com/HiImJenna/ConsoleProject_ParkingLot#220920-)
### 3. [09.21](https://github.com/HiImJenna/ConsoleProject_ParkingLot#220921-)
</details>
 
## 22.09.19 📅
-----------------------------
### To-Do List📝
- [x] 주제 선정
- [x] 유스케이스 다이어그램 작성
- [x] 유스케이스 명세서 작성 (역할분담)
- [x] 유스케이스 기반 시나리오 작성

### 1. 유스케이스 다이어그램
<br>

#### [초안]
![image](https://user-images.githubusercontent.com/111114507/191259115-f3f4b65a-0d8f-4b42-8bd0-ce185cde36da.png)
![image](https://user-images.githubusercontent.com/111114507/191260929-1b4f039b-b8b9-4b49-b681-15851a8561ab.png)
<br>

- 회원 : 회원가입, 입차, 출차, 결제 => 차량인증(정규표현식)
- 관리자 
    - 매출 조회, 회원 목록 조회, 주차장 관리 => 관리자 인증
    - -> 주차장 관리 : 요금변경(default값 존재), 총 주차대수 변경, 차량조회(입출차기록, 결제금액/결제예정금액, 차량 사진 ... )
<br>

### 2. 유스케이스 명세서
#### [회원가입]  

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
```java
- 사용자는 차량을 입차 시킬 수 있다. 차량 입차시 사용자는 차량 번호를 입력 한다.
- 사용자는 차량입차를 완료하면 완료 메시지와 함께 초기 화면으로 돌아간다.
- 사용자는 출차 전 사전결제를 할 수 있다.
- 사용자는 시스템에서 결제 메뉴를 선택할 수 있다.
- 사용자는 요금 결제시 입차시 입력했던 차량 번호를 입력하면 주차시간과 요금과 할인정보를 확인할 수 있다. .
- 사용자는 결제 가능한 카드를 제시하여 요금을 결제한다.
- 사용자는 출력된 영수증을 확인할 수 있다.
- 사용자는 시스템에서 출차 메뉴를 선택해 차량을 출차 시킬 수 있다.  출차 시에는 입차시 입력했던 차량 번호를 입력해야 한다.
- 사용자는 회원가입을 할 수 있다.
- 사용자의 회원가입 형식은 차량번호와 전화번호로 구성되어 있으며 회원가입시 회원고유번호가 부여된다. 형식과 다를 경우 오류 메시지가 출력된다.
- 사용자의 회원가입 형식에는 정규표현식을 적용한다.
- 사용자는 회원등록 비용을 결제하면 기간제회원으로 등록된다.
- 사용자는 회원 등록 후 입차와 출차를 자유롭게 할 수 있다.
```
<br>

#### [관리자]  
```java
- 관리자 계정 아이디는 Admin이며, 비밀번호는 1q2w3e4r이다.
- 관리자는 관리자 계정으로 로그인한다.
- 관리자는 매출조회 메뉴를 선택할 수 있다.
- 관리자는 일별 누적 매출을 확인할 수 있다.
- 관리자는 회원 관리 시스템 메뉴를 선택할 수 있다.
- 관리자는 회원목록을 조회 할 수 있다.
- 관리자는 회원추가와 회원삭제와 취소가 가능하다.
- 관리자는 기본요금과 추가요금의 가격을 등록할 수 있다.
- 관리자는 주차장의 수용 주차대수 안에서 원하는 대수를 선택할 수 있다.
- 관리자는 현재 주차되어있는 모든 차량을 조회 할 수 있다.
- 관리자는 차량번호 입력 후 해당 차량의 입출차 기록 및 결제 금액 및 차량 사진을 확인 할 수 있다. 
   메모를 등록할 수 있다.
- 관리자는 출차할 차량을 직접 결제처리할 수 있다.

```
<br>

#### [시스템]  
```java
- 시스템은 사용자가 회원인지 비회원인지 구별한다
- 시스템은 입출차 시간을 바탕으로  이용료를 산정한다. 
- 시스템은 결제 후 영수증을 출력한다.
- 시스템은 입출차 유효성을 판단한다.
- 시스템은 차량번호, 입출차시간, 결제시간, 결제금액, 회원정보를 파일로 보관한다.
```

### 📌 내일 할 것
- [ ] 클래스다이어그램
- [ ] 코드 큰 틀 작성
<br>

### 💭 느낀점
#### 교수님이 내주신 시나리오에 맞는 코드를 구현하는 것만 해보다가 직접 구체적인 시나리오를 작성해보니 어쩌면 코드 구현보다 시나리오 설계가 더 어려울지도 모르겠다고 생각했다. 하지만 구체적이고 탄탄한 시나리오가 존재해야 코드도 구현할 수 있기에 여러 경우의 수를 생각하여 설계해보고자 함께 노력했다. 추후에 코드를 구현하면서 시나리오를 변경하는 일이 불가피할 것 같은데, 꼼꼼히 이유와 변경 사항을 기록해야할 것 같다.

<br>
<br>

## 22.09.20 📅
-----------------------------

### To-Do List📝
- [x] 클래스다이어그램 작성
- [x] 코드 큰 틀 작성
<br>

### < 오전 🌞 >
### 1. 클래스다이어그램 작성
#### [초안]
![KakaoTalk_Photo_2022-09-21-00-59-24](https://user-images.githubusercontent.com/111114507/191307396-cb81e274-cc97-46fe-bc77-b492324e12fe.jpeg)
#### - 유스케이스 다이어그램에 따라 클래스를 User(사용자), Admin(관리자), ParkingManager(주차관리시스템)으로 분류해보았다.
<br>


### < 오후 🌝 >
### 2. 코드 큰 틀 작성
<details>
<summary>코드</summary>

#### [관리자]
```java
public class Admin {
    private String id;
    private String password;
    public Admin(String id, String password) {

        this.id = id;

        this.password = password;
    }
}
```
#### [Admin Service]
```java
public class AdminService {
    private Admin admin;
    private ParkingInfoRepository  
     /*매출 조회
     /*

    private void searchSale() {
        // 결제 금액, 결제 시간
        // 입력
    }

    /**
     * 회원 등록
     */
     
    private void addMember() {
        // 정기권을 사용하기 위해 회원가입
        // 입력, 차량번호, 휴대전화번호

        // 정기권 종류가 있으면 좋을 것 같다
        // TermTicket class 를 사용한다.

        // 결제 ???????
    }

    /**
     * 회원 삭제
     */
    private void removeMember() {
        // 자동차번호
    }

    /**
     * 요금 설정
     */
    private void setPrice() {
        /**
         * 정기권 금액 변경
         *
         * 기본이용료 변경
         */
    }

    /**
     * 주차 차량 수 변경
     */
    private void changeCapacity() {
    }

    /**
     * 특정 차량 입출차 내역 조회
     * 차량번호로 조회하기
     */
    private void searchCarNumber() {
        // 차량 번호를 받아서 차량 입출차 기록 조회
    }

    void run() {

        // 관리자 인증

        int input = 0;
        while (true) {
            switch (input) {
                case 1:
                    this.searchSale();
                    break;
                case 2:
                    this.addMember();
                    break;
                case 3:
                    this.removeMember();
                    break;
                case 4:
                    this.setPrice();
                    break;
                case 5:
                    this.changeCapacity();
                    break;
                case 6:
                    this.searchCarNumber();
                    break;
                case 7: // 정기권 사용자 목록 보기
                    break;
            }
        }
    }

    /**
     * 관리자 인증 기능
     */
}    
```
<br>

#### [Client Main]
```java
public class ClientMain {
    public static void main(String[] args) {
        // 차량 제한 입력 받기
        ParkingManagerService pm = new ParkingManagerService(100);
        pm.run();
    }
}
```
<br>

#### [ParkingInfoRepository]
```java
public class ParkingInfoRepository {
}
```
<br>

#### [Parking Manager Service]
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ParkingManagerService {

    private BufferedReader br;
    private int limitCount;
    private paymentService paymentService;
    private HashMap<String, ParkingInfo> map;
    private int carTotalNumber;
    private TicketUserRepository ticketUserRepository;
    // 맵이나 어레이리스트로 차량 관리 iv;
    //private HashMap<String, > manager;
    // 유틸 클래스 iv

    public ParkingManagerService(int limitCount) {
        this.limitCount = limitCount;
        this.carTotalNumber = 0;
        map = new HashMap<>();
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * 입차
     */
    private void in() {
        // 차량번호 입력 (데이터 검증 필요!
        //          => 유효한 차 번호)

        // 입차시간 구하기 (utils 사용)

        // 회원/비회원 구분 (IO를 통해 찾아보기)

        // 회원일 경우 => 정기권 남은 기간 보여주기
        // 비회원일 경우 => 입차시간 보여주기
    }

    /**
     * 사전 결제하기
     */
//    private void makePrePayment() {
//    }

    /**
     * 출차 하기
     * 어려울 것 같다.
     */
    private void out() {

        // 차번호 입력
        ParkingInfo parkingInfo = map.get("1234");

        // 회원 유무 파악

        // 사전 결제 유무 파악
        // 시간 초과 파악
        // 초과 시, 초과금 (유예시간을 둠)

        // 사전 결제를 하지 않은 경우

        // 결제 기능 (차량 할인 판단)
        paymentService.calculateOutPrice(parkingInfo);
    }

    /**
     * 정기권 구매
     */
    private void signIn() {
        // 정기권을 사용하기 위해 회원가입

        // 입력, 차량번호, 휴대전화번호

        // 정기권 종류가 있으면 좋을 것 같다
        // TermTicket class 를 사용한다.

        // 정기권 결제
        paymentService.payTermTicket();
    }

    private int choiceCommandNumber() {
        /**
         * 숫자만 입력받을 수 있게함
         */
        int inputValue = 0;
        boolean isRight = true;
        while (!isRight) {
            try {
                inputValue = Integer.parseInt(this.br.readLine());
            } catch (Exception e) {
                isRight = false;
                System.out.println("숫자를 입력해주세요~!");
            }
        }
        return inputValue;
    }

    public void run() {
        int input = 0;
        while (true) {
            input = choiceCommandNumber();
            switch (input) {
                case 1: // 입차
                    this.in();
                    break;
                case 2: // 사전 결제
                    break;
                case 3: // 출차
                    break;
                case 4: // 회원가입
                    break;
                case 5: // 관리자, 일단ㅋ run();
                    break;
                case 6: // 종료
                    break;
            }
        }
    }
}
```
<br>

#### [payment Service]
```java
public class paymentService {

    /**
     * 싱글톤 사용
     */
    private ParkingInfoRepository parkingInfoRepository;
    private TicketUserRepository ticketUserRepository;
    private TicketSalesRepository ticketSalesRepository;

    /**
     *
     */
    public void calculateOutPrice(ParkingInfo parkingInfo) {
        // 시간계산
        // 출차시간 - 입차시간 (utils 필요)
        //parkingInfoRepository 사용
    }

    /**
     * 정기권 결제
     */
    public void payTermTicket() {
        // 차량번호 입력
        // 일단 정보를 주고
    }
}
```
<br>

#### [Sale]
```java
public class Sale {
    private int price;
    private String time;
}
```
<br>

#### [Term Ticket]
```java
public class TermTicket {
    private int id; // 기간권 고유번호
    private String carNumber; // 차번호
    private String phoneNumber; // 전화번호
    private String startTime; // 시작 시간 (결제시간)
    private int termType; // 기간권 종류 (2주 4주 ....)
//    private boolean expired; // true, false
}
```
<br>

#### [Ticket Sale Info]
```java
/**
 * 회원권 판매할 때 사용, 매출
 */
public class TicketSalesInfo {
    private String carNumber;
    private String phoneNumber;
    private String startTime;
    private String endTime;
    private int price;
    private String paymentTime;
}
```
<br>

#### [Ticket Sales Repository]
```java
public class TicketSalesRepository {
}
```
<br>

#### [TicketUser]

```java
 */
 * 같은 폰번호로 여러 차량에 대한 정기권 구매
 */
/**
 * 종료 날짜만 덮어쓰기
 * 회원권 구매시 신규 혹은 연장 판단
 * 입차 시, 회원/비회원 구분 (IO를 통해 찾아보기)
 * 회원 목록 조회
 */

public class TicketUser {
    private String carNumber; // 유일무이
    private String phoneNumber;
    private String lastEndTime;
}
```
<br>

#### [Ticket User Repository]
```java
public class TicketUserRepository {
}
```
</details>

<br>

<br>

### 3. 클래스다이어그램 수정
#### [수정 필요 인지]
![KakaoTalk_Photo_2022-09-21-01-08-14](https://user-images.githubusercontent.com/111114507/191309451-c9ed8983-d95f-482c-84ed-6f2442f0a957.jpeg)
#### -> 어제 작성한 클래스다이어그램을 그대로 코드에 구현하려다 보니 클래스를 세분화하는게 좋겠다고 판단하게 되어 관련 회의 진행
<br>

#### [수정본]
![KakaoTalk_Photo_2022-09-21-01-07-19](https://user-images.githubusercontent.com/111114507/191309268-f8c1c05c-ab5d-4bc4-91c6-a4fb036b808b.jpeg)

<br>

### 📌 내일 할 것
- [ ] 코드 큰 틀 작성한 것 재확인
- [ ] 코드 역할 분담하여 작성
<br>

### 💭 느낀점
#### - 시나리오를 나름 구체적으로 구상했다고 생각했지만 클래스다이어그램으로 그리려니 다시 생각해야하는 부분들도 존재했고 클래스간의 관계도를 생각해내는 것 또한 쉽지 않았다.내일 코드를 직접 작성하고 맞추다보면 클래스다이어그램의 수정도 불가피할 것 같다.
<br>
<br>


## 22.09.21 📅
-----------------------------

### To-Do List📝
- [ ] 코드 큰 틀 작성한 것 재확인
- [ ] 코드 역할 분담하여 작성
- [ ] 클래스다이어그램 수정
<br>

### < 오전 🌞 >

#### [ 회의 ]
1. 클래스명 번경
2. 관리자 접근을 parkingManager에서 분리할 지(사용자 메뉴 따로 run, 관리자 접근 따로 run) => 각각을 추상 or 인터페이스로..?
3. util에서 simpleDataFormat 사용, 나중에 합치기 - 형식만 우선 통일해두자(초까지!)
4. 요금 & 회차 default 값 정하기
    -> 시연을 위해서 1분을 1초로 변경해야할 듯
5. 2인 1조로 
6. 마지막에 코드 작성한걸 기반으로 클래스다이어그램 수정!

<br>

### 1. 역할 분담
#### < Parking Info & Admin >
[손정원 👩]
[김종민 👨]
<br>

#### < Payment & TicketUser >
[이영남 👨]
[심승복 👨]
<br>

#### < TicketSales & ParkingManager >
[고윤섭 👨]
[김찬수 👨]
<br>

### < 오후 🌝 >
#### 💭 나의 수행내용 1 : ParkingInfoRepository에서 파일을 save 하고 load 하는 기능을 구현함

<details>
<summary>코드</summary>

```java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.HashMap;

public class ParkingInfoRepository {
    String filename = "ParkingInfo.txt";

    //String - 차량번호
    static HashMap<String, ParkingInfo> map = new HashMap<String, ParkingInfo>();

    //파일 생성
    public void save() {
      File file = new File("ParkingInfo.txt");

      try {
         FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
            BufferedOutputStream bos = new BufferedOutputStream(oos);
         oos.writeObject(map); // map 안에는 (1,new ParkingInfo) (2,new ParkingInfo) (3, ParkingInfo)

         oos.close();
         fos.close();
            bos.close();

      } catch (Exception e) {
         System.out.println("파일을 생성하는 도중 에러가 발생했습니다.");
         e.printStackTrace();
      }
      System.out.println("'ParkingInfo'파일이 저장되었습니다.");
   }

    //파일에서 정보 불러오기 load 하기
    public void load (String carNumber) {
        File file = new File("ParkingInfo.txt");

      try {
         FileInputStream fos = new FileInputStream(file);
         ObjectInputStream oos = new ObjectInputStream(fos);
            BufferedInputStream bos = new BufferedInputStream(oos);

            map = (HashMap) bos.readObject();

            ParkingInfo pi = map.get(carNumber);

            oos.close();
         fis.close();
            bos.close();

        } catch (Exception e) {
            System.out.println("파일을 불러오는데 실패하였습니다.");
            e.printStackTrace();
        }

        return pi;
    }

}
```
</details>


#### 💭 나의 수행내용 2 : Admin Service 메소드 작성
<details>
<summary>코드</summary>

```java

```





