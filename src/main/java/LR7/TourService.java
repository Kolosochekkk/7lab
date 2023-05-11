package LR7;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;

@Path("/tour")
public class TourService {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response sendXmlDocument() {
        File file = new File("D:\\РИС\\Лабы\\LR7\\src\\main\\resources\\tour.xml");
        return Response.ok(file).build();
    }
}