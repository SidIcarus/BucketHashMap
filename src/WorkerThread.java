import java.util.Random;
import java.util.Calendar;

public class WorkerThread extends Thread{
	
	private ConcurrentBucketHashMap<String, String> map;
	private int threadNum;
	
	public WorkerThread(ConcurrentBucketHashMap<String, String> map, int threadNum){
		this.map = map;
		this.threadNum = threadNum;
	}
	
	public void run(){
		boolean found = false;
		long sleepTime;
		Random rndGen = new Random(42);	// 42, answer to life
		sleepTime = rndGen.nextLong() % 130;	// random the staggering out
		
		Calendar calendar = Calendar.getInstance(); // every time this is called it needs to be set again to Calendar.getInstance();
		// We need to keep track of current time running, i'm not sure wether to use
		// Timer, or Calendar or something so i just chose calendar,
		//it may be a good idea to look at other possible ways to do it
		
		
		/*
		for (int var = 0, var < 2, var++){
			found = false
			int = 0 
			
			while it isnt found
				if found
				take out the key / value pair
				print that you are doing that
				found = true;
					
					
				try to set the thread to sleep
				print that you are doing that
				
				try to add it back in with the same key but different value
				print that you are doing that
				
				print what the current map size is
					
				else
					i++
		}
		
		sleep the thread for another random amount of time
		print that you are doing that
		
		when it wakes up print that is has woken up
		
		
		do the same as the for loop above (with differnet range in the for loop)
		but only adding in the key if it isn't in the map (no removing)
		remember to print out everytime you do some change
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.getTime().toString()+ " Thread " +threadNum+ " "
				+ "has ended with the Map at size: " +map.size());
		*/
	}
}
