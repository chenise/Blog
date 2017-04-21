package blog.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.BaseDao;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:36:59
* 
*/
@Transactional
@SuppressWarnings("unchecked")
@Repository("baseDao")
@Lazy(true)

public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class<T>  clazz;
	@Resource
	private SessionFactory sessionFactory;
	
	public BaseDaoImpl(){
		ParameterizedType  type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
	}
	
	
	
	
	
	private Session  getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void save(T t) {
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		getSession().update(t);
	}

	@Override
	public void delete(T t) {
		getSession().delete(t);
	}

	@Override
	public T get(int id) {
		getSession().get(clazz, id);
		return null;
	}

}
