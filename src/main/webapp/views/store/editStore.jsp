<%@include file="../template/header.jsp" %>
<sf:form action="editStore" method="post" modelAttribute="store">
    <sf:input path="id" type="hidden"/>
    <sf:input path="name"/>
    <sf:input path="address"/>
    <sf:input path="city"/>
    <sf:input path="state"/>
    <sf:input path="zip"/>
    <sf:input path="phone"/>
    <sf:input path="fax"/>
    <sf:input path="email"/>
    <input type="submit" value="Save">
</sf:form>


<%@include file="../template/footer.jsp" %>
