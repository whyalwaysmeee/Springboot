package com.helloworld;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //声明这是一个配置类

/*使用ComponentScan自动扫描名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean。也就是让DiConfig这个类具有之前在
helloworld包裹中定义的所有Service的功能 */

@ComponentScan("com.helloworld") 

public class DiConfig {

}
