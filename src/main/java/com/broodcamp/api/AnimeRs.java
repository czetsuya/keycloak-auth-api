package com.broodcamp.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Edward P. Legaspi
 * @since 1.0
 **/
@Path("/animes")
public interface AnimeRs {

	@GET
	Response listTitles();

}
