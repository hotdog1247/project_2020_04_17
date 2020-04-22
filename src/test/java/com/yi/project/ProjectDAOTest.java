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
public class ProjectDAOTest {
	
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
		vo.setNo(2);
		vo.setState("내용");
		vo.setContent("관리자들의 하는 일을 프로젝트화");
		vo.setSdate(new Date());
		vo.setEdate(new Date());
		dao.insert(vo);
	}
	
	@Test
	public void readByNo()  throws Exception{
		dao.readByNo(1);
	};
	@Test
	public void list() throws Exception{
		dao.list();
	};
	@Test
	public void update() throws Exception{
		ProjectVO vo = dao.readByNo(1);
		dao.update(vo);
	};
	@Test
	public void delete() throws Exception{
		ProjectVO vo = dao.readByNo(1);
		dao.delete(vo);
	};
}
