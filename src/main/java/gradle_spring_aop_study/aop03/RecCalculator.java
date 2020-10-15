package gradle_spring_aop_study.aop03;

public class RecCalculator implements Calculator {

	//핵심기능 구현(팩토리얼 연산)
	@Override
	public long factorial(long num) {
	
		if(num == 1) {
			return 1;
		} else { 
				return num * factorial(num-1);
		}
	}
}