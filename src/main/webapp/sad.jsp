<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增保养</title>
<script src="${pageContext.request.contextPath}/third/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/third/js/bootstrap-select.min.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/third/css/bootstrap.min.css"/>
<script src="${pageContext.request.contextPath}/third/js/jquery-2.1.3.min.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/third/css/bootstrap-select.min.css"/>
<script type="text/javascript"> 

function fun(){
var str=[];
var obj = document.getElementById("approverq");
for(var i=0;i<obj.options.length;i++){
if(obj.options[i].selected){
str.push(obj.options[i].value);// 收集选中项
}
}
$("#approver").val(str);
}

</script>
</head>
<body>
<div class="l_err" style="width: 100%; margin-top: 2px;"></div>
<form id="form" name="form" class="form-horizontal" method="post"
action="${ctx}/leave/editEntity.shtml">
<input type="hidden" class="form-control checkacc" 
value="${leave.id}" name="LeaveFormMap.id" id="id">
<section class="panel panel-default">
<div class="panel-body">

<div class="form-group">
<label class="col-sm-3 control-label">审批人</label>
<div class="col-sm-9">
<input type="hidden" class="form-control" placeholder="请输入事由" name="LeaveFormMap.approver" id="approver"value="${leave.approver}">
<select name=""  id="approverq" class="form-control selectpicker" multiple="true">
<option value="${leave.approver}"  >${leave.approver}</option>
<c:forEach items="${list}" var="list">
<option value="${list.userName}" >${list.userName}</option>
</c:forEach>
</select>
</div>
</div>

<div class="form-group">
<label class="col-sm-3 control-label">意见</label>
<div class="col-sm-9">
<textarea name="LeaveFormMap.idea" id="idea"  class="form-control"
style="width:600px;height:100px;" readonly="readonly">${leave.idea}
</textarea>  
</div>
</div>
</div>

<footer class="panel-footer text-right bg-light lter">
<button type="submit" class="btn btn-success btn-s-xs" onclick="fun()">提交</button>
</footer> 
</section>
</form>
   
</body>
</html>

