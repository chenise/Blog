package blog.action;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.modal.Journal;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月22日 下午1:45:32
* 
*/
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration({"classpath:applicationContext.xml"}) 
public class JournalActionTest {
	@Resource
	JournalAction ja;
	@Resource
	Journal j;

	@Before
	public void setUp() throws Exception {
		j.setTitle("test_title");
		j.setContent("test-content");
		ja.setJournal(j);
	}

	@Test
	public void testAddJournal() {
		ja.addJournal();
	}

}
