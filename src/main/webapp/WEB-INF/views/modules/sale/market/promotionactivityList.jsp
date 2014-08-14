<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>促销活动管理</title>
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
		<li class="active"><a href="${ctx}/sale/market/promotionactivity/">促销活动列表</a></li>
		<shiro:hasPermission name="sale:market:promotionactivity:edit"><li><a href="${ctx}/sale/market/promotionactivity/form">促销活动添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="promotionactivity" action="${ctx}/sale/market/promotionactivity/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>名称 ：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th> <th>促销开始日期</th> <th>促销结束日期</th> <th>终端最大面积</th> <th>终端最小面积</th>
		<th>备注</th><shiro:hasPermission name="sale:market:promotionactivity:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="promotionactivity">
			<tr>
				<td><a href="${ctx}/sale/market/promotionactivity/form?id=${promotionactivity.id}">${promotionactivity.name}</a></td>
				
				<td>${promotionactivity.startdate}</td>
				<td>${promotionactivity.enddate}</td>
				<td>${promotionactivity.storeareamax}</td>
				<td>${promotionactivity.storeareamin}</td>
				
				<td>${promotionactivity.remarks}</td>
				<shiro:hasPermission name="sale:market:promotionactivity:edit"><td>
    				<a href="${ctx}/sale/market/promotionactivity/form?id=${promotionactivity.id}">修改</a>
					<a href="${ctx}/sale/market/promotionactivity/delete?id=${promotionactivity.id}" onclick="return confirmx('确认要删除该促销活动吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
