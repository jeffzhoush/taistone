<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送单管理</title>
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
		<li class="active"><a href="${ctx}/sfd/deliver/">配送单列表</a></li>
		<shiro:hasPermission name="sfd:deliver:edit"><li><a href="${ctx}/sfd/deliver/form">配送单添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="deliver" action="${ctx}/sfd/deliver/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>配送单号 ：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>配送单号</th> 
			 <th>区域</th> <th>部门</th> <th>合作商</th> <th>终端客户</th> <th>配送地址</th> <th>终端联系人</th> <th>配送电话</th> <th>配送品名称</th>
			 <th>配送人</th> <th>预约时间</th> <th>状态</th>  
			 <th>备注</th> 
			 <th>创建时间</th> <th>更改时间</th>
			<shiro:hasPermission name="sfd:deliver:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="deliver">
			<tr>
				<td><a href="${ctx}/sfd/deliver/form?id=${deliver.id}">${deliver.name}</a></td>
				
				<td>???</td>
				<td>${deliver.deliveruser.office.name}</td>
				<td>${deliver.supply.name}</td>
				<td>${deliver.customer}</td>
				<td>${deliver.address}</td>
				<td>${deliver.linkman}</td>
				<td>${deliver.phone}</td>
				<td>${deliver.prodinfo.name}</td>
				<td>${deliver.deliveruser.name}</td>
				<td><fmt:formatDate value="${deliver.orderTime}" pattern="yyyy-MM-dd"/></td>
				<td>${fns:getDictLabel(deliver.status, 'sfd_deliver_status', '无')}</td>
				<td>${deliver.remarks}</td>
				<td>${deliver.createDate}</td>
				<td>${deliver.updateDate}</td>
				
				<shiro:hasPermission name="sfd:deliver:edit"><td>
    				<a href="${ctx}/sfd/deliver/form?id=${deliver.id}">修改</a>
					<a href="${ctx}/sfd/deliver/delete?id=${deliver.id}" onclick="return confirmx('确认要删除该配送单吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
