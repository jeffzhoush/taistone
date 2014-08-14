<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>促销活动管理</title>
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
		<li><a href="${ctx}/sale/market/promotionactivity/">促销活动列表</a></li>
		<li class="active"><a href="${ctx}/sale/market/promotionactivity/form?id=${promotionactivity.id}">促销活动<shiro:hasPermission name="sale:market:promotionactivity:edit">${not empty promotionactivity.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sale:market:promotionactivity:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="promotionactivity" action="${ctx}/sale/market/promotionactivity/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" class="required"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">促销开始日期:</label>
			<div class="controls">
				<input id="startdate" name="startdate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${promotionactivity.startdate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">促销结束日期:</label>
			<div class="controls">
				<input id="enddate" name="enddate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${promotionactivity.enddate}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">终端最大面积:</label>
			<div class="controls">
				<form:input path="storeareamax" htmlEscape="false" maxlength="20"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">终端最小面积:</label>
			<div class="controls">
				<form:input path="storeareamin" htmlEscape="false" maxlength="20"/>
			</div>
		</div>
		
		
		
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sale:market:promotionactivity:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
