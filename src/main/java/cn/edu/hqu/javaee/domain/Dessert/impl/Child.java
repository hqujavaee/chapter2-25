package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
@PropertySource("classpath:application.properties" )
public class Child implements Consumer {
	//采用SpEL注入字面值
	@Value("#{info.getName()}") String name;
	@Value("#{info.getLocation()}")String location;
	//采用SpEL注入bean引用id进行bean的注入
	private @Value("#{iceCream}")Dessert dessert;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.print("采用Spel表达式注入bean引用和bean的方法返回值："+name+"在"+location);
		dessert.eat();
	}
}
