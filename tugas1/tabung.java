public class tabung {
    public static void main(String[] args) {
        double phi = 3.14, diameter = 5, length = 10;
        double radius = 0.5 * diameter;
        double volume = phi * Math.pow(radius, 2) * length;

        System.out.println("Result: " + String.format("%.2f", volume));
    }
}
