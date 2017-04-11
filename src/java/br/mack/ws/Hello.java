package br.mack.ws;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author joaquim
 */
@Path("hello")
public class Hello {

    public Hello() {
    }

    // This method is called if HTML and XML is not requested  
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello World Plain";
    }
    // This method is called if XML is requested  

    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello World XML" + "</hello>";
    }

    // This method is called if HTML is requested  
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello World HTML" + "</h1></body>" + "</html> ";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        return "{\"mensagem\":\"Hello World JSON\"}";
    }

}
