package blog.service.impl;

import org.springframework.stereotype.Service;

import blog.modal.User;
import blog.service.UserService;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午2:48:18
* 
*/
@Service("userService")
public class UserServiceImpl  extends BaseServiceImpl<User> implements UserService{

	@Override
	public Boolean checkPassword(String name, String password) {
		if(userDao.getPasswordByUsername(name) != null){
			if(password.equals(userDao.getPasswordByUsername(name))){
				return true;
			}
			
		}
		return false;
	}

	
}
