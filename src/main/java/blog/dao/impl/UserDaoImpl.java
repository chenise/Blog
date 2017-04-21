package blog.dao.impl;

import org.springframework.stereotype.Repository;

import blog.dao.UserDao;
import blog.modal.User;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午2:44:34
* 
*/
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User>  implements UserDao {

}
