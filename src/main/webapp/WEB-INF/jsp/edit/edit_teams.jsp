<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Cập Nhật Thông Tin Đội</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/general.css"/>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="../../js/team.js"></script>
</head>
<body>
<h3>Cập Nhật Thông Tin Đội: </h3>
<form:form method="post" action="/updateteam" modelAttribute="modelTeam">
    <div class="table-responsive">
        <table class="table table-bordered" style="width: 900px">
            <tr>
                <form:input type="text" path="id" readonly="true" hidden="true"/>
                <form:input type="text" path="total" readonly="true" hidden="true"/>
            </tr>
            <tr>
                <td>Tên Đội :</td>
                <td><form:input id="nameTeam" type="text" path="name" readonly="true" cssStyle="background: gainsboro"/></td>
            </tr>
            <tr>
                <td>Ngành Nghề :</td>
                <td>
                    <form:select path="teamId" cssStyle="background: gainsboro; " >
                        <c:if test="${modelTeam.teamId == 1}">
                            <form:option value="1" selected="selected" >In</form:option>
                        </c:if>
                        <c:if test="${modelTeam.teamId == 2}">
                            <form:option value="2" selected="selected" >Thêu</form:option>
                        </c:if>
                        <c:if test="${modelTeam.teamId == 3}">
                            <form:option value="3" selected="selected" >May</form:option>
                        </c:if>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Tình Trang:</td>
                <td>
                    <form:select path="enable">
                        <c:if test="${modelTeam.enable == true}">
                            <form:option value="1" selected="selected">Hoạt Động</form:option>
                            <form:option value="0">STOP</form:option>
                        </c:if>
                        <c:if test="${modelTeam.enable == false}">
                            <form:option value="1">Hoạt Động</form:option>
                            <form:option value="0" selected="selected">STOP</form:option>
                        </c:if>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <a class="btn btn-info" onclick="window.location.replace('/teams')">&#10094 Thoát</a>
                    <button class="btn-info btn" type="submit" >Cập Nhật &#10004</button>
                </td>
            </tr>
        </table>
    </div>
</form:form>
<br>
<h3> Danh Sách Đội: </h3>
<table class="table table-bordered" style="width: 900px">
    <thead class="thead">
    <tr>
        <th style="width: 50%">Tên Đội</th>
        <th style="width: 25%">Ngành Nghề</th>
        <th style="width: 25%">Tình Trạng</th>
    </tr>
    </thead>
    <tbody class="tbody-list">
    <c:forEach items="${listTeamForm}" var="teamform">
        <tr class="tb-row">
            <td>${teamform.name}</td>
            <td>
                <c:if test="${teamform.teamId == 1}">In</c:if>
                <c:if test="${teamform.teamId == 2}">Thêu</c:if>
                <c:if test="${teamform.teamId == 3}">May</c:if>
            </td>
            <td>
                <c:if test="${teamform.enable == true}">Hoạt Động</c:if>
                <c:if test="${teamform.enable == false}">STOP</c:if>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>