<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>特陈计划管理</title>
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
		<li><a href="${ctx}/sale/market/applicationstoredisplay/">特陈计划列表</a></li>
		<li class="active"><a href="${ctx}/sale/market/applicationstoredisplay/form?id=${applicationstoredisplay.id}">特陈计划<shiro:hasPermission name="sale:market:applicationstoredisplay:edit">${not empty applicationstoredisplay.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sale:market:applicationstoredisplay:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="applicationstoredisplay" action="${ctx}/sale/market/applicationstoredisplay/save" method="post" class="form-horizontal">
		<form:hidden path="id"/><form:hidden path="version"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" class="required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">地堆面积:</label>
			<div class="controls">
				<form:input path="displayacreage" htmlEscape="false" maxlength="20"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包住数:</label>
			<div class="controls">
				<form:input path="displaysidecount" htmlEscape="false" maxlength="10"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">促销开始日期:</label>
			<div class="controls">
				<input id="promotiondatestart" name="promotiondatestart" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${applicationstoredisplay.promotiondatestart}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">促销结束日期:</label>
			<div class="controls">
				<input id="promotiondateend" name="promotiondateend" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${applicationstoredisplay.promotiondateend}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
			</div>
		</div>
		
		
		
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sale:market:applicationstoredisplay:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
