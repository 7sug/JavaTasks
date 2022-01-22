public class Calculation {
    public static float calc(float[] data) {
        int length;
        length = data.length;
        float result = 0;
        for (int i = 0; i < length; i++) {
            float temp;
            temp = data[i];
            if(temp > 0){
                result = (1 / temp) * 3 + result;
            }
        }
        System.out.println(result);
        return result;
    }
}
