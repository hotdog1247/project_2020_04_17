package com.yi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService service;

	@RequestMapping(value = "/project/register", method = RequestMethod.GET)
	public String registerGet() {
		// 등록할 때 많이 쓰는 메소드 이름은 register를 많이 쓴다.
		System.out.println("registerGet에 들어옴");
		return "/project/register";
	}
//	String name, String content, String sdate, String edate, String state
	@RequestMapping(value = "/project/register", method = RequestMethod.POST)
	public String registerPost(ProjectVO vo) throws Exception {
		System.out.println("register POST =============================================> ");
//		ProjectVO vo = new ProjectVO(name, content, sdate, edate, state);
		/* service.create(vo); */
//		System.out.println("name : "+name);
//		System.out.println("content : "+content);
//		System.out.println("sdate : "+sdate);
//		System.out.println("edate : "+edate);
//		System.out.println("state : "+state);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date sdate2 = sdf.parse(sdate);
//		Date edate2 = sdf.parse(edate);
//		ProjectVO vo = new ProjectVO(name, content, sdate2, edate2, state);
		service.create(vo);
		
		System.out.println("::: CONTROLLER DATA ::: " + vo.toString());
		return "redirect:/project/list";
		// redirect는 get으로 가는데 forward는 get, post 둘 다 간다
	}

	@RequestMapping(value = "/project/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		List<ProjectVO> list = service.list();
		model.addAttribute("list", list);
		return "/project/list";
	}

	@RequestMapping(value = "/project/read", method = RequestMethod.GET)
	public String read(int no, Model model) throws Exception {
		ProjectVO vo = service.readByNo(no);
		model.addAttribute("project", vo);
		return "/project/read";
	}

	@RequestMapping(value = "/project/remove", method = RequestMethod.GET)
	public String remove(int no) throws Exception {
		System.out.println("no : " + no);
		ProjectVO vo = service.readByNo(no);
		System.out.println("vo : " + vo);
		service.delete(vo);
		return "redirect:/project/list";
	}

	@RequestMapping(value = "/project/update", method = RequestMethod.GET)
	public String updateGet(int no, Model model) throws Exception {
		System.out.println("no : " + no);
		ProjectVO vo = service.readByNo(no);
		model.addAttribute("project", vo);
		return "/project/update";
	}

	@RequestMapping(value = "/project/update", method = RequestMethod.POST)
	public String updatePost(ProjectVO vo) throws Exception {
		service.update(vo);
		System.out.println("vo :"+vo.toString());
		return "redirect:/project/read?no=" + vo.getNo() + "";
	}
}
