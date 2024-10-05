package singleton;

// this is eager initialization, either can initialize while declaring variable or inside static block
//eager initialization is used when you know this class will get used at leased once
//preferably lazy initialization is used

public class DateUtil2 {

    private static DateUtil2 dateUtil2;

    static {
        dateUtil2 = new DateUtil2();
    }

    private DateUtil2() {

    }

    public static DateUtil2 getInstance() {
        return dateUtil2;
    }
}
