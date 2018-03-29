<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<body>
<h2>Hello World!</h2>
<a onclick="login('user/userLogin','11','22')" href="#">用户登录1</a>
<a  href="user/toUserList">用户登录2</a>
</body>
</html>
<script type="text/javascript" src="<%=basePath %>js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	function login(url,userName,passWord){
		$.ajax({
			type : "POST",
			url : url,
			data : {
				userName : userName,
				passWord : passWord
			},
			dataType : "json",
			async : false,
			success : function(data) {
				alert(data.msg);
			}
		});
	}
</script>