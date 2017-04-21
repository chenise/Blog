package blog.action;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月21日 下午11:18:55
* 
*/
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration({"classpath:applicationContext.xml"}) 
public class UserActionTest {
	@Resource
	UserAction ua;
	@Resource
	User us;
	
	@Before
	public void setUp() throws Exception {
		us.setName("test3");
		us.setPassword("testpas3");
		ua.setUser(us);
	}
	
	

	@Test
	public void testAddUser() {
		ua.addUser();
	}

}
