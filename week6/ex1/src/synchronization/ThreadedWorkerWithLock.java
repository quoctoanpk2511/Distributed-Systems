package synchronization;

public class ThreadedWorkerWithLock extends Thread {
	
	private ResourcesExploiterWithLock rExp;
	
	public ThreadedWorkerWithLock(ResourcesExploiterWithLock resource) {
		rExp = resource;
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			rExp.exploit();
			System.out.println(Thread.currentThread().getName() + ", rsc = " + rExp.getRsc());
		}
	}
}
