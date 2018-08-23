<%@include file="../template/header.jsp" %>

    <sf:form action="editSupplier" method="post" modelAttribute="supplier">
        <sf:input path="id" type="hidden"/>
        <sf:input path="companyName"/>
        <sf:input path="contactName"/>
        <sf:input path="contactTitle"/>
        <sf:input path="address"/>
        <sf:input path="city"/>
        <sf:input path="state"/>
        <sf:input path="zip"/>
        <sf:input path="email"/>
        <sf:input path="phoneNumber"/>
        <sf:input path="faxNumber"/>
        <sf:input path="homePage"/>
        <input type="submit" value="Save">
    </sf:form>


<%@include file="../template/footer.jsp" %>