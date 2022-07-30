package waitsleep;
public class Wait {
	class HelloWorld {
}
	private static Object LOCK = new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);   
		System.out.println("Thread '" + Thread.currentThread().getName() + "' started after sleeping for 1 second");
		synchronized (LOCK)
		{
			LOCK.wait(1000);
			System.out.println("Object is started after waiting for 1 second");
			}
		}
	}
