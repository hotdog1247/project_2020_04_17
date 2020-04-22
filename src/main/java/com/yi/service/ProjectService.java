package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectDAO;

@Service /* service는 Service로 annotetion 달아줘야 함 */
public class ProjectService {
	@Autowired /* Ioc , DI */
	private ProjectDAO dao;

	public void create(ProjectVO vo) throws Exception {
		dao.insert(vo);
	}

	public ProjectVO readByNo(int no) throws Exception {
		return dao.readByNo(no);
	}

	public List<ProjectVO> list() throws Exception {
		return dao.list();
	}

	public void update(ProjectVO vo) throws Exception {
		dao.update(vo);
	}

	public void delete(ProjectVO vo) throws Exception {
		dao.delete(vo);
	}
}
