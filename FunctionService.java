package com.helloworld;
import org.springframework.stereotype.Service;
@Service //使用Service注解声明当前FunctionService类是Spring管理的一个Bean

public class FunctionService{
public String sayHello(String word){   //定义FunctionService类的一个方法就是输出hello...
return "hello" + " " + word + "!";
}}