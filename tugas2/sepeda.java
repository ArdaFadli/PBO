package tugas2;

class sepeda {
    int gear = 5;
    //ATRIBUT
    sepeda(int jmlhRoda, String jenis, String merk){
        System.out.println("sepeda " + jenis + " merk " + merk + " punya roda " + jmlhRoda );
    }

    void rem() {
        System.out.println("sepeda direm");
        //method
    }
}

class AksiSpeda {
    public static void main(String[] args  ) {
        sepeda spedaBocil = new sepeda(2, "listrik","Bandit");
        sepeda spedaBapak = new sepeda(2, "genjot","Papoy");

        int gearSpeda = spedaBocil.gear;
        System.out.println("jumlah gear" + gearSpeda);
        spedaBocil.rem();

        int bapakGearSpeda = spedaBapak.gear;
        System.out.println("jumlah gear" + bapakGearSpeda);
        spedaBapak.rem();
    }
}

    
