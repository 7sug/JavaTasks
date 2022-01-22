import java.util.Collections;

public class MFilterr extends MainFilter {
    @Override
    public void calc(){
        for(int i = window; i<=size; i++) {
            for (int j = FirstCountingElement; j < SecondCountingElement; j++) {
                SecondMedList.add(data.get(j));
                Collections.sort(SecondMedList);
            }
            if (window % 2 == 1) {
                supportValue1 = (int) Math.ceil(window / 2);
                value = SecondMedList.get(supportValue1);
            }
            if (window % 2 == 0) {
                supportValue1 = (int) Math.ceil(window / 2) - 1;
                supportValue2 = (int) Math.ceil((window / 2) + 1) - 1;
                sum = SecondMedList.get(supportValue1) + SecondMedList.get(supportValue2);
                value = sum / 2;
            }
            medfilter.add(value);
            sum = 0;
            count1 += 1;
            count2 += 1;
            SecondMedList.clear();
        }
        System.out.println(medfilter);
    }
}
