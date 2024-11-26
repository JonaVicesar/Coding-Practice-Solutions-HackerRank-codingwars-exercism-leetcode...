/*In this exercise you're going to write some code to help you cook a brilliant lasagna 
 * from your favorite cooking book.
 *You have four tasks, all related to the time spent cooking the lasagna.
 * define the 'expectedMinutesInOven()' method
 * define the 'remainingMinutesInOven()' method
 * define the 'preparationTimeInMinutes()' method
 * define the 'totalTimeInMinutes()' method
 */
package exercism;

public class Lasagna {
	public int expectedMinutesInOven(){
        int expectedTime = 40;
        return expectedTime;
	}
	
	public int remainingMinutesInOven(int actualTime){
        int remaining =  expectedMinutesInOven() - actualTime;
        return remaining;
    }
	
	public int preparationTimeInMinutes(int layers){
        final int spentTime = 2;
        int totalTime = spentTime*(layers);
        return totalTime;
        
	}
	
	public int totalTimeInMinutes(int nLayers, int timeInOven ){
        int layersTime = this.preparationTimeInMinutes(nLayers);
        int totalSpentTime =  layersTime + timeInOven;
        return totalSpentTime;
    } 
	
	
	//////////////////////////////////////////////////////////////////////
	public static void main(String [] args) {
		Lasagna today = new Lasagna();
		System.out.print(today.preparationTimeInMinutes(6));
	}
}
