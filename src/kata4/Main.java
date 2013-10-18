package kata4;


public class Main {

    
    public static void main(String[] args) {
        HistogramBuilder<String> builder = new HistogramBuilder();
        builder.calculate(new String [] {"a","a","b","d","b","a","a",});
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
