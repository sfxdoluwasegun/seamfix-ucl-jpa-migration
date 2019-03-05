package com.sf.unical.hibenv;

/**
 * Holds the {@link UserRevInfoProvider} as a ThreadLocal.
 
 */
public class UserRevInfoProviderFactory {
	
	public static UserRevInfoProvider userRevInfoProvider ;
	
	public static UserRevInfoProvider getProvider(){
		
		return userRevInfoProvider;
	}
	
	public static <T extends UserRevInfoProvider> void setProvider(T clazz){
		userRevInfoProvider = clazz;
	}

}
