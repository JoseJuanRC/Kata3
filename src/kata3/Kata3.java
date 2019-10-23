package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        for (String key : histogram.keySet()) {
            System.out.println(key+"");
        }
        HistogramDisplay histDis = new HistogramDisplay(histogram);
        histDis.execute();
    }
    
}
