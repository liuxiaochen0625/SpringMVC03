package org.tarena.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.tarena.entity.User;

@Controller//扫描
public class LoginController {
	@RequestMapping("/login2.do")
	public String checklogin2(User user,ModelMap model){
		if("scott".equals(user.getUsername())&&"123456".equals(user.getPassword())){
			return "ok";
		}else{
			//model.put("msg","用户名或密码错误");
			model.addAttribute("msg","信息");
			return "login";
		}
	}
	
	@RequestMapping("/login1.do")
	public ModelAndView  checklogin1(@RequestParam("username")String name,String password,HttpSession session){
		ModelAndView av=new ModelAndView();
		System.out.println(name);
		if("scott".equals(name)&&"123456".equals(password)){
			session.setAttribute("user", name);
			av.setViewName("ok");
			 return av;
		 }else{
			 av.setViewName("login");
			 av.getModel().put("msg","用户名或密码错误");
			 return av;
		 }
	}
	
	
	
	@RequestMapping("login.do")
	public String checklogin(HttpServletRequest request){
		 String name=request.getParameter("username");
		 String password=request.getParameter("password");
		 
		 if("scott".equals(name)&&"123456".equals(password)){
			 request.getSession().setAttribute("user",name);
			 return "ok";
		 }else{
			 request.setAttribute("msg", "sdfkkfdkl;fk;ld");
			 return "login";
		 }
	}
	
	//返回视图名
	@RequestMapping("/tologin.do")
	public String toLogin(){
		return "login";//进入ligin.jso,视图名为login
	}

}
