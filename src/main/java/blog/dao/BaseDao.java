package blog.dao;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:31:57
* 
*/

 public interface BaseDao<T> {
	 
	 void	save(T t);
	 
	 void	update(T t);
	 
	 void	delete(T t);
	 
	 T	get(int id);

}
