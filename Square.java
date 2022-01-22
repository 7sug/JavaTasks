public class SquareRoot {
    public static double sqrtRoot(double root){

        if(root <0){
            return Double.NaN;
        }if (root > Double.MAX_VALUE){
            return Double.NaN;
        }



        double value;
        double result;
        value = 3;
        result = root;
        double nextResult = 0;
        while (result != nextResult){
            result = 0.5 * (value + root / value);
            value = result;
            nextResult = 0.5 * (value + root / value);
        }
        return result;
    }

}
