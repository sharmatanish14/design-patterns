package templateMethod;

public abstract class DataRenderer {
    public void renderer() {

        String data = readData();
        String processData = processData();

        System.out.println(data + "@@@ " + processData);
    }

    public abstract String readData();

    public abstract String processData();
}
