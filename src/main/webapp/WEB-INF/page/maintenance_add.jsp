<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增保养</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-multiselect.css"/>

<style type="text/css">
/* select -mul*/
/*自定义宽度*/
.myOwnDdl{
    display:inline-block;
    width:100%;
}

/* 实现宽度自定义 */
.myOwnDdl .btn-group{
    width:100%;
}
.myOwnDdl .multiselect {
    width:100%;
    text-align:right;
    margin-top:-5px;
}
.myOwnDdl ul {
    width:100%;
}
.myOwnDdl .multiselect-selected-text {
    position:absolute;
    left:0;
    right:25px;
    text-align:left;
    padding-left:20px;
}

/*控制隔行换色*/
.myOwnDll .multiselect-container li.odd {
    background: #eeeeee;
}
/*//控制select文本内容位置*/
.btn-group>.btn:first-child {
    margin-left: 0;
    padding-right: 90%;
}
/* select -mul end */
</style>
<script src="${pageContext.request.contextPath}/third/js/jquery-2.1.3.min.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/third/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/third/js/bootstrap-multiselect.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
$("#user_role").multiselect({  //分别为控制下拉容器最大高度、最多允许具体展示选中项数（其余以数字形式展示）、隔行换色控制、全选、支持检索。
    maxHeight:300,
    numberDisplayed:3,
    optionClass: function(element) {
        var value = $(element).parent().find($(element)).index();
        if (value%2 == 0) {
            return 'even';
        }
        else {
            return 'odd';
        }
    },
    includeSelectAllOption: true,
    enableFiltering: true,
    selectAllJustVisible: true,
    nonSelectedText: '请选择角色', //默认展示文本
    selectAllText: '全选'  //全选文本

});
</script>
<!-- <script>
	function selectCitys(obj) {
	    var workShopID = $(obj).val();
	    //清空城市下拉框中的内容，出第一项外
	    $("#city option:gt(0)").remove();
	    //清空地区下拉框中的内容，出第一项外
	    $("#area option:gt(0)").remove();
	    $.ajax({
	        url:"${pageContext.request.contextPath}/machineIndex/findAllMachines.action",
	        data:"workShopID="+workShopID,
	        dataType:"json",
	        success:function(data,textStatus,ajax){
	           var html = "<option>-请选择-</option>";
	           for(var i=0;i<data.length;i++){
	               html +="<option value='"+data[i].id+"'>"+data[i].name+"</option>";
	           }
	           $("#city").html(html);
	        }
	    });
	}
	
	function selectAreas(obj) {
	    var ID = $(obj).val();
	    //清空地区下拉框中的内容，出第一项外
	    $("#area option:gt(0)").remove();
	    $.ajax({
	        url:"${pageContext.request.contextPath}/machineIndex/findModelNumber.action",
	        data:"ID="+ID,
	        dataType:"json",
	        success:function(data,textStatus,ajax){
	           var html = "<option>-请选择-</option>";
	           for(var i=0;i<data.length;i++){
	               html +="<option value='"+data[i].id+"'>"+data[i].modelNumber+"</option>";
	           }
	           $("#area").html(html);
	        }
	    });
	}
	
	//封装其通用内容
	function append_template(jsonData,target){
	    var length = jsonData.length;
	    var html = "<option>-请选择-</option>";
	    for(var i=0;i<length;i++){
	        html +="<option value='"+data[i].id+"'>"+data[i].province+"</option>";
	    }
	    $("#"+target).html(html);
	};
</script> -->
</head>
<body>
	<!-- <div style="width:400px; margin-left:50px">
		<form action="" method="post"  class="form form-horizontal" id="form-add">
		  <div class="form-group">
		    <label for="exampleInputPassword1">所在车间</label>
		    <select class="form-control" id="province" onchange="selectCitys(this)">
		    	<option value="">-请选择-</option>
		    	<option value="1">1号车间</option>
		    	<option value="4">4号车间</option>
		    </select>
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">设备名称</label>
		    <select class="form-control" id="city" onchange="selectAreas(this)" name="name">
		    	<option value="">-请选择-</option>
		    </select>
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">型号</label>
		    <select class="form-control" id="area" name="modelNumber">
		    	<option value="">-请选择-</option>
		    </select>
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">内容</label>
		    <textarea class="form-control" rows="5" name="content"></textarea>
		  </div> -->
          <div class="form-group">
                            <label class="col-sm-4 control-label"><i class="required">*&nbsp;</i>所属角色：</label>
                            <div class="col-sm-6">
                                <div  class="myOwnDdl">
                                    <select  name="expendProject" id="user_role" class="form-control" multiple="multiple">
                                        <c:forEach var="var" items="${members}">
                                            <option value="${var.id}">${var.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
		<!--   <button type="button" class="btn btn-default" onclick="add();">提交</button>
		</form>
	</div> -->
</body>
</html>

