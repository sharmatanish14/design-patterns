package templateMethod;

public class CSVDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "CSV data";
    }

    @Override
    public String processData() {
        return "Processed CSV data";
    }
}
