package gradle_spring_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gradle_spring_aop_study.aop03.Calculator;

public class MainAspectWithCache {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithCache.class);){
				
				Calculator cal = ctx.getBean("calculator", Calculator.class);
				cal.factorial(7);
				cal.factorial(7);
				cal.factorial(5);
				cal.factorial(5);
		}
	}
}
