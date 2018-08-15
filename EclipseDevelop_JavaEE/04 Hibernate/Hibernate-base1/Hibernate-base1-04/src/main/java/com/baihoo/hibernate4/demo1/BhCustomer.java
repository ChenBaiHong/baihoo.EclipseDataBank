package com.baihoo.hibernate4.demo1;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FetchType;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


/**
 *	 一个用户对多一个订单
 * 
 * 
 * @author Administrator
 * 		</br>
 *		“@Entity ---- 声明当前类为hibernate映射到数据库中的实体类”；</br>
 *
 *		“@Table(name = "BH_CUSTOMER",
 *				catalog = "catolog",schema = "用户数据表",
 *				uniqueConstraints = {@UniqueConstraint(columnNames = {"title","content"})})”</br>
 *				-------</br>
 *				“@Table” 为实体Bean指定对应数据库表，catalog指定数据库名称 和  schema 对应关系数据库的DBA用户，
 *				“@UniqueConstraints” 定义一个UniqueConstraint数组，指定需要建唯一约束的列。</br>
 *				在title,和content加上唯一约束</br>
 *
 */
@Entity
@Table(name = "BH_CUSTOMER"
			//,catalog = "hibernate_study"
			//,schema = "root"
			//,uniqueConstraints = {@UniqueConstraint(columnNames = {"title","content"})}
)

//通过注解的方式使用HQL命名查询  
@NamedQueries({ @NamedQuery(name = "findHqlByCId", query = "from BhCustomer where cId < :id"),
		@NamedQuery(name = "findHqlByAll", query = "from BhCustomer"), 
		})
//通过注解的方式使用本地SQL查询  
@SqlResultSetMapping(name = "all_fields", entities = {
		@EntityResult(entityClass = com.baihoo.hibernate4.demo1.BhCustomer.class, fields = {
				@FieldResult(name = "cId", column = "C_ID"), @FieldResult(name = "cName", column = "C_NAME"),
				@FieldResult(name = "cSalary", column = "C_SALARY"), @FieldResult(name = "age", column = "AGE"),
				@FieldResult(name = "cDesc", column = "C_DESC"),
				@FieldResult(name = "birthDate", column = "BIRTH_DATE"),
				@FieldResult(name = "version", column = "VERSION") 
				}) 
		})
@NamedNativeQueries({
		@NamedNativeQuery(name = "findSqlByCId", query = "SELECT * FROM BH_CUSTOMER WHERE C_ID < :id", resultSetMapping = "all_fields"),
		@NamedNativeQuery(name = "findSqlByAll", query = "SELECT * FROM BH_CUSTOMER ", resultSetMapping = "all_fields"), 
		})
public class BhCustomer  implements Serializable{
	

    /**
     *  “@Id” ------  声明此列为主键,作为映射对象的标识符</br>
     *  “@GeneratedValue”------ 注解来定义生成策略</br>
     *  		GenerationType.TABLES ------当前主键的值单独保存到一个数据库的表中</br>
     * 			GenerationType.SEQUENCE  ------ 利用底层数据库提供的序列生成标识符</br>
     *  		GenerationType.IDENTITY ------ 采取数据库的自增策略</br>
     *  		GenerationType.AUTO ------ 根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型</br>
     */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="C_ID")
	private Integer cId;
	
	@Column(insertable = true,length = 20,nullable = false,name = "C_NAME",unique = true,updatable = true)
	private String cName;
	
	@Column(name = "C_SALARY", scale =6,precision = 2)
	private Double cSalary;
	
	 /**
     * “@Basic” ------ 基本属性类型映射,注解于非Static 非transient的属性，</br>
     * 			这时候我们可以为其声明抓取策略等属性</br>
     * 			fetch: 获取策略，当以session.get()方法获取数据库对象时：</br>
    *   		fetchType.LAZY为懒加载，会在第一次使用该属性（如调用getAge()方法）时才获取。</br>
    * 			FetchType.EAGER为即时加载。</br>
    * 			optional:表示当前属性是否可选，默认为true，如果为false,则在持久化到数据库时，如果此属性为null，则会失败</br>
     */
    @Basic(fetch = FetchType.EAGER,optional = true)
    @Column(name="AGE")
    private Integer age;
    
    /**
     * “@Transient” ------ 被标注此注解的属性不会被持久化到数据库
     */
    @Transient
    private String temp;
    
    /**
     * “@Lob” ------ 注解表示属性将被持久化为Blob或者Clob类型, </br>
     * 				具体取决于属性的类型, java.sql.Clob, Character[], char[] 和 java.lang.String这些类型的属性都被持久化为Clob类型, </br>
     * 				而java.sql.Blob, Byte[], byte[] 和 serializable类型则被持久化为Blob类型.</br>
     */
    @Lob
    @Column(name="C_DESC")
    private String cDesc;
    
    /**
     * “@Temporal” ------ 标注在日期等属性上，声明映射为数据库的特定诶其属性类型，</br>
     * 				默认为 java.sql.Timestamp（TemporalType.TIMESTAMP。</br>
     *  			此外还有java.sql.date（TemporalType.DATE）、</br>
     *  			java.sql.Time（TemporalType.TIME）</br>
     */
    @Temporal(TemporalType.TIME)
    @Column(name="BIRTH_DATE")
    private Date birthDate;
    
    
    /**
     * “@JoinColumn(name="C_NO") ” ------ </br>
     * 				设置一方的外键，这里是C_NO，因为实际上这个外键还是加在多方，只不过控制权变了。</br>
     * 				现在是一方维护多方了，主控权交给了一方，设置级联，一方要设置懒加载，推荐！</br>
     */
  @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
  @JoinColumn(name="C_NO")
	private Set<BhOrder> orders = new HashSet<BhOrder>();
	
  /**
   * “@Version” ------ 注解用于支持乐观锁版本控制，乐观锁解决丢失更新,提供一个整数类型的属性. 。
   */
  @Version
  @Column(name="VERSION")
	private Integer version;

  
	public BhCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 投影查询: com.baihoo.hibernate4.test.HibernateTest1.demo11()
	 * @param cId
	 * @param cName
	 */
	public BhCustomer(Integer cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public Double getcSalary() {
		return cSalary;
	}


	public void setcSalary(Double cSalary) {
		this.cSalary = cSalary;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getTemp() {
		return temp;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}


	public String getcDesc() {
		return cDesc;
	}


	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Set<BhOrder> getOrders() {
		return orders;
	}


	public void setOrders(Set<BhOrder> orders) {
		this.orders = orders;
	}


	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}




	

}
