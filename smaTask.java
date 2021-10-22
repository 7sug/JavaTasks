import java.util.ArrayList;
import java.util.List;

public class sma {
    public static void smaWorker(){
        List<Integer> sma = new ArrayList<Integer>();
        int[] data = {2, 5, 7, 8, 3, 0, 10, 11, 15};
        int arrayLen = data.length;
        int sum = 0;
        int count = 0;
        int count2 = 3;
        for (int i = 3; i < arrayLen; i++) {
            for (int j = count; j < count2; j++)
                sum += data[j];
            count += 1;
            count2 += 1;
            int mid = sum / 3;
            sum = 0;
            sma.add(mid);


        }
        System.out.println(sma);
    }
    public static void main(String args[]) {
        smaWorker();
    }

}
