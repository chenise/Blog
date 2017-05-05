package blog.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年5月2日 下午8:07:35
* 
*/
@ParentPackage("struts-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class LoginAction extends BaseAction<User>{
	
	User user;
	@Action(value="login",className="loginAction",results={@Result(name="login",type="freemarker",location="/Pages/login.ftl")})
	public String login(){
		
		return "login";
	}
	

	@Action(value="checkLogin",className="loginAction",results={@Result(name="success",type="chain",params={"actionName","journallist","namespace","/"})})
	public	String	checkLogin(){
		Boolean isCurrect =userSevice.checkPassword(user.getName(), user.getPassword());
		if(isCurrect){
			session.put("USER_NAME",user.getName() );
		}
		
		return isCurrect ? SUCCESS : INPUT ;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
