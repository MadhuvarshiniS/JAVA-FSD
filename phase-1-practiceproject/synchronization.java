package synchronization;
public class synchronization {
	int count;
		public synchronized void increment(){
			count++;
		}
		public static void main(String[] args) {
			synchronization c = new synchronization();
			Thread t1 = new Thread(new Runnable() {
				public void run(){
					for(int i=1;i<=2000;i++){
						c.increment();
					}
				}
				});
			Thread t2 = new Thread(new Runnable() {
				public void run(){
					for(int i=1;i<=2000;i++){
						c.increment();
					}
				}
				});
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("count " + c.count);
		}
}
