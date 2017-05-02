package blog.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import blog.dao.BaseDao;
import blog.dao.JournalDao;
import blog.dao.UserDao;
import blog.modal.Page;
import blog.service.BaseService;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:39:21
* 
*/
@SuppressWarnings("unchecked")
@Service("baseService")
@Lazy(true)
public class BaseServiceImpl<T>  implements BaseService<T>{
	private Class<T> clazz;
	
	public BaseServiceImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class)type.getActualTypeArguments()[0];
		}
	
	protected  BaseDao<T> baseDao;
	@PostConstruct
	public void init() {
		//根据clazz的类型，把不同的dao对象复制给baseDao对象
		String clazzName = clazz.getSimpleName();
		String clazzDao = clazzName.substring(0, 1).toLowerCase() 
				+ clazzName.substring(1) + "Dao"; //例如Account==>accountDao
		try {
			Field clazzField = this.getClass().getSuperclass().getDeclaredField(clazzDao);
			Field baseField = this.getClass().getSuperclass().getDeclaredField("baseDao");
			baseField.set(this, clazzField.get(this)); //baseDao就有值了
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
}
	
	
	
	@Resource
	UserDao   userDao;
	@Resource
	JournalDao	journalDao;
	
	
	
	
	
	
	@Override
	public void save(T t) {
		baseDao.save(t);
	}
	@Override
	public void update(T t) {
		baseDao.update(t);
	}
	@Override
	public void delete(T t) {
		baseDao.delete(t);
	}
	@Override
	public T get(int id) {
		
		return baseDao.get(id);
	}
	@Override
	public List<T> queryByPage(Page page) {
		return baseDao.queryByPage(page);
	}
	
	
	
	

}
