<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello page</title>
</head>
<body>
return value from action: ${name}
<c:if test="${allAlbums != null}">
<c:forEach items="${allAlbums}" var="album">
${album}
</c:forEach></c:if>
</body>
</html>