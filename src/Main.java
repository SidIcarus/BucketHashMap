public class Main {

	public static void main(String[] args) {
		ConcurrentBucketHashMap bucketMap = new ConcurrentBucketHashMap(3);
		for(int i = 0; i < 50; i++) {
			bucketMap.put(i,i*42);
		}
		WorkerThread thread1 = new WorkerThread(bucketMap, 1);
		WorkerThread thread2 = new WorkerThread(bucketMap, 2);
		WorkerThread thread3 = new WorkerThread(bucketMap, 3);
		System.out.println("Attempt to break the ConcurrentBucketHashMap started!");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
