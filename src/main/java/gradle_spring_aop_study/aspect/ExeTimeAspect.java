package gradle_spring_aop_study.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

// Aspect�� ����� Ŭ����
@Aspect
@Order(1)
public class ExeTimeAspect {
	
	// �������� ������ pointcut
//	@Pointcut("execution(public * gradle_spring_aop_study.aop03..*(..))")
//	private void publicTarget() {
//	}
	
	// ������ �޼���
//	@Around("publicTarget()")
	@Around("CommonPointcut.commonTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) 실행시간 : %d ns\n",
					joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(), Arrays.toString(joinPoint.getArgs()),
					(finish - start));
		}
	}
}
