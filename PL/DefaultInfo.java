public class DefaultInfo {
    private int Price;
    private String time;
    private int extraPrice;
    private String extraTime;
    private int totalCarCapacity;

    public DefaultInfo(int price, String time, int extraPrice, String extraTime, int totalCarCapacity) {
        Price = price;
        this.time = time;
        this.extraPrice = extraPrice;
        this.extraTime = extraTime;
        this.totalCarCapacity = totalCarCapacity;
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