<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>终端管理</title>
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
		<li class="active"><a href="${ctx}/sale/cust/storeinfo/">终端列表</a></li>
		<shiro:hasPermission name="sale:cust:storeinfo:edit"><li><a href="${ctx}/sale/cust/storeinfo/form">终端添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="storeinfo" action="${ctx}/sale/cust/storeinfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>名称 ：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th> <th>老板</th> <th>经度 </th> <th>纬度</th> <th>邮编</th> <th>电话</th> <th>手机</th> <th>照片</th><th>门店状态</th>
		<th>备注</th><shiro:hasPermission name="sale:cust:storeinfo:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="storeinfo">
			<tr>
				<td><a href="${ctx}/sale/cust/storeinfo/form?id=${storeinfo.id}">${storeinfo.name}</a></td>
				
				<td>${storeinfo.storeowner}</td>
				<td>${storeinfo.longitude}</td>
				<td>${storeinfo.latitude}</td>
				<td>${storeinfo.zip}</td>
				<td>${storeinfo.phone}</td>
				<td>${storeinfo.mobile}</td>
				<td>${storeinfo.photo}</td>
				<td>${fns:getDictLabel(storeinfo.status, 'storeinfo_status', '无')}</td>
				
				<td>${storeinfo.remarks}</td>
				<shiro:hasPermission name="sale:cust:storeinfo:edit"><td>
    				<a href="${ctx}/sale/cust/storeinfo/form?id=${storeinfo.id}">修改</a>
					<a href="${ctx}/sale/cust/storeinfo/delete?id=${storeinfo.id}" onclick="return confirmx('确认要删除该终端吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
