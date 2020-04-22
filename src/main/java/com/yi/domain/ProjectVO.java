package com.yi.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int no;
	private String name;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edate;
	private String state;

	public ProjectVO() {
	}

	public ProjectVO(int no) {
		this.no = no;
	}

	public ProjectVO(String name, String content, Date sdate, Date edate, String state) {
		this.name = name;
		this.content = content;
		this.sdate = sdate;
		this.edate = edate;
		this.state = state;
	}
	public ProjectVO(int no, String name, String content, Date sdate, Date edate, String state) {
		this.no = no;
		this.name = name;
		this.content = content;
		this.sdate = sdate;
		this.edate = edate;
		this.state = state;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ProjectVO [no=" + no + ", name=" + name + ", content=" + content + ", sdate=" + sdate + ", edate="
				+ edate + ", state=" + state + "]";
	}

}
