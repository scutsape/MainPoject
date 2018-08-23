<%@include file="../template/header.jsp" %>
<h2>Edit Service page</h2>
<div class="wrapForm">
    <sf:form action="editService" method="post" modelAttribute="service">
        <sf:input path="id" type="hidden"/>
        <sf:input path="serviceName"/>
        <sf:input path="serviceDescription"/>
        <sf:input path="servicePrice"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
        <a class="btn btn-primary" href="service" role="button">Back</a>
    </sf:form>
</div>

<%@include file="../template/footer.jsp" %>