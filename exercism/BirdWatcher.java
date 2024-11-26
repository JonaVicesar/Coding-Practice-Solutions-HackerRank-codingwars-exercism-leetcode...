package exercism;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
    	return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
    	birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
    	boolean noBirds = false;
        for(int n : birdsPerDay) {
        	if(n == 0) {
        		noBirds = true;
        		break;
        	}
        	
        	
        }
        return noBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsInWeek = 0;
        if(numberOfDays > 0 && numberOfDays <8) {
        	for(int i = 0; i < numberOfDays; i++){
        		birdsInWeek += birdsPerDay[i];
        	}
    		
    	}
        return birdsInWeek;
    }
    
    public int getCountForFirstDaysv2(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }


    public int getBusyDays() {
    	int busyDays =0;
        for(int i : birdsPerDay) {
        	busyDays += (i >= 5)? 1 : 0;
        }
        return busyDays;
    }
}
