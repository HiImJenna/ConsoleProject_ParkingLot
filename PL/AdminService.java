package round3;
import java.util.Scanner;
import javax.print.event.PrintEvent;

public class AdminService {

    Sale sale = new Sale();
    Admin admin = new Admin("admin", "123");
    ParkingInfoRepository pir = new ParkingInfoRepository();
    TicketSalesRepository tsr = new TicketSalesRepository();
    TicketUserRepository tur = new TicketUserRepository();
    private DefaultInfo defaultInfo; 

    Scanner sc = new Scanner(System.in);

    public AdminService() {
        this.admin = new Admin("admin", "123");
    }

    /**
     * 매출 조회
     */
    public int searchSale() {
        // 입력
        System.out.println("매출을 조회할 기간을 입력하세요. ex) 7 ");
        int days = Integer.parseInt(sc.nextLine());
       
        //손종-parkingrefo / 고김-     => 기간 분류 하면 searchSale에서 결제금액 합치기 = total 매출


        // 결제 금액, 결제 시간
        
        return days;

    }


    private void setPrice() { //관리자 요금 설정
       
         System.out.println("< 요금 변경 메뉴 >");
         System.out.println("변경하실 요금 유형을 선택하세요");
         System.out.println("[1] 기본시간 [2] 기본요금 [3] 추가시간 [4] 추가요금");
         int changeDefault = Integer.parseInt(sc.nextLine());

         if(changeDefault == 1)  {
            //기본요금 시간&요금 변경
            System.out.println("기본 요금의 시간을 재설정하세요");
            String newTime = sc.nextLine();
            defaultInfo.setTime(newTime);

         } else if (changeDefault == 2){
            System.out.println("기본 요금을 재설정하세요");
            int newPrice = Integer.parseInt(sc.nextLine());
            defaultInfo.setPrice(newPrice);

         } else if (changeDefault == 3){
            //추가요금 시간 & 요금 변경
            System.out.println("추가 시간을 재설정하세요");
            String newTime2 = sc.nextLine();
            defaultInfo.setExtraTime(newTime2);

         } else if (changeDefault == 4) {
            System.out.println("추가 요금을 재설정하세요");
            int newPrice2 = Integer.parseInt(sc.nextLine());
            defaultInfo.setExtraPrice(newPrice2);
         }
    }
            

    private void changeCapacity() { //관리자 주차대수 설정
        
        System.out.println("< 주차 대수 변경 메뉴 >");
        System.out.println("현재 주차 가능 대수 : " ); // ***************** getter 만들기!!!!!!!!!!!!!!!!!!!
        System.out.println("변경하실 주차 대수를 입력하세요");
        System.out.println("< 주차 가능 대수 변경 메뉴 >");
        System.out.println("현재값 : "  /* + 주차가능상태값 */);
        System.out.println("변경하실 주차 가능 대수를 입력하세요");
        int newCapacity = Integer.parseInt(sc.nextLine());
        defaultInfo.setTotalCarCapacity(newCapacity);

    }

    /**
     * 특정 차량 입출차 내역 조회
     * 차량번호로 조회하기
     */
    private void searchCarNumber() {
        // 차량 번호를 받아서 차량 입출차 기록 조회
    }
    
 /**
     * 회원 삭제
     */
    private void removeMember() {
        // 자동차번호
        // 자동차번호 key값으로 매칭시켜서 remove
    }
    void run(DefaultInfo defaultInfo) {
        this.defaultInfo = defaultInfo;
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

    /*
     * 관리자 인증 기능
     */
}