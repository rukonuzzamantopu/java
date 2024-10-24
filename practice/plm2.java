package practice;
public class plm2 {

    public static double calculateAverage(double... scores) {
        double sum = 0;
        for (double score : scores) sum += score;
        return scores.length > 0 ? sum / scores.length : 0;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(85.5, 90.0, 78.0));
        System.out.println(calculateAverage(100.0, 95.5));
        System.out.println(calculateAverage(50.0, 60.0, 70.0, 80.0, 90.0));
        System.out.println(calculateAverage());
    }
}
