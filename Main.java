package com.helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DiConfig.class);//使用ACAC作为Spring的容器，接受输入一个配置类作为参数
	/*获得声明配置的UseFunctionService的Bean。也就相当于类的实例化*/
	UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
	
	System.out.println(useFunctionService.sayHello("ctgod"));
	
	context.close();
}
}
