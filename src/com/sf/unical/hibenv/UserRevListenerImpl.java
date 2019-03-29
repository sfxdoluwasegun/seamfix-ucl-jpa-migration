package com.sf.unical.hibenv;

import org.hibernate.envers.RevisionListener;

public class UserRevListenerImpl implements RevisionListener {

	@Override
	public void newRevision(Object revisionEntity) {
		
		if (UserRevEntity.class.isInstance(revisionEntity)){
			UserRevEntity userRevEntity = (UserRevEntity) revisionEntity ;
			
			UserRevInfoProvider userRevInfoProvider = UserRevInfoProviderFactory.getProvider();
			userRevEntity.setIpaddress(userRevInfoProvider.getRemoteAddress());
			userRevEntity.setUserid(userRevInfoProvider.getUserid());
		}
	}

}