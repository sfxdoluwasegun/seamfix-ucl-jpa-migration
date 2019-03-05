package com.sf.unical.hibenv;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

/**
 * Entity implementation class for Entity: UserRevEntity
 *
 */
@Entity
@RevisionEntity(UserRevListenerImpl.class)
@Table(name = "zz_user_rev_entity", schema = "audit")
public class UserRevEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@RevisionNumber
	private int pk ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@RevisionTimestamp
	private Date timestamp ;
	
	@Column(name = "user_id")
	private long userid ;
	
	@Column(name = "ip_address")
	private String ipaddress ;

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
   
}