<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>客户管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/sale/cust/customerinfo/">客户列表</a></li>
		<li class="active"><a href="${ctx}/sale/cust/customerinfo/form?id=${customerinfo.id}">客户<shiro:hasPermission name="sale:cust:customerinfo:edit">${not empty customerinfo.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sale:cust:customerinfo:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="customerinfo" action="${ctx}/sale/cust/customerinfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/><form:hidden path="version"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" class="required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">联系人:</label>
			<div class="controls">
				<form:input path="linkman" htmlEscape="false" maxlength="255" class="required"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系电话:</label>
			<div class="controls">
				<form:input path="phone" htmlEscape="false" maxlength="20" class="required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sale:cust:customerinfo:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
