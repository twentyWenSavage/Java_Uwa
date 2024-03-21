public class TimeConversion {
    public static void main(String[] args) {
        int minutes = 3456789;
        int years = minutes / (60 * 24 * 365);
        int days = minutes % (60 * 24 * 365) / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days.");
        
    }
}
