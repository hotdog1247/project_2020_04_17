<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">REGISTER</h3>
				</div>
				<form role="form" action="register" method="post">
					<div class="box-body">
						<div class="form-group">
							<label>프로젝트 이름</label>
							<input type="text" name="name" class="form-control">
						</div>
						<div class="form-group">
							<label>프로젝트 내용</label>
							<textarea rows="5" cols="30" name="content" class="form-control"></textarea>
						</div>
						<div class="form-group">
							<label>시작날짜</label>
							<input type="date" name="sdate" class="form-control">
						</div>
						<div class="form-group">
							<label>마감날짜</label>
							<input type="date" name="edate" class="form-control">
						</div>
						<div class="form-group">
							<label>상태</label>
							<select name="state">
								<option>준비</option>
								<option>진행중</option>
								<option>종료</option>
								<option>보류</option>
							</select>
						</div>
						<div class="box-footer">
							<button type="submit" class="btn btn-primary">저장</button>
							<button type="reset" class="btn btn-danger">취소</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<%@ include file="../include/footer.jsp" %>