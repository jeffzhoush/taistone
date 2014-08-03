<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>产品管理</title>
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
		<li><a href="${ctx}/sale/prod/prodinfo/">产品列表</a></li>
		<li class="active"><a href="${ctx}/sale/prod/prodinfo/form?id=${prodinfo.id}">产品<shiro:hasPermission name="sale:prod:prodinfo:edit">${not empty prodinfo.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sale:prod:prodinfo:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="prodinfo" action="${ctx}/sale/prod/prodinfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" class="required"/>
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">出车价:</label>
			<div class="controls">
				<form:input path="forwarderprice" htmlEscape="false" maxlength="10" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">现销价:</label>
			<div class="controls">
				<form:input path="storeprice" htmlEscape="false" maxlength="10" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">二批价:</label>
			<div class="controls">
				<form:input path="twosalesprice" htmlEscape="false" maxlength="10" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">赊销价:</label>
			<div class="controls">
				<form:input path="creditprice" htmlEscape="false" maxlength="10" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">排序:</label>
			<div class="controls">
				<form:input path="salesorder" htmlEscape="false" maxlength="2" />
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sale:prod:prodinfo:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
