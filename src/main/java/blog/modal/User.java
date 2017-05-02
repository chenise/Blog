package blog.modal;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Repository;



/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月18日 下午1:29:51
* 
*/
@Entity(name="blog_user")
@Repository
public class User {
	private Integer id;
	private	String  name;
	private	String	password;
	private Set<Journal> journals;
	
	
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="author")
	public Set<Journal> getJournals() {
		return journals;
	}
	public void setJournals(Set<Journal> journals) {
		this.journals = journals;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
