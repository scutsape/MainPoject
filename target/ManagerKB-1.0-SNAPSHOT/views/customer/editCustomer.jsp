<%@include file="../template/header.jsp" %>
<sf:form action="editCustomer" method="post" modelAttribute="cust">
    <sf:input path="id" type="hidden"/>
    <sf:input path="type"/>
    <sf:input path="firstName"/>
    <sf:input path="middleName"/>
    <sf:input path="lastName"/>
    <sf:input path="address"/>
    <sf:input path="city"/>
    <sf:input path="state"/>
    <sf:input path="zip"/>
    <sf:input path="email"/>
    <sf:input path="phoneNumber"/>
    <sf:input path="creditRating"/>
    <sf:input path="startDate"/>
    <input type="submit" value="Save">
</sf:form>

<%@include file="../template/footer.jsp" %>