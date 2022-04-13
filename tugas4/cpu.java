package tugas4;

public class cpu {
    double price;
    // nested class
    static class Processor{
        // members of nested class
        double cores;
        String manufacturer;
        double Cache(){
            return 4.3;
        }
    }
    // nested protected class
    static protected class RAM{
        // members of protected nested class
        double memory;
        String manufacturer;
        double ClockSpeed(){
            return 5.5;
        }
    }
}

