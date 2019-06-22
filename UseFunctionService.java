/*这一块代码如果没有的话，在Main函数里直接引用FunctionService的Bean，程序也是可以一样运行，结果不变*/
package com.helloworld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service //声明UseFunctionService类是Spring管理的一个Bean

public class UseFunctionService {
@Autowired //将FunctionService的实体Bean注入到UseFunctionService中，让UseFunctionService具备FunctionService的功能
	
FunctionService functionService ;
public String sayHello(String word) {
	return functionService.sayHello(word);
}
}
