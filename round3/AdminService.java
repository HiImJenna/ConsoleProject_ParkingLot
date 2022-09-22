import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AdminService {

    Sale sale = new Sale();
    Admin admin = new Admin("admin", "1q2w3e4r");
    ParkingInfoRepository pir = new ParkingInfoRepository();
    TicketSalesRepository tsr = new TicketSalesRepository();
    TicketUserRepository tur = new TicketUserRepository();
    private DefaultInfo defaultInfo; 

    Calendar cal = Calendar.getInstance();    
    SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");

    Scanner sc = new Scanner(System.in);


// ************************************************************************************************************************************

public String[] sendStartDay() { //매출조회를 위해 날짜 전송 함수
    // 입력
    System.out.println("매출 조회할 기간을 숫자만 입력하세요. ex) 7 ");
    int days = Integer.parseInt(sc.nextLine()); 



    String now = time.format(cal.getTime());            //현재
    String startday = cal.add(Calendar.date, - (days));  //매출조회할 기준일 
    
    return new String[]{startday, now};
}

public void searchSale(){    // 날짜 전송 후 받아온 자료값을 파라미터에 입력
    
    String[] result = sendStartDay(); //startday, now 값 

    ArrayList<ParkingInfo> list1 = pir.findParkingSalesList(result); //startday 이후 입출차 매출 총배열 
    ArrayList<TicketSalesInfo> list2 = tsr.findTicketSalesList(result); // startday 이후 회원권 매출 총배열

    int i = 0;
    int inoutSale = 0;
    int memberSale = 0;

    //for문 돌려서 list1, list2 각각 합계 구해서 총합 계산.
    for(i = 0 ; i < list1.size() ; i++){    // 입출차 매출 총배열 합계
        inoutSale += list1.get(i).getPrice();               
    }
    for(i = 0 ; i < list2.size() ; i++){    // 회원권 매출 총배열 합계
        memberSale += list2.get(i).getPrice();
    }
    int saleList = inoutSale + memberSale;          // 입출차 매출 + 회원권 매출 총합계

    //출력부
    System.out.println(result[0] + " ~ " + result[1] + " 기간의 매출을 조회합니다.");
    System.out.println("입출차 매출건수 : " + list1.size() + " 회원권 매출건수 : " + list2.size());
    System.out.println("입출차 매출액 : " + inoutSale + " 회원권 매출액 : " + memberSale);
    System.out.println(saleList);       // 매출 합계 출력
}

// ************************************************************************************************************************************


    private void manageMember(){ //회원목록은 ticketuserrepository에서 가져오기 //등록-ticketsale(구매) , 삭제 - remove ... 
        System.out.println("[1] 회원등록 [2] 회원삭제 [3] 회원목록조회");
        int showMemberChoice = Integer.parseInt(sc.nextLine());

        if(showMemberChoice == 1) {
            System.out.println("< 회원등록 메뉴 >");
            System.out.println("등록한 회원의 차량 번호를 입력하세요.");
            //String pattern = "([가-힣]{2})?\\s?(\\d{1,3})\\s?([가-힣])\\s?(\\d{4})"; //숫자만
            String CarNumber = sc.nextLine(); //대상문자열
            boolean CarNumber_check = Pattern.matches("([가-힣]{2})?\\s?(\\d{1,3})\\s?([가-힣])\\s?(\\d{4})",CarNumber);

            while(true) {
                if(CarNumber_check != false) {//유효한 차량번호일 경우
                    // 정기권 선택
                    System.out.println("결제할 정기권을 선택하세요.");
                    System.out.println("[1] 일권 : 10,000원 [2] 30일권 : 100,000원");
                    int pickTermType =  Integer.parseInt(sc.nextLine());

                    if(pickTermType == 1) {
                        //일권구매 데이터 저장 -> ticketSalesRepository 으로
                        //결제
                        System.out.printf("%s님의 1일권 구매가 완료되었습니다.");

                    } else if(pickTermType == 2) {
                        //30일권 구매 데이터 저장 -> ticketSalesRepository 으로
                        //결제
                        System.out.printf("%s님의 30일권 구매가 완료되었습니다.");

                    } else {
                        System.out.println("올바른 메뉴를 선택하세요.");
                        break; //메뉴선택으로 돌아감
                    }

                } else if(CarNumber_check = false) { //유효하지 않은 차량번호일 경우
                    System.out.println("유효하지 않은 차량번호입니다. 다시 입력하세요.");
                    break;
                }
            }
        }
    }


    // ************************************************************************************************************************************


    private void setPrice() { //관리자 요금 설정

        while(true) {
            System.out.println("< 요금 변경 메뉴 >");
            System.out.println("변경하실 요금 유형을 선택하세요");
            System.out.println("[1] 기본시간 [2] 기본요금 [3] 추가시간 [4] 추가요금");
            int changeDefault = Integer.parseInt(sc.nextLine());

            if(changeDefault == 1)  {
                //기본요금 시간&요금 변경
               System.out.printf("기본 시간을 재설정하세요. (현재 기본 시간 : %d)", defaultInfo.getTime());
               String newTime = sc.nextLine();
               defaultInfo.setTime(newTime);
               System.out.printf("기본 시간이 %s로 재설정 되었습니다.", newTime);

            } else if (changeDefault == 2){
                System.out.printf("기본 요금을 재설정하세요. (현재 기본 요금 : %d)", defaultInfo.getPrice());
                int newPrice = Integer.parseInt(sc.nextLine());
                defaultInfo.setPrice(newPrice);
                System.out.printf("기본 요금이 %d로 재설정 되었습니다.", newPrice);

                //추가요금 시간 & 요금 변경
            } else if (changeDefault == 3){
                System.out.printf("추가 시간을 재설정하세요. (현재 추가 시간 : %s)", defaultInfo.getExtraTime());
                String newTime2 = sc.nextLine();
                defaultInfo.setExtraTime(newTime2);
                System.out.printf("추가 시간이 %s로 재설정 되었습니다.", newTime2);

            } else if (changeDefault == 4) {
                System.out.printf("추가 요금을 재설정하세요. (현재 추가 요금 : %d)", defaultInfo.getExtraPrice());
                int newPrice2 = Integer.parseInt(sc.nextLine());
                defaultInfo.setExtraPrice(newPrice2);
                System.out.printf("추가 요금이 %d로 재설정 되었습니다.", newPrice2);

            } else { //번호 잘못 입력했을때 다시 입력창으로 가기 
                System.out.println("올바른 메뉴를 선택하세요.");
                break; 
            }
        }
    }


 // ************************************************************************************************************************************


    private void changeCapacity() { //관리자 주차대수 설정
        System.out.println("< 주차 대수 변경 메뉴 >");
        System.out.println("현재 주차 가능 대수 : " + defaultInfo.getTotalCarCapacity()); 
        System.out.println("변경하실 주차 대수를 입력하세요");

        int newCapacity = Integer.parseInt(sc.nextLine());
        defaultInfo.setTotalCarCapacity(newCapacity);
        System.out.printf("주차대수가 %d로 변경되었습니다.");

    }


    // ************************************************************************************************************************************


    private void searchCarNumber() {
        System.out.println("< 차량조회 메뉴 >");
        System.out.println("검색하실 차량번호를 입력하세요.");
        String CarNumber = sc.nextLine(); //대상문자열
        boolean CarNumber_check = Pattern.matches("([가-힣]{2})?\\s?(\\d{1,3})\\s?([가-힣])\\s?(\\d{4})",CarNumber);

        while(true){
            if(CarNumber_check != false) { //유효한 차량번호라면
                //데이터 가져오기
                System.out.println("차량번호 조회중 ... ");
            } else if(CarNumber_check = false) { //유효하지 않은 차량번호라면
                System.out.println("올바르지 않은 형식의 차량번호입니다. 다시 입력하세요.");
                break;
            }
        }
    }


    // ************************************************************************************************************************************

    
    public void runAdminService(DefaultInfo defaultInfo) {
        this.defaultInfo = defaultInfo;
        
        // 관리자 인증
        while(true) {
            System.out.println("관리자모드에 접속하기 위해 아이디와 비밀번호를 입력하세요.");

            String adminID = sc.nextLine();
            String adminPw = sc.nextLine();

            if(adminID.equals("admin") && adminPw.equals("1q2w3e4r")){
            
                int input = 0;

                while (true) {
                    System.out.println("< 관리자 메뉴 >");
                    System.out.println("[1] 매출조회 [2] 회원관리 [3] 요금변경 [4] 주차대수변경 [5] 차량번호조회");

                    switch (input) {

                        case 1: 
                            this.searchSale();
                            System.out.println("(매출조회)");
                            break;
                            
                        case 2: 
                            this.manageMember();
                            System.out.println("(회원목록)");
                            break;
                            
                        case 3: this.setPrice();
                            System.out.println("(요금변경)");
                            break;

                        case 4:
                            this.changeCapacity();
                            System.out.println("(주차대수변경)");
                            break;

                        case  5:
                            this.searchCarNumber();
                            System.out.println("(차량조회)");
                            break;

                        default : System.out.println("올바른 메뉴를 선택하세요.");
                    } 
                }
            } else {
                    System.out.println("잘못된 아이디 / 비밀번호입니다.");
                    break;
            }
        }
    }
}