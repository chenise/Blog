package blog.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import blog.modal.Journal;
import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月22日 下午1:09:10
* 
*/
@Controller
@Scope("prototype")
public class JournalAction extends BaseAction<Journal>{
	@Resource
	private Journal journal;
	
	public	void	addJournal(){
		User user =null;
		//user = userSevice.get( (int) session.get("USER_ID"));
		user = userSevice.get(1);
		journal.setAuthor(user);
		
		jounalService.save(journal);
	}
	
	
	public String	readJournal(){
		journal = jounalService.get(journal.getJournalId());
		
		
		return  "read";
		
	}
	
	
	
	
	
	
	public	void	getJournalList(){
		resultList = jounalService.queryByPage(page);
		
		return ;
	}
	

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

}
