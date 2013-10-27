public class Main {

	/** 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentBucketHashMap<String, String> map = new ConcurrentBucketHashMap<String, String>(3);
		
		for(int i = 0; i < 50; i++)
			map.put("Key: " +i, "Value: " +i);

		System.out.println("Programing Starting\n");
		System.out.println("Initial map size: " +map.size());
		
		WorkerThread thread1 = new WorkerThread(map, 1);
		WorkerThread thread2 = new WorkerThread(map, 2);
		WorkerThread thread3 = new WorkerThread(map, 3);
		
		System.out.println("\tStarting Thread 1");
		thread1.start();
		
		System.out.println("\tStarting Thread 2");
		thread2.start();
		
		System.out.println("\tStarting Thread 3");
		thread3.start();
	}
}
