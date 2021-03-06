<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>商品信息管理</title>
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
					name:{required:true,maxlength:255,remote: "${ctx}/sale/prod/prodinfo/checkNameUnique?oldName=" + encodeURIComponent('${prodinfo.name}')},
					salesorder:{required:true,digits:true}
				},
			    messages: {
			        name: {remote: "相同名称已存在."},
			       }
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/sale/prod/prodinfo/">商品信息列表</a></li>
		<li class="active"><a href="${ctx}/sale/prod/prodinfo/form?id=${prodinfo.id}">商品信息<shiro:hasPermission name="sale:prod:prodinfo:edit">${not empty prodinfo.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sale:prod:prodinfo:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="prodinfo" action="${ctx}/sale/prod/prodinfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/><form:hidden path="version"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">名称:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200"  />
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">产品编码:</label>
			<div class="controls">
				<form:input path="lv5id" htmlEscape="false" maxlength="20"  />
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">商品类型:</label>
			<div class="controls">
                <tags:treeselect id="prodgroup" name="prodinfo.prodgroup.id" value="${prodinfo.prodgroup.id}" labelName="prodinfo.prodgroup.name" labelValue="${prodinfo.prodgroup.name}"
					title="商品类型" url="/sale/prod/prodgroup/treeData" cssClass="required"/>
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">出车价:</label>
			<div class="controls">
				<form:input path="forwarderprice" htmlEscape="false" maxlength="20"   />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">现销价 :</label>
			<div class="controls">
				<form:input path="storeprice" htmlEscape="false" maxlength="20"   />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">二批价:</label>
			<div class="controls">
				<form:input path="twosalesprice" htmlEscape="false" maxlength="20"   />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">赊销价 :</label>
			<div class="controls">
				<form:input path="creditprice" htmlEscape="false"  maxlength="20"  />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">排序:</label>
			<div class="controls">
				<form:input path="salesorder" htmlEscape="false" maxlength="20"   />
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
