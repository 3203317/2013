<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../../../../common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${ctx}/styles/css/privilege/v1.0/css/rolestyle.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<form id="stuform"  method="post" >
		<div class="ui-dialog">
			<div class="cl"></div>
			<div class="ui-dialog-content">
				<ul>
					<li class="ui-dialog-li01"><font color="red">*</font>学生姓名：</li>
					<li class="ui-dialog-li02"><input id="name" name="name"
						type="text" /></li>

					<li class="ui-dialog-li01 cl"><font color="red">*</font>班级：</li>
					<li class="ui-dialog-li02"><input id="className" name="className"
						type="text" /></li>
						
					<li class="ui-dialog-li01 cl"><font color="red">*</font>学号：</li>
					<li class="ui-dialog-li02"><input id="no" name="no"
						type="text" /></li>
					<li class="ui-dialog-li01 cl">性别：</li>
					<li class="ui-dialog-li02">
						<label>男<input type="radio" name="sex" value="男" checked="checked"/></label>
						<label>女<input type="radio" name="sex" value="女"/></label>
					</li>

					<li class="ui-dialog-li01 cl">图片：</li>
					<li class="ui-dialog-li02">
						<input type="file" name="photo" id="photo"/>
					</li>
					<li class="ui-dialog-li01 cl">日期：</li>
					<li class="ui-dialog-li02">
						<input type="text" name="birthday" id="birthday" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
					</li>
					

				</ul>
			</div>
			<div class="ui-dialog-buttonpane">
				<div class="sub-btn-frame">
					<a class="sub-btn sub-btn-over" href="javascript:saveStu();">
						<span>保 存</span>
					</a>
				</div>

				<div class="sub-btn-frame">
					<a class="sub-btn sub-btn-over" href="javascript:void(0);"> <span
						onclick="art.dialog({id:'addstuid'}).close();">取 消</span>
					</a>
				</div>
			</div>
		</div>
	</form>
</body>
</html>