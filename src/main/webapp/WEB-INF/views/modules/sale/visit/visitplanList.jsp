<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>拜访计划管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/sale/visit/visitplan/">拜访计划列表</a></li>
		<shiro:hasPermission name="sale:visit:visitplan:edit"><li><a href="${ctx}/sale/visit/visitplan/form">拜访计划添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="visitplan" action="${ctx}/sale/visit/visitplan/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>名称 ：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th> <th>拜访顺序</th> <th>计划拜访时间</th> <th>拜访开始时间</th> <th>拜访结束时间</th> <th>经度</th> <th>纬度</th>
		<th>备注</th><shiro:hasPermission name="sale:visit:visitplan:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="visitplan">
			<tr>
				<td><a href="${ctx}/sale/visit/visitplan/form?id=${visitplan.id}">${visitplan.name}</a></td>
				
				<td>${visitplan.visitorder}</td>
				<td>${visitplan.plantime}</td>
				<td>${visitplan.starttime}</td>
				<td>${visitplan.endtime}</td>
				<td>${visitplan.longtitude}</td>
				<td>${visitplan.latitude}</td>
				
				<td>${visitplan.remarks}</td>
				<shiro:hasPermission name="sale:visit:visitplan:edit"><td>
    				<a href="${ctx}/sale/visit/visitplan/form?id=${visitplan.id}">修改</a>
					<a href="${ctx}/sale/visit/visitplan/delete?id=${visitplan.id}" onclick="return confirmx('确认要删除该拜访计划吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
