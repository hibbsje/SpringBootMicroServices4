package com.plantplaces4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PlantPlaces4Controller {
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	/** Handle the / endpoint
	 * 
	 * @return
	 */
	@RequestMapping("/start")
	public String index() {
		return "start";
	}
	
}
