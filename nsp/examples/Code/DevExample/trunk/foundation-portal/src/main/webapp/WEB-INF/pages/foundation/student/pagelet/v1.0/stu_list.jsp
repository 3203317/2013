<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../../../../common/taglibs.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>student</title>
<link href="${ctx}/styles/css/privilege/v1.0/css/style.css"
	type="text/css" rel="stylesheet" />
<link rel="stylesheet"
	href="${ctx}/scripts/lib/ztree/css/zTreeStyle/zTreeStyle.css"
	type="text/css" />
<script type="text/javascript"
	src="${ctx}/scripts/foundation/common/common.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/lib/jquery/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/lib/jquery/js/jquery.form.min.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/foundation/privilege/v1.0/privilege.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/lib/jquery/js/jquery-form.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/lib/ztree/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript"
	src="${ctx}/scripts/lib/art/jquery.artDialog.source.js?skin=default"></script>
<script type="text/javascript"
	src="${ctx}/scripts/foundation/student/student_jsp.js"></script>
<script type="text/javascript" src="${ctx}/scripts/lib/DatePicker/WdatePicker.js"></script>
</head>
<body>
<table border="0" cellspacing="0" cellpadding="0" width="100%"
	height="680">
	<tr>
		<td align="left" valign="top">
		<div class="current-address">当前位置：<a href="javascript:;">首页</a><img
			src="${ctx}/styles/css/portal/office/images/arrowbg.png" /><a
			href="javascript:;">学生管理</a><img
			src="${ctx}/styles/css/portal/office/images/arrowbg.png" /></div>
		<table width="100%" border="0" cellspacing="0" height="100%"
			cellpadding="0" class="main_con">
			<tr>
				<td valign="top" class="border_B0C6E3_left">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="m_tabel1">

					<tr>
						<td><input id="tree_id" value="-1" type="hidden"></input> <input
							id="menutree" value="menutree" type="hidden"></input>
						<ul class="three_btn">
							<li>
							<div class="sub-nav sub-nav-top">
							<div class="sub-btn-frame"><a
								class="sub-btn sub-btn-over txt-b" href="javascript:;"
								id="addMenuUI" onclick="addStuUI()"> <span><img
								src="${ctx}/styles/css/privilege/v1.0/images/zengjia_ico.png" />
							添 加</span> </a></div>
							<div class="sub-btn-frame"><a class="sub-btn sub-btn-over"
								href="javascript:;" id="editMenu" class="modify_btn"
								onclick="editStuUI()"> <span><img
								src="${ctx}/styles/css/privilege/v1.0/images/xiugai_ico.png" />修
							改</span> </a></div>
							<div class="sub-btn-frame"><a class="sub-btn sub-btn-over"
								href="javascript:;" id="deleteMenu" onclick="deleteById()">
							<span><img
								src="${ctx}/styles/css/privilege/v1.0/images/shanchu_ico.png" />删
							除</span> </a></div>
							</div>
							</li>
						</ul>
						</td>
					</tr>
					<tr>
						<td class="form-list">
						<div class="form_item">
						<ul>
							<li><label>学生姓名：</label><input id="stuname" name="stuname"
								type="text" class="text_input" /> &nbsp;&nbsp;
							<div class="sub-btn-frame"><a class="sub-btn sub-btn-over"
								href="javascript:;"> <span onclick="reloadStuList()"><img
								src="${ctx}/styles/css/privilege/v1.0/images/search_ico.png" />查
							询</span> </a></div>
							</li>
						</ul>
						</div>
						<div class="fen_geRg" id="pageInfo"><jsp:include
							page="stu_list_grid.jsp" /></div>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>