<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-center">
                            <sf:form action="saveService" method="post" modelAttribute="service" class="fancy-form">
                                <legend>Service</legend>
                                <fieldset>
                                    <input type="text" name="serviceName" id="serviceName" placeholder="Service"
                                           class="form-control">
                                    <input type="text" name="serviceDescription" id="serviceDescription"
                                           class="form-control" placeholder="Description">

                                    <input type="number" name="servicePrice" id="servicePrice" class="form-control"
                                           placeholder="Price">
                                </fieldset>
                                <p>
                                    <button class="btn btn-primary " type="submit">Save</button>
                                    <a class="btn btn-primary" href="welcome" role="button">Back</a>
                                </p>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>Service</th>
                                <th>Description</th>
                                <th>Price</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${service}" var="service">
                                <tr>
                                    <td> ${service.serviceName} </td>
                                    <td> ${service.serviceDescription} </td>
                                    <td> ${service.servicePrice} </td>
                                    <td><a href="editService-${service.id}">Edit</a></td>
                                    <td><a href="deleteService-${service.id}">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br>
<%@include file="../template/footer.jsp" %>
