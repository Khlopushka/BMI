public class BMIService {
    public double calculate(int weight, int height) {

        double heightInMeters = height / 100.0;
        double BMI = weight / (heightInMeters * heightInMeters);

        System.out.println("Ваш индекс массы тела равен: ");

        return BMI;
    }
}
