public class Main {
    public static void main(String[] args) {

        BMIService service = new BMIService();

        double BMI = service.calculate(80, 158);

        System.out.printf("%.1f", BMI);
    }
}
