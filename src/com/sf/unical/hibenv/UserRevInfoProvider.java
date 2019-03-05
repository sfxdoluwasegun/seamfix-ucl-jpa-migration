package com.sf.unical.hibenv;

import org.hibernate.envers.RevisionListener;

/**
 * Implementation to provide revision information for {@link RevisionListener}.
 */
public interface UserRevInfoProvider {
	
	public long getUserid() ;
	
	public String getRemoteAddress() ;

}
