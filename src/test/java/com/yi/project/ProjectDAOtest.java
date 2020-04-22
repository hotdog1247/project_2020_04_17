package com.yi.project;


import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ProjectDAOtest {
	
	@Autowired
	private ProjectDAO dao;
	
	@Test
	public void testSqlSessionFactory() {
		System.out.println(dao);
	}
	@Test
	public void testinsert() throws Exception {
		ProjectVO vo = new ProjectVO();
		vo.setName("관리자");
		vo.setNo(1);
		vo.setState("내용");
		vo.setContent("관리자들의 하는 일을 프로젝트화");
		vo.setSdate(new Date());
		vo.setEdate(new Date());
		dao.insert(vo);
	}
}
