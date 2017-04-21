package blog.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import blog.service.UserService;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:16:16
* 
*/
@Controller
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements SessionAware {

	
	protected  Map<String, Object> session;
	@Resource
	protected	UserService userSevice;
	
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;		
	}


	
}
