<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>
<div class="content">
	<div class="row">
		<div class="col-sm-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">LIST</h3>
					<div class="box-body text-right">
						<a href="${pageContext.request.contextPath }/project/register">register</a>
					</div>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<tr>
							<th>프로젝트 이름</th>
							<th>시작날짜</th>
							<th>종료날짜</th>
							<th>상태</th>
						</tr>
						<c:forEach var="project" items="${list }">
							<tr>
								<td><a href="${pageContext.request.contextPath}/project/read?no=${project.no}">${project.name }</a></td>
								<td><fmt:formatDate value="${project.sdate }" pattern="yyyy-MM-dd"/></td>
								<td><fmt:formatDate value="${project.edate }" pattern="yyyy-MM-dd"/></td>
								<td><span class="badge bg-red">${project.state }</span></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="../include/footer.jsp" %>