package blog.action;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import aj.org.objectweb.asm.Label;
import blog.BaseTest;
import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年5月2日 下午9:01:39
* 
*/

public class LoginActionTest extends BaseTest{
	@Resource
	LoginAction La ;
	@Resource
	User us;
	
	@Before
	public void setUp() throws Exception {
		us.setName("test3");
		us.setPassword("testpas3");
		La.setUser(us);
	}

	@Test
	public void testCheckLogin() {
		String re  = La.checkLogin();
		assertTrue(re.equals("success"));
	}

}
