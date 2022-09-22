package round3;

public class Sale {
    //기본요금
    private int defaultPrice = 1000;//원
    private int defaultTime = 30;//분

    //추가요금
    private int extratPrice = 500;//원
    private int extraTime = 10;//분

    //정기권요금
    private int termPrice = 5000;//유형은 하나라고 우선 .
    private int termTime = 10000; //임시
    
    public int getDefaultPrice() {
        return defaultPrice;
    }
    public void setDefaultPrice(int defaultPrice) {
        this.defaultPrice = defaultPrice;
    }
    public int getDefaultTime() {
        return defaultTime;
    }
    public void setDefaultTime(int defaultTime) {
        this.defaultTime = defaultTime;
    }
    public int getExtratPrice() {
        return extratPrice;
    }
    public void setExtratPrice(int extratPrice) {
        this.extratPrice = extratPrice;
    }
    public int getExtraTime() {
        return extraTime;
    }
    public void setExtraTime(int extraTime) {
        this.extraTime = extraTime;
    }
    public int getTermPrice() {
        return termPrice;
    }
    public void setTermPrice(int termPrice) {
        this.termPrice = termPrice;
    }
    public int getTermTime() {
        return termTime;
    }
    public void setTermTime(int termTime) {
        this.termTime = termTime;
    }
}