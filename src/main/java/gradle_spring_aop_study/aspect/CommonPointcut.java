package gradle_spring_aop_study.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {
	
	@Pointcut("execution(public * gradle_spring_aop_study.aop03..*(..))")
	public void commonTarget() {
		
	}

}
