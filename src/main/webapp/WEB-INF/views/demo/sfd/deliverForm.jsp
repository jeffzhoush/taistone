<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送单管理</title>
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
		<li><a href="${ctx}/sfd/deliver/">配送单列表</a></li>
		<li class="active"><a href="${ctx}/sfd/deliver/form?id=${deliver.id}">配送单<shiro:hasPermission name="sfd:deliver:edit">${not empty deliver.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="sfd:deliver:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="deliver" action="${ctx}/sfd/deliver/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<tags:message content="${message}"/>
		<div class="control-group">
			<label class="control-label">配送单号:</label>
			<div class="controls">
				<form:input path="name" htmlEscape="false" maxlength="200" />
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">配送品:</label>
			<div class="controls">
				<input id="supplyid" type="hidden" name="deliver.supply.id" value="${deliver.supply.id}" />
				<input id="supplyname" type="text" readonly name="deliver.supply.name" value="${deliver.supply.name}" />
				<input id="btnsupplyid" type="button" value="..." >
				<script type="text/javascript">
					$("#btnsupplyid").click(function(){
						top.$.jBox.open("iframe:${ctx}/sale/cust/customerinfo/selectList?pageSize=8", "选择合作商",800,480,{
							buttons:{"确定":1,"取消":0,"清除":2}, loaded:function(h){
								$(".jbox-content", top.document).css("overflow-y","hidden");

								// 获取弹出窗口内容的引用，并初始化为当前值
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
						        $("#selectedId", container).val($("#supplyid").val());
						        $("#selectedName", container).val($("#supplyname").val());
						        // 默认勾选当前值
						        $("input[name=id]", container).each(function(){
						        	var v= $(this).val();
						        	if(v==$("#supplyid").val()){
						        		$(this).attr('checked',true);
						        	}else{
						        		$(this).removeAttr("checked");
						        	}
						        });
							},
							submit: function (v, h, f) {
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
								if(v==1){//选中
									$("#supplyid").val($("#selectedId", container).val());
									$("#supplyname").val($("#selectedName", container).val());
								}else if(v==2){// 清除
									$("#supplyid").val("");
									$("#supplyname").val("");
								}else{}
								return true;
							}
							
						});
					});
				</script>
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">终端客户:</label>
			<div class="controls">
				<form:input path="customer"  />
			</div>
		</div>

		<div class="control-group">
			<label class="control-label">配送员:</label>
			<div class="controls">
				<input id="deliveruserid" type="hidden" name="deliver.deliveruser.id" value="${deliver.deliveruser.id}" />
				<input id="deliverusername" type="text" readonly name="deliver.deliveruser.name" value="${deliver.deliveruser.name}" />
				<input id="btndeliveruserid" type="button" value="..." >
				<script type="text/javascript">
					$("#btndeliveruserid").click(function(){
						top.$.jBox.open("iframe:${ctx}/sys/user/selectList?pageSize=8", "选择合作商",800,480,{
							buttons:{"确定":1,"取消":0,"清除":2}, loaded:function(h){
								$(".jbox-content", top.document).css("overflow-y","hidden");

								// 获取弹出窗口内容的引用，并初始化为当前值
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
						        $("#selectedId", container).val($("#deliveruserid").val());
						        $("#selectedName", container).val($("#deliverusername").val());
						        // 默认勾选当前值
						        $("input[name=id]", container).each(function(){
						        	var v= $(this).val();
						        	if(v==$("#deliveruserid").val()){
						        		$(this).attr('checked',true);
						        	}else{
						        		$(this).removeAttr("checked");
						        	}
						        });
							},
							submit: function (v, h, f) {
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
								if(v==1){//选中
									$("#deliveruserid").val($("#selectedId", container).val());
									$("#deliverusername").val($("#selectedName", container).val());
								}else if(v==2){// 清除
									$("#deliveruserid").val("");
									$("#deliverusername").val("");
								}else{}
								return true;
							}
							
						});
					});
				</script>
			</div>
		</div>
		
		
		
		<div class="control-group">
			<label class="control-label">配送地址:</label>
			<div class="controls">
				<form:input path="address"  />
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">配送品:</label>
			<div class="controls">
				<input id="prodinfoid" type="hidden" name="deliver.prodinfo.id" value="${deliver.prodinfo.id}" />
				<input id="prodinfoname" type="text" readonly name="deliver.prodinfo.name" value="${deliver.prodinfo.name}" />
				<input id="btnprodinfoid" type="button" value="..." >
				<script type="text/javascript">
					$("#btnprodinfoid").click(function(){
						top.$.jBox.open("iframe:${ctx}/sale/prod/prodinfo/selectList?pageSize=8", "选择商品",800,480,{
							buttons:{"确定":1,"取消":0,"清除":2}, loaded:function(h){
								$(".jbox-content", top.document).css("overflow-y","hidden");

								// 获取弹出窗口内容的引用，并初始化为当前值
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
						        $("#selectedId", container).val($("#prodinfoid").val());
						        $("#selectedName", container).val($("#prodinfoname").val());
						        // 默认勾选当前值
						        $("input[name=id]", container).each(function(){
						        	var v= $(this).val();
						        	if(v==$("#prodinfoid").val()){
						        		$(this).attr('checked',true);
						        	}else{
						        		$(this).removeAttr("checked");
						        	}
						        });
							},
							submit: function (v, h, f) {
								var iframeName = h.children(0).attr("name");
						        var container = top.window.frames[iframeName].document;
								if(v==1){//选中
									$("#prodinfoid").val($("#selectedId", container).val());
									$("#prodinfoname").val($("#selectedName", container).val());
								}else if(v==2){// 清除
									$("#prodinfoid").val("");
									$("#prodinfoname").val("");
								}else{}
								return true;
							}
							
						});
					});
				</script>
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">终端联系人:</label>
			<div class="controls">
				<form:input path="linkman"  />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">联系电话:</label>
			<div class="controls">
				<form:input path="phone"  />
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label">预约时间:</label>
			<div class="controls">
				<input id="orderTime" name="orderTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${deliver.orderTime}" pattern="yyyy-MM-dd"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true});"/>
			</div>
		</div>
		
		
		
		<div class="control-group">
			<label class="control-label">状态:</label>
			<div class="controls">
				<form:select path="status">
			     	<form:option value="" label="请选择"/>
			     	<form:options items="${fns:getDictList('sfd_deliver_status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
			    </form:select>
			</div>
		</div>
		
		
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="200" class="input-xxlarge"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sfd:deliver:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>
