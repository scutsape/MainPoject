<%@include file="../template/header.jsp" %>
<sf:form action="editDependent" method="post" modelAttribute="dependent">
        <sf:input path="id" type="hidden"/>
        <sf:input path="firstName"/>
        <sf:input path="middleName"/>
        <sf:input path="lastName"/>
        <sf:input path="address"/>
        <sf:input path="city"/>
        <sf:input path="state"/>
        <sf:input path="zip"/>
        <sf:input path="email"/>
        <sf:input path="phoneNumber"/>
    <input type="submit" value="Save">
    </sf:form>

<%@include file="../template/footer.jsp" %>