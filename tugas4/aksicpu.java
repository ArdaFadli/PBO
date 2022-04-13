package tugas4;

public class aksicpu {
    public static void main(String[] args) {
        cpu.Processor processor = new cpu.Processor();
        double cache = processor.Cache();
        System.out.println("Processor Cache = " + cache);

        cpu.RAM ram = new cpu.RAM();
        double clockSpeed = ram.ClockSpeed();
        System.out.println("Ram Clock speed = " + clockSpeed);
    }
}

