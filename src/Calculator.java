import java.util.List;

public class Calculator {
	
	protected Calculator() {
		
	}
	
	protected Boolean isKTheSumOfTwoNumbers(Integer k, List<Integer> list) {
		for(Integer num : list) {
			for(Integer num2 : list) {
				if(!num.equals(num2)) {
					Integer sum = num+num2;
					if(sum.equals(k)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
