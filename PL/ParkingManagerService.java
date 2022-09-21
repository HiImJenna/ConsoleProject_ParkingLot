package round3;

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
    private DefaultInfo defaultInfo; 
    // 맵이나 어레이리스트로 차량 관리 iv;
    //private HashMap<String, > manager;
    // 유틸 클래스 iv

    public ParkingManagerService(int limitCount) {
        this.limitCount = limitCount;
        this.carTotalNumber = 0;
        map = new HashMap<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        defaultInfo = new DefaultInfo(10, "10", 10, "10,", 50);
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
