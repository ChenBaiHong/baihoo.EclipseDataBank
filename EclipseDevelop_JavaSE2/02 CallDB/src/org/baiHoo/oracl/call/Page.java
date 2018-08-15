package org.baiHoo.oracl.call;


/**
 * 类说明：page相关变量定义
 * 修改记录
 */
public class Page
{
    private int totalPage;
    private int prePage;
    private int nextPage;
    private int totalRec;
    private int defaultPageSize;
    private int pageSize;
    private int pageIndex;
    private String havaNextPage;
    private String hiddenTotalPage;
    CacheFactory aa;

    public Page()
    {
        totalPage = 1;
        prePage = 1;
        nextPage = 1;
        totalRec = 0;
        defaultPageSize = 10;
        pageSize = defaultPageSize;
        pageIndex = 1;
        String tmp = CacheFactory.getProject("defaultPageSize");
        if(tmp != null && !tmp.equals(""))
            pageSize = Integer.parseInt(tmp);
        else
            pageSize = defaultPageSize;
    }

    public String toString()
    {
        return (new StringBuilder("{totalPage=")).append(totalPage).append(";prePage=").append(prePage).append(";nextPage=").append(nextPage).append(";totalRec=").append(totalRec).append(";pageSize=").append(pageSize).append(";pageIndex=").append(pageIndex).append("}").toString();
    }

    public int getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    public int getNextPage()
    {
        return nextPage;
    }

    public void setNextPage(int nextPage)
    { 
    	if(this.getHiddenTotalPage().equals("true")){
    		 this.nextPage = nextPage;
        }else{
         	 this.nextPage = nextPage;
        	 this.nextPage = this.nextPage <= totalPage ? this.nextPage : totalPage;
        } 
    }

    public int getNewNextPage(int pageIndex)
    {
	      if(this.getHiddenTotalPage().equals("true")){
	    	  return pageIndex + 1;
	      }else{
	    	  return pageIndex + 1 <= totalPage ? pageIndex + 1 : totalPage;
	      }
    }

    public int getNewPrePage(int pageIndex)
    {	
        return pageIndex - 1 >= 1 ? pageIndex - 1 : 1;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPrePage()
    {
        return prePage;
    }

    public void setPrePage(int prePage)
    {
        this.prePage = prePage;
        this.prePage = this.prePage >= 1 ? this.prePage : 1;
    }

    public int getTotalPage()
    {
        return totalPage;
    }

    public void setTotalPage(int totalPage)
    {
        this.totalPage = totalPage;
    }

    public int getTotalRec()
    {
        return totalRec;
    }

    public void setTotalRec(int totalRec)
    {
        this.totalRec = totalRec;
    }

    public int getPageCount()
    {	if(pageSize==-1){
    	return 1;
    	}
        int i = (int)Math.ceil((double)totalRec / (double)pageSize);
        return i;
    }

	public String getHavaNextPage() {
		return havaNextPage;
	}

	public void setHavaNextPage(String havaNextPage) {
		this.havaNextPage = havaNextPage;
	}

	public String getHiddenTotalPage() {
		return hiddenTotalPage;
	}

	public void setHiddenTotalPage(String hiddenTotalPage) {
		this.hiddenTotalPage = hiddenTotalPage;
	}
    
}
