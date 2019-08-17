package com.broodcamp.api;

import java.util.Arrays;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;

/**
 * @author Edward P. Legaspi
 * @since 1.0
 **/
@RequestScoped
public class AnimeRsImpl extends BaseResource implements AnimeRs {

	@Override
	public Response listTitles() {
		return Response.ok()
				.entity(Arrays.asList("Overlord", "Gate", "Tanya the Evil", "Log Horizon", "Sword Art Online")).build();
	}

}
