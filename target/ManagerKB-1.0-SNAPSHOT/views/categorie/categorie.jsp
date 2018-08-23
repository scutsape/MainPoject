<%@include file="../template/header.jsp"%>
<link rel="stylesheet" href="/STYLE/city.css">

<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-center">
                        <sf:form action="saveCategorie" method="post" modelAttribute="categorie" class="fancy-form">
                            <legend>Categorie</legend>
                            <fieldset>
                                <input type="text" name="categorie" id="categorie" class="form-control" placeholder="Categorie">
                            </fieldset>
                            <p>
                                <button class="btn btn-primary " type="submit">Save</button>
                                <a class="btn btn-primary" href="welcome" role="button">Back</a>
                            </p>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>Categorie</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${categorie}" var="categorie">
                                <tr>
                                    <td> ${categorie.categorie} </td>
                                    <td><a href="editCategorie-${categorie.id}">Edit</a></td>
                                    <td><a href="deleteCategorie-${categorie.id}">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../template/footer.jsp"%>