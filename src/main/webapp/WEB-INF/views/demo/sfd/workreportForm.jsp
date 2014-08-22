<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>工作汇报管理</title>
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
				},
				rules:{
					name:{required:true,maxlength:255}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/sfd/workreport/">工作汇报列表</a></li>
		<li class="active"><a href="${ctx}/sfd/workreport/form?id=${workreport.id}">工作汇报<shiro:hasPermission name="sfd:workreport:edit">${not empty workreport.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sfd:workreport:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="workreport" action="${ctx}/sfd/workreport/save" method="post" class="form-horizontal">
		<form:hidden path="id"/><form:hidden path="version"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">汇报类型:${workreport.reportType }</label><label class="control-label">汇报人:${workreport.user.name }</label><label class="control-label" style="width:250px">提交时间:${workreport.submitTime }</label>
		</div>
		<div class="control-group">
			<label class="control-label">汇报内容:</label>
			<div class="controls">
				<form:textarea path="content" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">图片:</label>
			<div class="controls">
				<img width="200" height="300" src="${workreport.photo.photoPath}"></img>
			</div>
		</div>
		
		
		
		
		<div class="form-actions">
			<shiro:hasPermission name="sfd:workreport:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission> 
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
