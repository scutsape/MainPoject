<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/login.css">
<hr>
<div class="container">
    <div class="row">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <h3><i class="fa fa-lock fa-4x"></i></h3>
                            <h2 class="text-center">Department</h2>
                            <div class="panel-body">
                                <sf:form action="editDepartment" method="post" modelAttribute="department" class="form-signin">
                                    <sf:input path="id" type="hidden" class="form-control"/>
                                    <sf:input path="name" class="form-control"/>
                                    <sf:input path="position" class="form-control"/>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
                                </sf:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../template/footer.jsp" %>
