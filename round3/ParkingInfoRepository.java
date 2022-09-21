
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import javax.xml.namespace.QName;

public class ParkingInfoRepository {

    String filename = "ParkingInfo.txt";

    //String - 차량번호
    static HashMap<String, ParkingInfo> map = new HashMap<String, ParkingInfo>();

    //파일 생성
    public void save() {
      File file = new File("ParkingInfo.txt");

      try {
         FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
            BufferedOutputStream bos = new BufferedOutputStream(oos);
         oos.writeObject(map); // map 안에는 (1,new ParkingInfo) (2,new ParkingInfo) (3, ParkingInfo)

         oos.close();
         fos.close();
            bos.close();

      } catch (Exception e) {
         System.out.println("파일을 생성하는 도중 에러가 발생했습니다.");
         e.printStackTrace();
      }
      System.out.println("'ParkingInfo'파일이 저장되었습니다.");
   }

    //파일에서 정보 불러오기 load 하기)
    public void load (String carNumber) {
        File file = new File("ParkingInfo.txt");

      try {
         FileInputStream fos = new FileInputStream(file);
         ObjectInputStream oos = new ObjectInputStream(fos);
         BufferedInputStream bos = new BufferedInputStream(oos);

         map = (HashMap) bos.readObject();

         ParkingInfo pi = map.get(carNumber);

         oos.close();
         fos.close();
         bos.close();

        } catch (Exception e) {
            System.out.println("파일을 불러오는데 실패하였습니다.");
            e.printStackTrace();
        }
    }
}
