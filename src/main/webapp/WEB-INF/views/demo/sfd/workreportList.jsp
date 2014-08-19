<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>工作汇报管理</title>
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
		
		function viewpic(href){
			 top.$.jBox.open('iframe:'+href,'图片',600,400,{
				buttons:{"关闭":true},
				loaded:function(h){
					//$(".jbox-content", top.document).css("overflow-y","hidden");
					//$(".nav,.form-actions,[class=btn]", h.find("iframe").contents()).hide();
				}
			});
			return false; 
		}
		
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/sfd/workreport/">工作汇报列表</a></li>
		<!-- <shiro:hasPermission name="sfd:workreport:edit"><li><a href="${ctx}/sfd/workreport/form">工作汇报添加</a></li></shiro:hasPermission> -->
	</ul>
	<form:form id="searchForm" modelAttribute="workreport" action="${ctx}/sfd/workreport/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
		<label>开始时间：</label>
			<input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-small Wdate"  value="<fmt:formatDate value="${workreport.createDateStart}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"/>
		<label>结束时间：</label>
			<input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-small Wdate" value="<fmt:formatDate value="${workreport.createDateEnd}" pattern="yyyy-MM-dd"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'});"/>
			&nbsp;
		
		<label>汇报类型：</label>
			<form:select path="reportType">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('sfd_workreport_report_type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;
		
		
			<label>部门：</label><tags:treeselect id="office" name="user.office.id" value="${workreport.user.office.id}" labelName="user.office.name" labelValue="${workreport.user.office.name}" 
				title="部门" url="/sys/office/treeData?type=2" cssClass="input-small" allowClear="true"/>
		
		
		<label>人员 ：</label><form:input path="user.name" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;
		<label>手机号码 ：</label><form:input path="user.mobile" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;
		<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form:form>
	<tags:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>序号</th><th>人员</th> <th>部门</th> <th>手机号</th> <th>汇报类型</th> <th>提交时间</th> <th>汇报内容</th> <th>照片</th>
		<th>备注</th><shiro:hasPermission name="sfd:workreport:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody>
		<c:forEach items="${page.list}" var="workreport" varStatus="status">
			<tr>
				<td>${ status.index + 1}</td>
				<td><a href="${ctx}/sfd/workreport/form?id=${workreport.id}">${workreport.user.name}</a></td>
				
				<td>${workreport.user.office.name}</td>
				<td>${workreport.user.mobile}</td>
				<td>${fns:getDictLabel(workreport.reportType, 'sfd_workreport_report_type', '')}</td>
				<td>${workreport.submitTime}</td>
				<td>${workreport.content}</td>
				<td>
				 	<a onclick="viewpic('${workreport.photo.photoPath}');" href="javascript:void(0)">
				 		<img src="http://www.baidu.com/img/bdlogo.png" title="${workreport.photo.name}" width="30" height="30"></img> 
				 	</a>
				 </td>
				<td>${workreport.remarks}</td>
				<shiro:hasPermission name="sfd:workreport:edit"><td>
    				<a href="${ctx}/sfd/workreport/form?id=${workreport.id}">修改</a>
					<a href="${ctx}/sfd/workreport/delete?id=${workreport.id}" onclick="return confirmx('确认要删除该工作汇报吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
