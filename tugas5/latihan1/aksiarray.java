package tugas5.latihan1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Body {
    int[] data;

    void Array(int[] data){
        this.data = data;
    }

    void MakeArray() {
        String print = IntStream.of(data)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(","));
        System.out.println("Data = " + print);

    }

    void TotalArray() {
        int sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }
        System.out.println("Jumlah = " + sum);
    }

}                         

public class aksiarray {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data: ");
        int total = data.nextInt();
        int[] array = new int[total];
        for (int i = 0; i < total; i++) {
            System.out.print("Masukkan Angka ke-"+(i+1)+": ");
            array[i] = data.nextInt();
        }
        data.close();
        Body prototype = new Body();
        prototype.Array(array);
        prototype.MakeArray();
        prototype.TotalArray();
    }
}
