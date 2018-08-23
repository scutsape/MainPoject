<%@include file="../template/header.jsp"%>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-center">
                        <sf:form action="saveDepartment" method="post" modelAttribute="department" class="fancy-form">
                            <legend>Departmente</legend>
                            <fieldset>
                                <input type="text" name="name" id="name" class="form-control" placeholder="Department">
                                <input type="text" name="position" id="position" class="form-control" placeholder="Job description">
                            </fieldset>
                            <p>
                                <button class="btn btn-primary " type="submit">Save</button>
                                <a class="btn btn-primary" href="welcome" role="button">Back</a>
                            </p>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>Department</th>
                                <th>Job description</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${department}" var="department">
                                <tr>
                                    <td> ${department.name} </td>
                                    <td> ${department.position} </td>
                                    <td><a href="editDepartment-${department.id}">Edit</a></td>
                                    <td><a href="deleteDepartment-${department.id}">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../template/footer.jsp"%>