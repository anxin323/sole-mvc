<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登陆页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<script>
	function r() {

		var username = document.getElementById("username");

		var pass = document.getElementById("password");
		if (username.value == "") {
			alert("请输入用户名");
			username.focus();
			return;
		}
		if (pass.value == "") {
			alert("请输入密码");
			return;
		}
		document.getElementById("formid").submit();
		return true;
	}
</script>
</head>
<body>
	<form action="login.do" method="post" id="formid" name="loginform">
		<table width="350" bgcolor="#ccffcc" style="border-color" border="1">
			<tr align=center>
				<td>用户名</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr align=center>
				<td>密 码</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr align=center>
				<td>验证码</td>
				<td><input type="text" name="yanzheng"></td>
			</tr>
			<tr align=center>
				<td colspan="2"><input type="button" value="登 录" onclick="r();" />
					<input type="reset" value="重 置" /></td>
			</tr>

		</table>
	</form>
</body>
</html>
