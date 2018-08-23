<%@include file="../template/header.jsp" %>
<h2>Edit employee page</h2>
<div class="wrapForm">
    <sf:form action="editWorker" method="post" modelAttribute="works">
        <sf:input path="id" type="hidden"/>
        <sf:input path="username"/>
        <sf:input path="title"/>
        <sf:input path="department"/>
        <sf:input path="startDate"/>
        <sf:input path="salary"/>
        <sf:input path="password"/>
    </sf:form>
</div>
<div class = "leftBlock"></div>
<div class = "oneMoreBlock"></div>
<%@include file="../template/footer.jsp" %>