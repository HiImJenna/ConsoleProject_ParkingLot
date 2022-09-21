package kr.or.kosa;

public class ClientMain {
    public static void main(String[] args) {
        // 차량 제한 입력 받기       
    	ParkingManagerService pm = new ParkingManagerService(100);
        pm.run();
    }
}
