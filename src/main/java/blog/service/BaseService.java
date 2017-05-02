package blog.service;

import java.util.List;

import blog.modal.Page;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:38:29
* 
*/

public interface BaseService<T> {
	void save(T t);
	
	void update(T t);
	
	void	delete(T t);
	
	T	get(int id);
	
	public List<T> queryByPage(Page page);

}
