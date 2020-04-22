<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<div class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">UPDATE</h3>
				</div>
				<form role="form" action="update" method="post">
					<div class="box-body">
						<div class="form-group">
							<label>프로젝트 이름</label>
							<input type="text" class="form-control" value="${project.name }" name="name">
						</div>
						<div class="form-group">
							<label>프로젝트 내용</label>
							<textarea rows="5" cols="30" class="form-control" name="content">${project.content }</textarea>
						</div>
						<div class="form-group">
							<label>시작날짜</label>
							<input type="date" class="form-control" value="<fmt:formatDate value="${project.sdate }" pattern="yyyy-MM-dd"/>" name="sdate">		
						</div>
						<div class="form-group">
							<label>마감날짜</label>
							<input type="date" class="form-control" value="<fmt:formatDate value="${project.edate }" pattern="yyyy-MM-dd"/>" name="edate">
						</div>
						<div class="form-group">
							<label>상태</label>
							<select name="p_state">
								<option>준비</option>
								<option>진행중</option>
								<option>종료</option>
								<option>보류</option>
							</select>
						</div>
						<input type="hidden" name="no" value="${project.no }">
					</div>
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">수정</button>
						<button type="reset" class="btn btn-danger">취소</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<%@ include file="../include/footer.jsp" %>