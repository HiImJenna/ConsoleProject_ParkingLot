 import java.util.Scanner;
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

    public int searchSale() { //매출조회
        // 입력
        System.out.println("매출을 조회할 기간을 입력하세요. ex) 7 ");
        int days = Integer.parseInt(sc.nextLine());
       
        //손종-parkingrefo / 고김-     => 기간 분류 하면 searchSale에서 결제금액 합치기 = total 매출

        // 결제 금액, 결제 시간
        return days;
    }

    private void showMember(){ //회원목록은 ticketuserrepository에서 가져오기 //등록-ticketsale(구매) , 삭제 - remove ... 
        System.out.println("[1] 회원등록 [2] 회원삭제");
    }

    private void setPrice() { //관리자 요금 설정
       
         System.out.println("< 요금 변경 메뉴 >");
         System.out.println("변경하실 요금 유형을 선택하세요");
         System.out.println("[1] 기본시간 [2] 기본요금 [3] 추가시간 [4] 추가요금");
         int changeDefault = Integer.parseInt(sc.nextLine());

         if(changeDefault == 1)  {
            //기본요금 시간&요금 변경
            System.out.printf("기본 시간을 재설정하세요. (현재 기본 시간 : %d)", defaultInfo.getTime());
            String newTime = sc.nextLine();
            defaultInfo.setTime(newTime);

         } else if (changeDefault == 2){
            System.out.printf("기본 요금을 재설정하세요. (현재 기본 요금 : %d)", defaultInfo.getPrice());
            int newPrice = Integer.parseInt(sc.nextLine());
            defaultInfo.setPrice(newPrice);

            //추가요금 시간 & 요금 변경
         } else if (changeDefault == 3){
            System.out.printf("추가 시간을 재설정하세요. (현재 추가 시간 : %s)", defaultInfo.getExtraTime());
            String newTime2 = sc.nextLine();
            defaultInfo.setExtraTime(newTime2);

         } else if (changeDefault == 4) {
            System.out.printf("추가 요금을 재설정하세요. (현재 추가 요금 : %d)", defaultInfo.getExtraPrice());
            int newPrice2 = Integer.parseInt(sc.nextLine());
            defaultInfo.setExtraPrice(newPrice2);
         }
    }
            

    private void changeCapacity() { //관리자 주차대수 설정
        System.out.println("< 주차 대수 변경 메뉴 >");
        System.out.println("현재 주차 가능 대수 : " + defaultInfo.getTotalCarCapacity()); 
        System.out.println("변경하실 주차 대수를 입력하세요");

        int newCapacity = Integer.parseInt(sc.nextLine());
        defaultInfo.setTotalCarCapacity(newCapacity);

    }

    private void searchCarNumber() {
        System.out.println("차량조회");
        // 차량 번호를 받아서 차량 입출차 기록 조회
    }

    //private void 미정산차량 ->찬수님
    
    public void run(DefaultInfo defaultInfo) {
        this.defaultInfo = defaultInfo;
        // 관리자 인증

        int input = 0;
        while (true) {
            System.out.println("< 관리자 메뉴 >");
            System.out.println("[1] 매출조회 [2] 회원관리 [3] 요금변경 [4] 주차대수변경 [5] 차량번호조회 [6] 현재뭐시기");

            switch (input) {

                case 1: this.searchSale();
                    System.out.println("(매출조회)");
                    break;
                    
                case 2: this.showMember(); // 목록 뜨고 -> 추가 제거 선택 /뒤로가기 //회원목록은 ticketuserrepository에서 가져오기 //등록-ticketsale(구매) , 삭제 - remove ... 
                    System.out.println("(회원목록)");
                //****************************************************/
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

                case  6:
                System.out.println("(찬수님 입차만 한 차량 조회 ... )");
                //찬수님 입차만 한 차량 조회 ... 
                break;

                default : System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }

    public void run(int i, String string, int j, String string2, int k) {
    }

    /*
     * 관리자 인증 기능
     */
}