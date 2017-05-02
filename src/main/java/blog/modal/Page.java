package blog.modal;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
* @author ChaosBear E-mail:576857622@qq.com
* @version 创建时间：2017年4月23日 下午12:50:59
* 
*/
@Component("page")
public class Page {
	private	int pageIndex;
	private	int pageCount;
	private	int maxResult;
	@PostConstruct
	private void init(){
		this.pageIndex = 1;
		this.maxResult = 5;
	}
	
	
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
}
