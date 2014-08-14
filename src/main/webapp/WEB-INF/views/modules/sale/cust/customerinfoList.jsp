<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>客户管理</title>
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
		<li class="active"><a href="${ctx}/sale/cust/customerinfo/">客户列表</a></li>
		<shiro:hasPermission name="sale:cust:customerinfo:edit"><li><a href="${ctx}/sale/cust/customerinfo/form">客户添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="customerinfo" action="${ctx}/sale/cust/customerinfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>名称 ：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th> <th>联系人</th> <th>联系电话</th> 
		<th>备注</th><shiro:hasPermission name="sale:cust:customerinfo:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="customerinfo">
			<tr>
				<td><a href="${ctx}/sale/cust/customerinfo/form?id=${customerinfo.id}">${customerinfo.name}</a></td>
				
				<td>${customerinfo.linkman}</td>
				<td>${customerinfo.phone}</td>
				
				<td>${customerinfo.remarks}</td>
				<shiro:hasPermission name="sale:cust:customerinfo:edit"><td>
    				<a href="${ctx}/sale/cust/customerinfo/form?id=${customerinfo.id}">修改</a>
					<a href="${ctx}/sale/cust/customerinfo/delete?id=${customerinfo.id}" onclick="return confirmx('确认要删除该客户吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
