package gradle_spring_aop_study.aop03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import gradle_spring_aop_study.aop03.Calculator;
import gradle_spring_aop_study.aop03.RecCalculator;
import gradle_spring_aop_study.aop03.aspect.CacheAspect;
import gradle_spring_aop_study.aop03.aspect.ExeTimeAspect;

@Configuration
@EnableAspectJAutoProxy
public class AppCtxWithCache {
	
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}

	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
}
