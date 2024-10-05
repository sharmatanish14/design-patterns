package templateMethod;

public class XMLDataRenderer extends DataRenderer {

    @Override
    public String readData() {
        return "XML data";
    }

    @Override
    public String processData() {
        return "Processed XML data";
    }
}
