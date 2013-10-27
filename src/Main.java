public class Main {

	public static void main(String[] args) {
		ConcurrentBucketHashMap bucketMap = new ConcurrentBucketHashMap(3);
		for(int i = 0; i < 50; i++) {
			bucketMap.put(i,i*42);
		}
		WorkerThread thread1 = new WorkerThread(bucketMap);
		WorkerThread thread2 = new WorkerThread(bucketMap);
		WorkerThread thread3 = new WorkerThread(bucketMap);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
