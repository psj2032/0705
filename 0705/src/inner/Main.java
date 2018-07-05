package inner;

public class Main {

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();
		obj.start();
		
		Thread th = new Thread() {
			public void run() {
				try {
					for(int i =10; i<20; i++){
						System.out.println(i);
						Thread.sleep(1000);
					}
				} catch (Exception e) {}
			}
		};
		th.start();
	}
}
