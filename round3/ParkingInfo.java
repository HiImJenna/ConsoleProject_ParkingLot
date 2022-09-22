

/**
 * 입출차 기록 데이터, 영수증, 매출 조회
 */
public class ParkingInfo {
    private String carNumber;
    private String inTime; // 입차시간
    private String outTime; // 완전 나가는 시간
    private Integer price; // 결제시간 - 입차시간 금액 계산
    private String paymentTime; // 결제 시간
    private String memo;

    

    public ParkingInfo(String carNumber, String inTime, String outTime, Integer price, String paymentTime, String memo) {
        this.carNumber = carNumber;
        this.inTime = inTime;
        this.outTime = outTime;
        this.price = price;
        this.paymentTime = paymentTime;
        this.memo = memo;
    }


    // 종민님이 추가하심
    public String toString() {
        return "/n" + carNumber + " " + inTime + " " + outTime + " " + price + " " + paymentTime + " " + memo + " "; 
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }


    public Integer getPrice() {
        return price;
    }
}

