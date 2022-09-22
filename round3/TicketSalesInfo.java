package round3;

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
    public int getPrice() {
        return price;
    }

}
