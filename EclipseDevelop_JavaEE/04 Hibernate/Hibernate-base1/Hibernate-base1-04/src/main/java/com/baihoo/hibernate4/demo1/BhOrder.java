package com.baihoo.hibernate4.demo1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * 订单的实体:
 * 	多一个订单对一个用户
 * @author Administrator
 * 		</br>
 *		“@Entity ---- 声明当前类为hibernate映射到数据库中的实体类”；</br>
 *
 *		“@Table(name = "BH_ORDER",
 *				catalog = "catolog",schema = "用户数据表",
 *				uniqueConstraints = {@UniqueConstraint(columnNames = {"title","content"})})”</br>
 *				-------</br>
 *				“@Table” 为实体Bean指定对应数据库表，catalog指定数据库名称 和  schema对应关系数据库中的图表;
 *				“@UniqueConstraints” 定义一个UniqueConstraint数组，指定需要建唯一约束的列。</br>
 *				在title,和content加上唯一约束</br>
 *
 */
@Entity
@Table(name = "BH_ORDER"
			//,catalog = "hibernate_study"
			//,schema = "root"
			//,uniqueConstraints = {@UniqueConstraint(columnNames = {"title","content"})}
)
public class BhOrder implements Serializable{
	/**
	 * @param oId 订单唯一识别ID
	 * @param addr 地址
	 * @param customer 订单属于某一个客户.放置一个客户的对象
	 */
	
    /**
     *  “@Id” ------  声明此列为主键,作为映射对象的标识符
     *  “@GeneratedValue”------ 注解来定义生成策略
     *  		GenerationType.TABLES ------当前主键的值单独保存到一个数据库的表中
     * 			GenerationType.SEQUENCE  ------ 利用底层数据库提供的序列生成标识符
     *  		GenerationType.IDENTITY ------ 采取数据库的自增策略
     *  		GenerationType.AUTO ------ 根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型
     */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="O_ID")
	private Integer oId;
	
	@Column(insertable = true,length = 20,nullable = false,name = "ADDR",unique = true,updatable = true)
	private String addr;
	
	   /**
	    *  
	    *  “@ManyToOne” -- 多对一
	    *  			-------
	    *  			fetch=FetchType.EAGER，急加载，加载一个实体时，定义急加载的属性会立即从数据库中加载。
	    *  			全部级联操作，referencedColumnName显式设置数据库字段名O_Cid，不写默认就是和name一样的。
	    */
	  @ManyToOne (cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	  @JoinColumn(name="C_NO",referencedColumnName="C_ID")
	  private BhCustomer customer;
	  
	  /**
	   * “@Version” ------ 注解用于支持乐观锁版本控制，乐观锁解决丢失更新,提供一个整数类型的属性. 。
	   */
	  @Version
	  @Column(name="VERSION")
		private Integer version;

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public BhCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(BhCustomer customer) {
		this.customer = customer;
	}


	public BhOrder() {
		super();
		// TODO Auto-generated constructor stub
	}


}
