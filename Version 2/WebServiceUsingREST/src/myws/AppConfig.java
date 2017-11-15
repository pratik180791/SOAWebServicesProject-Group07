package myws;

import java.util.Set;


import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class AppConfig extends Application
{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resource=new java.util.HashSet<>();
		return resource;
	}
	
	private void addRestResourceClasses(Set<Class<?>> resource)
	{
		resource.add(myws.FirstWebService.class);
	}
	
}
