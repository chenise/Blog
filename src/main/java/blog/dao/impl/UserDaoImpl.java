package blog.dao.impl;

import org.hibernate.Query;
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
	private static final String hql = "from blog_user as u";

	@Override
	public String getPasswordByUsername(String name) {
		
		String completeHql = "select password " + hql +" where  name=?";
		Query  query = getSession().createQuery(completeHql);
		query.setParameter(0, name);
		
		
		return (String)query.uniqueResult();
	}

}
