package flyweight;

import java.util.HashMap;

public class PhoneCaseFactory {
    private static HashMap samsungCaseMap = new HashMap();

    public static PhoneCase getSamsungCase(String caseColor) {
        SamsungCase samsungCase = (SamsungCase) samsungCaseMap.get(caseColor);

        if (samsungCase == null) {
            samsungCase = new SamsungCase(caseColor);
            samsungCaseMap.put(caseColor, samsungCase);
        }
        return samsungCase;
    }
}
