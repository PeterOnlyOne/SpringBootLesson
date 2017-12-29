package cn.et.lesson02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
public class ConfigBean {

	@Bean
	public ServletRegistrationBean druidStatView(){
		ServletRegistrationBean srb = new ServletRegistrationBean();
		srb.setName("DruidStatView");
		StatViewServlet svs = new StatViewServlet();
		srb.setServlet(svs);
		String url = "/druid/*";
		List<String> urls = new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);
		Map<String, String> map = new HashMap<String, String>();
		map.put("loginUsername", "admin");
		map.put("loginPassword", "123321");
		srb.setInitParameters(map);
		return srb;
	}
}
