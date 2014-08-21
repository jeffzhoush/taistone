<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>选择商品</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("input[name=id]").each(function(){
				//默认选中当前选中的值
				var v= $(this).val();
	        	if(v==$("#selectedId").val()){
	        		$(this).attr('checked',true);
	        	}else{
	        		$(this).removeAttr("checked");
	        	}
				
				$(this).click(function(){
					var curselect= $(this).attr('checked');
					$("input[name=id]").each(function(){ // 单选，需要清空其他勾选项
						$(this).removeAttr("checked");
					});
					$(this).attr('checked',curselect);
					
					var id = $(this).val(), name = $(this).attr("tag1"); // name的值从id的tag中取
					if($(this).attr('checked')){
						$("#selectedId").val(id);
						$("#selectedName").val(name);
					}else{
						$("#selectedId").val("");
						$("#selectedName").val("");
					}
					
				});
			});
			
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
	<div style="margin:10px;">
	<form:form id="searchForm" modelAttribute="prodinfo" action="${ctx}/sale/prod/prodinfo/selectList" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>名称：</label><form:input path="name" htmlEscape="false" maxlength="50" class="input-small"/>&nbsp;
		<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;
		
			<input id="selectedId" name="selectedId" type="hidden" value="" />
			<input id="selectedName" name="selectedName" type="hidden" value=""/>
		
		<div style="display:none"></div>
	</form:form>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th style="text-align:center;">选择</th><th>商品名称</th><th>商品类型</th></tr></thead>
		<tbody>
		
		<c:forEach items="${page.list}" var="prodinfo">
			<tr>
				<td style="text-align:center;"><input type="checkbox" name="id" value="${prodinfo.id}" title="${fns:abbr(prodinfo.name,40)}" tag1="${prodinfo.name}" /></td>
				<td>${prodinfo.name}</td>
				<td>${prodinfo.prodgroup.name}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	</div>
</body>
</html>