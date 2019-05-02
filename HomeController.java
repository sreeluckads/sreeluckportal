package com.sreeluck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sxm147
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}
