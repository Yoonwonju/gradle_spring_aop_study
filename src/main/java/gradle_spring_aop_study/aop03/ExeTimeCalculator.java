package gradle_spring_aop_study.aop03;

public class ExeTimeCalculator implements Calculator {
	
	//Proxy - 부가기능(공통기능) 구현 : 실행시간 측정기능
	private Calculator delegate;

	//factorial()기능을 직접 구현하지 않고 다른 객체(RecCalculator, ImpeCalculator)에 factorial()의 실행을 위임(delegate)
	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
//		long start = System.currentTimeMillis();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
//		long end = System.currentTimeMillis();
		System.out.printf("%s.factorial(%d) 실행시간 = %d%n",delegate.getClass().getSimpleName(), num, (end-start));
		return result;
	}
}
