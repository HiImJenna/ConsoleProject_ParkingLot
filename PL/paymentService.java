package kr.or.kosa;

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
