
package kata4;

public class Kata4 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
        
    }
    
}
