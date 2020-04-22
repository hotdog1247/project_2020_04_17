<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<script>
	$(function() {
		$("#goList").click(function() {
			window.location.href ="${pageContext.request.contextPath }/project/list";
		})
		$("#removeBoard").click(function() {
			if(confirm("삭제?")){
				window.location.href ="${pageContext.request.contextPath }/project/remove?no=${project.no}";	
			}
			else{
				alert("삭제 취소");
				return;
			}
		})
 		$("#updateBoard").click(function() {
			window.location.href ="${pageContext.request.contextPath }/project/update?no=${project.no}";
		})
	})
</script>
<div class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ</h3>
				</div>
				
					<div class="box-body">
						<table class="table table-bordered">
							<tr>
								<th style="width:10px">프로젝트 이름</th>
								<th>프로젝트 내용</th>
								<th>시작날짜</th>
								<th>종료날짜</th>
								<th>상태</th>
							</tr>
							<tr>
								<td>${project.name }</td>
								<td>${project.content }</td>
								<td><fmt:formatDate value="${project.sdate }" pattern="yyyy-MM-dd"/></td>
								<td><fmt:formatDate value="${project.edate }" pattern="yyyy-MM-dd"/></td>
								<td><span class="badge bg-red">${project.state }</span></td>
							</tr>
						</table>
						<input type="hidden" name="p_no" value="${project.no }">
					</div>
				<div class="box-footer">
					<button class="btn btn-warning" id="updateBoard">수정</button>
					<button class="btn btn-danger" id="removeBoard">삭제</button>
					<button class="btn btn-primary" id="goList">돌아가기</button>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="../include/footer.jsp" %>