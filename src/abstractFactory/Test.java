package abstractFactory;

public class Test {

    public static void main(String[] args) {
        DaoFactoryProducer.produce("db").createDao("dept").save();
    }
}
