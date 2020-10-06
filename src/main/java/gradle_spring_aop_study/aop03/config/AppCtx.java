package gradle_spring_aop_study.aop03.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import gradle_spring_aop_study.aop03.Calculator;
import gradle_spring_aop_study.aop03.RecCalculator;
import gradle_spring_aop_study.aop03.aspect.ExeTimeAspect;

@Configurable
@EnableAspectJAutoProxy
public class AppCtx {
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}

}
