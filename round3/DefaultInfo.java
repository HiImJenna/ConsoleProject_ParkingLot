

public class DefaultInfo {
    //기본요금
    private int Price = 1000; //1천원
    private String time = "30"; //분

    //추가요금
    private int extraPrice = 500; //500원
    private String extraTime = "10"; //분

    //정기권 - 일권
    private int dailyTicketPrice = 10000; //1만원
    private String dailyTickeTerm = "1";//일

    //정기권 - 30일권
    private int monthlyTicketPrice = 100000; //10만원
    private String monthlyTicketTerm = "30";//일

    //주차가능대수
    private int totalCarCapacity;

    public DefaultInfo(int price, String time, int extraPrice, String extraTime, int totalCarCapacity) {
        Price = price;
        this.time = time;
        this.extraPrice = extraPrice;
        this.extraTime = extraTime;
        this.totalCarCapacity = totalCarCapacity;
    }
    
    public int getPrice() {
        return Price;
    }

    public String getTime() {
        return time;
    }

    public int getExtraPrice() {
        return extraPrice;
    }

    public String getExtraTime() {
        return extraTime;
    }

    public int getTotalCarCapacity() {
        return totalCarCapacity;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setExtraPrice(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public void setExtraTime(String extraTime) {
        this.extraTime = extraTime;
    }

    public void setTotalCarCapacity(int totalCarCapacity) {
        this.totalCarCapacity = totalCarCapacity;
    }
}