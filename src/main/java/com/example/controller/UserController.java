package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.Hobby;
import com.example.form.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	/**
	 * 初期表示
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String index(Model model) {
		
		List<Hobby> hobbyList = new ArrayList<>();
		hobbyList.add(new Hobby(1, "野球"));
		hobbyList.add(new Hobby(2, "サッカー"));
		hobbyList.add(new Hobby(3, "テニス"));
		
		model.addAttribute("hobbyList", hobbyList);
		
		return "user/input";
	}
	
	/**
	 * フォーム送信時遷移先
	 * 
	 * @param userForm
	 * @param redirectAttributes
	 * @param model
	 * @return
	 */
	@RequestMapping("/create")
	public String create(
			UserForm userForm
			, RedirectAttributes redirectAttributes
			, Model model
			) {
		System.out.println(userForm);
		return "user/result";
	}
	
}
