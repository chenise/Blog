package blog.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:28:18
* 
*/
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	private User user;

	@Action(value="regist",className="userAction",results={@Result(name="success",location="")})
	public void addUser(){
		userSevice.save(user);
	}
	
	
	
	
	
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
