public class BmiService {
    public float calculate(float mass, float height) {
        float result = mass / ((height / 100) * (height / 100));
        return result;
    }
}
