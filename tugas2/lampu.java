package tugas2;

class lampu {
    boolean nyala = false;
	
	public void nyalakanLampu() {
		nyala = true;
	}
	
	public void matikanLampu() {
		nyala = false;
	}

}

class AksiLampu{
	public static void main(String[] args) {
		lampu lampu = new lampu();
		
        lampu.matikanLampu();
		System.out.println("Apakah Lampu Menyala? " + lampu.nyala);
	
		lampu.nyalakanLampu();
		System.out.println("Apakah Lampu Menyala? " + lampu.nyala);
    }
}

