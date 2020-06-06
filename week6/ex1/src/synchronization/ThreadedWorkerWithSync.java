package synchronization;

public class ThreadedWorkerWithSync extends Thread {
	
	private ResourcesExploiter rExp;
	
	public ThreadedWorkerWithSync(ResourcesExploiter resource) {
		rExp = resource;
	}

	public void run() {
		synchronized(rExp){
			for (int i = 0; i < 1000; i++) {
				rExp.exploit();
				System.out.println(Thread.currentThread().getName() + ", rsc = " + rExp.getRsc());
			}
		}
	}

}
