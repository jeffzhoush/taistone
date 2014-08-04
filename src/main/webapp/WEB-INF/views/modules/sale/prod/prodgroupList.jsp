<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>产品层级管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/treetable.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#treeTable").treeTable({expandLevel : 5});
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
		<li class="active"><a href="${ctx}/sale/prod/prodgroup/">产品层级列表</a></li>
		<shiro:hasPermission name="sale:prod:prodgroup:edit"><li><a href="${ctx}/sale/prod/prodgroup/form">产品层级添加</a></li></shiro:hasPermission>
	</ul>
	<tags:message content="${message}"/>
	<table id="treeTable" class="table table-striped table-bordered table-condensed">
		<tr><th>产品层级名称</th><th>备注</th><shiro:hasPermission name="sale:prod:prodgroup:edit"><th>操作</th></shiro:hasPermission></tr>
		<c:forEach items="${list}" var="prodgroup">
			<tr id="${prodgroup.id}" pId="${prodgroup.parent.id ne requestScope.prodgroup.id?prodgroup.parent.id:'0'}">
				<td><a href="${ctx}/sale/prod/prodgroup/form?id=${prodgroup.id}">${prodgroup.name}</a></td>
				<td>${prodgroup.remarks}</td>
				<shiro:hasPermission name="sale:prod:prodgroup:edit"><td>
					<a href="${ctx}/sale/prod/prodgroup/form?id=${prodgroup.id}">修改</a>
					<a href="${ctx}/sale/prod/prodgroup/delete?id=${prodgroup.id}" onclick="return confirmx('要删除该产品层级及所有子产品层级项吗？', this.href)">删除</a>
					<a href="${ctx}/sale/prod/prodgroup/form?parent.id=${prodgroup.id}">添加下级产品层级</a> 
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
	</table>
</body>
</html>