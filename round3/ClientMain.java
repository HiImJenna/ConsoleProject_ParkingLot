package round3;

public class ClientMain {
    public static void main(String[] args) {
        // ���� ���� �Է� �ޱ�       
    	ParkingManagerService pm = new ParkingManagerService(100);
        pm.run();
    }
}
