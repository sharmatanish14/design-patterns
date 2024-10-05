package templateMethod;

public class Test {

    public static void main(String[] args) {
            DataRenderer xmlRenderer=new XMLDataRenderer();
            DataRenderer csvRenderer=new CSVDataRenderer();

            xmlRenderer.renderer();
            csvRenderer.renderer();
    }
}

