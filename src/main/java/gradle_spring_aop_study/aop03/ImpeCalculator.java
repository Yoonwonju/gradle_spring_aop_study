package gradle_spring_aop_study.aop03;

public class ImpeCalculator implements Calculator {

	//핵심기능 구현(팩토리얼 연산)
	@Override
	public long factorial(long num) {
		long result = 1;
		for(long i=1; i<=num; i++) {
			result *= i;
		}
		return result;
	}
}
