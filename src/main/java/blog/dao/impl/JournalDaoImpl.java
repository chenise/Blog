package blog.dao.impl;

import org.springframework.stereotype.Repository;

import blog.dao.JournalDao;
import blog.modal.Journal;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月22日 下午12:54:53
* 
*/
@Repository("journalDao")
public class JournalDaoImpl extends BaseDaoImpl<Journal> implements JournalDao{

}
