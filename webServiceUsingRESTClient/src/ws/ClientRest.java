package ws;

import java.text.MessageFormat;

import javax.ws.rs.core.*;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;

public class ClientRest 
{
private WebResource webResource;
private Client client;
public static final String BASE_URI="http://localhost:8080/WebServiceUsingREST/rest";

public 	ClientRest()
{
	client=Client.create(new DefaultClientConfig());
	webResource=client.resource(BASE_URI).path("demo");
}

public String getHello() throws UniformInterfaceException
{WebResource resource=webResource;
resource=resource.
		 path(MessageFormat.format("hello", new 
				 Object[] {}));
	return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

public String getCustomerInfo(String cust_name) throws UniformInterfaceException
{WebResource resource=webResource;
resource=resource.
		 path(MessageFormat.format("cust/{0}", new 
				 Object[] {cust_name}));
	return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}


}
