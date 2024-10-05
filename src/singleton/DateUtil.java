package singleton;

import java.io.Serializable;

public class DateUtil implements Cloneable {

    private static DateUtil dateUtil;

    private DateUtil() {

    }
    public static DateUtil getInstance() {
        if (dateUtil == null) {
            dateUtil = new DateUtil();
        }

        return dateUtil;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
