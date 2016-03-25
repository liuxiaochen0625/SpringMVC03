package org.tarena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * 注解配置
 * controller编写原则
 * 组建扫描时，必须用@controller
 */
@Controller//扫描到spring,id默认为helloController
public class HelloController {
	@RequestMapping("/hello.do")
	public ModelAndView execute(){
		//hello.jsp
		ModelAndView av=new ModelAndView("hello");
		av.getModel().put("msg","你好");
		return av;
		
	}

}
