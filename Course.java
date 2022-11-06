package cloudxweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course2")
public class Course {
	@Id
	@Column(name="cid",length=20)
	private String cid;
	@Column(name="cname",length=20)
	private String cname;
	@Column(name="ccost",length=20)
	private String ccost;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcost() {
		return ccost;
	}
	public void setCcost(String ccost) {
		this.ccost = ccost;
	}
	
}
