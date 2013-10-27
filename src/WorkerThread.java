public class WorkerThread extends Thread{
	
	private ConcurrentBucketHashMap map;
	private int threadNum;
	
	public WorkerThread(ConcurrentBucketHashMap map, int threadNum){
		this.map = map;
		this.threadNum = threadNum;
	}
	
	public void run(){
		
	}
}
