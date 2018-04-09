<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>详情</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/third/css/bootstrap.css"/>
</head>
<body>
	<div style="width:400px; margin-left:50px">
	<div class="form-group">
	  <input type="hidden" name="ID" value="${machineMaintenance.id}"/>
	  <table>
	  	<tr>
	  		<td><label for="exampleInputEmail1">设备名称:</label>
	    		<input readonly="readonly" type="text" class="form-control" value="${machineMaintenance.machineName}">
	   		</td>
	  		<td><label for="exampleInputEmail1">设备型号:</label>
	    		<input readonly="readonly" type="text" class="form-control" value="${machineMaintenance.modelNumber}">
	   		</td>
	  	</tr>
	  	<tr>
	  		<td>
	  		    <label for="exampleInputPassword1">可用零件:</label>
	  		    <input readonly="readonly" type="text" class="form-control" value="${machineMaintenance.parts}">
	  		</td>
	  		<td>
	  		    <label for="exampleInputPassword1">保养日期:</label>
	  		    <input readonly="readonly" type="text" class="form-control" value="${machineMaintenance.maintenanceDate}">
	  		</td>
	  	</tr>
	  	<tr>
	  		<td>
	  		    <label for="exampleInputPassword1">负责人:</label>
	  		    <input readonly="readonly" type="text" class="form-control" value="${machineMaintenance.maintenancePeople}">
	  		</td>
	  		<td>
	  			<label for="exampleInputPassword1">状态:</label>
				<c:if test="${machineMaintenance.state == 1}">
					<input readonly="readonly" type="text" class="form-control" value="未到期">
				</c:if>
				<c:if test="${machineMaintenance.state == 2}">
					<input readonly="readonly" type="text" class="form-control" value="已完成">
				</c:if>
				<c:if test="${machineMaintenance.state == 3}">
					<input readonly="readonly" type="text" class="form-control" value="未完成">
				</c:if>
			</td>
	  	</tr>
	  	<tr>
	  		<td> <label for="exampleInputPassword1">保养内容:</label>
	   		    <textarea class="form-control" rows="5">${machineMaintenance.content}</textarea>
	    	</td>
	  	</tr>
	  </table>
	</div>
	</div>
</body>
</html>