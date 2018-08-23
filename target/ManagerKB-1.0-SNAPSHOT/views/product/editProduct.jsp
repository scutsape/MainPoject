<%@include file="../template/header.jsp" %>

    <sf:form action="editProduct" method="post" modelAttribute="product">
        <sf:input path="id" type="hidden"/>
        <sf:select path="categories" id="categories" class="form-control">
            <option value="Select">Categories</option>
            <c:forEach items="${categories}" var="categories">
                <option value="${categories.id}">${categories.categorie}</option>
            </c:forEach>
        </sf:select>
        <sf:input path="brand"/>
        <sf:input path="productModel"/>
        <sf:input path="productDescription"/>
        <sf:input path="serialNumber"/>
        <sf:input path="unitPrice"/>
        <sf:select path="supplier" id="supplier" class="form-control">
            <option value="Select">Suppliers</option>
            <c:forEach items="${supplier}" var="supplier">
                <option value="${supplier.id}">${supplier.companyName}</option>
            </c:forEach>
        </sf:select>
        <input type="submit" value="Save">
        <a class="btn btn-primary" href="suppliers" role="button">Back</a>
    </sf:form>


<%@include file="../template/footer.jsp" %>