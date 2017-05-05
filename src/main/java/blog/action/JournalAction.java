package blog.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import blog.modal.Journal;
import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月22日 下午1:09:10
* 
*/
@ParentPackage("struts-default")
@Namespace("/")
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
	
	@Action(value="readjournal",className="journalAction",results={@Result(name="read",type="freemarker",location="/Pages/journal.ftl")})
	public String	readJournal(){
		journal = jounalService.get(journal.getJournalId());   
		
		
		return  "read";
		
	}
	
	
	
	
	
	@Action(value="journallist",className="journalAction",results={@Result(name="success",type="freemarker",location="/Pages/journalList.ftl")})
	public	String	getJournalList(){
		resultList = jounalService.queryByPage(page);
		
		return SUCCESS;
	}
	

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

}
