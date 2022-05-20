public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 80;
        float height = 185;
        float bodyIndex = service.calculate(mass, height);
        System.out.println("Индекс Массы Тела: " + bodyIndex);
    }
}