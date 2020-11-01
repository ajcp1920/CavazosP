package hilos;

public class TareaHilo {
	public static void main(String args[])
	{
		Proceso1 Hilos = new Proceso1();
		Thread hilo1= new Thread(Hilos);
		Thread hilo2 = new Thread(Hilos);
		Thread hilo3= new Thread(Hilos);
		Thread hilo4 = new Thread(Hilos);
		hilo1.setName("Hilo 1");
		hilo2.setName("Hilo 2");
		hilo3.setName("Hilo 3");
		hilo4.setName("Hilo 4");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		try {
			hilo1.join();
			hilo2.join();
			hilo3.join();
			hilo4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hilos terminados");
	}
}
