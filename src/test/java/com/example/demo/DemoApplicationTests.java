package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
//表示启动这个单元测试类，单元测试类是不能运行的，需要传递一个参数，必须是springRunner的实例
//@RunWith(SpringRunner.class)
public class DemoApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void createName(){
		User user = new User();
		user.setLoginName("testloginname");
		user.setPassword("123456");
		Integer rows = userMapper.createName(user);
		System.out.println(rows+"123123123");
	}

}
