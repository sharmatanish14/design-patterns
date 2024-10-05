package singleton;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();


        System.out.println(dateUtil1 == dateUtil2);     // true

        FileOutputStream fileOutputStream = new FileOutputStream("sample1.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(dateUtil1);

        FileOutputStream fileOutputStream2 = new FileOutputStream("sample2.ser");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);

        objectOutputStream.writeObject(dateUtil2);

        FileInputStream fileInputStream1 = new FileInputStream("sample1.ser");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        DateUtil deserialisedObject1 = (DateUtil) objectInputStream1.readObject();

        FileInputStream fileInputStream2 = new FileInputStream("sample1.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        DateUtil deserialisedObject2 = (DateUtil) objectInputStream2.readObject();

        System.out.println(deserialisedObject1 == deserialisedObject2);  // false
    }
}
