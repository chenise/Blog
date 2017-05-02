package blog.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import blog.modal.Journal;
import blog.service.JournalService;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月22日 下午12:57:22
* 
*/
@Service("journalService")
public class JournalServiceImpl extends BaseServiceImpl<Journal> implements JournalService{
	@Override
	public void save(Journal j) {
		j.setPublishTime( new Date());
		super.save(j);
	}

}
