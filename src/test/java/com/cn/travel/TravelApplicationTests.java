package com.cn.travel;

import com.cn.travel.role.user.service.imp.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.cn.travel.role.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelApplicationTests {

	@Autowired
    UserService userService;
	@Test
	public void contextLoads() throws Exception {
		List<User> list = userService.findList();
		System.out.println("list = " + list);
	}

}
