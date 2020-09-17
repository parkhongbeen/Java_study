package practice1;

public class JavaThread2 {

	public static void main(String[] args) {
			
			Runnable todo = new Runnable() {
				@Override
				public void run() {
					for (int i=0; i<=5; i++) {
						System.out.println("두 번째 쓰레드: " + i);
	
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			};
			Thread thread = new Thread(todo);
			thread.start();
			
			for (int i=0; i<10; i++) {
				System.out.println("첫 번째 쓰레드: " + i);
	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
