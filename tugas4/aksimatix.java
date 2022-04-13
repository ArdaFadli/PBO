package tugas4;

public class aksimatix {
    public static void main(String[] args) {
        System.out.println("Matrix A");
        Matrix A = Matrix.random(3, 3);
        A.show();
    
        System.out.println("Matrix B");
        Matrix B = A.transpose();
        B.show();
    
        System.out.println("Matrix C");
        Matrix C = Matrix.identity(3);
        C.show();
    
        System.out.println("Penjumlahan matriks A dan B");
        Matrix plus = A.plus(B);
        plus.show();
    
        System.out.println("Perkalian matriks B dan A");
        Matrix times = B.times(A);
        times.show();
      }
    }
