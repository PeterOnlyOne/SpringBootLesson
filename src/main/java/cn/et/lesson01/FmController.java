package cn.et.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FmController {

	@RequestMapping("/hello")
	public String testFtl(Model model){
		model.addAttribute("arr", new String[]{"苹果","香蕉","橘子"});
		return "hello";
	}
}
