class tasksheet120{
	
	public static void main(String[] args){
		
		CumulativeSumCalculator calc1 = new CumulativeSumCalculator();
		CumulativeSumCalculator calc2 = new CumulativeSumCalculator();
		
		// 1ST WAY
		calc1.getCumulative(4);
		calc1.getCumulative(8);
		calc1.getCumulative(10);
		calc1.getTotalCumulativeSum();
		
		System.out.println();
		
		// 2ND WAY
		calc2.getCumulative(new int[]{4,8,10});
		calc2.getTotalCumulativeSum();
		
	}
	
}
 
class CumulativeSumCalculator{
	
	private int totalCumulativeSum = 0;
	
	public void getCumulative(int num){
		
		int	cumulative = 0;
		
		for(int i = 0; i <= num; i++){	
			cumulative += i;
		}
		
		totalCumulativeSum += cumulative;
		
		System.out.println("Cumulative sum for " + num + ": " + cumulative);
		
	}
	
	public void getCumulative(int[] array){
		
		for (int num : array){
			
			int cumulative = 0;
			
			for (int i = 0; i <= num; i++){
				cumulative += i;
			}
			
			totalCumulativeSum += cumulative;
			
			System.out.println("Cumulative sum for " + num + ": " + cumulative);
			
		}
		
	}
	
	public void getTotalCumulativeSum(){
		System.out.println("Total Cumulative Sum: " + totalCumulativeSum);
	}
	
	
};