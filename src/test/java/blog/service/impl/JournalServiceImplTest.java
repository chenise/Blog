package blog.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import blog.BaseTest;
import blog.modal.Journal;
import blog.modal.Page;
import blog.service.JournalService;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月27日 下午1:18:19
* 
*/

public class JournalServiceImplTest extends BaseTest {
	@Resource
	JournalService  js;
	Page page;
	List<Journal>  lsj;
	

	@Before
	public void setUp() throws Exception {
		this.page = new Page();
		this.page.setPageIndex(1);
		this.page.setMaxResult(5);
	}

	@Test
	public void testQueryByPage() {
		this.lsj = js.queryByPage(page);
		assertNotNull(lsj);
	}

}
