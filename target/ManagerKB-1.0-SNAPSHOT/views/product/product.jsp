<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <sf:form action="saveProduct" method="post" modelAttribute="prod" class="fancy-form">

                                    <legend>Product</legend>
                                <fieldset>
                                    <sf:select path="categories" id="categories" class="form-control">
                                        <option value="Select">Categories</option>
                                        <c:forEach items="${categories}" var="categories">
                                            <option value="${categories.id}">${categories.categorie}</option>
                                        </c:forEach>
                                    </sf:select>
                                    <input type="text" name="brand" id="brand" placeholder="Brand"
                                           class="form-control">
                                    <input type="text" name="productModel" id="productModel" placeholder="Model"
                                           class="form-control">
                                    <input type="text" name="productDescription" id="productDescription"
                                           class="form-control" placeholder="Description">
                                    <input type="text" name="serialNumber" id="serialNumber" class="form-control"
                                           placeholder="Serial Number">
                                    <input type="number" name="unitPrice" id="unitPrice" class="form-control"
                                           placeholder="Price">
                                    <sf:select path="supplier" id="supplier" class="form-control">
                                        <option value="Select">Suppliers</option>
                                        <c:forEach items="${supplier}" var="supplier">
                                            <option value="${supplier.id}">${supplier.companyName}</option>
                                        </c:forEach>
                                    </sf:select>
                                </fieldset>

                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <p>
                                    <button class="btn btn-primary " type="submit">Save</button>
                                    <a class="btn btn-primary" href="welcome" role="button">Back</a>
                                </p>
                            </sf:form>
                            <table class="table table-hover">
                                <tr>
                                    <th>Categories</th>
                                    <th>Brand</th>
                                    <th>Model</th>
                                    <th>Description</th>
                                    <th>Serial Number</th>
                                    <th>Price</th>
                                    <th>Suppliers</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                <c:forEach items="${product}" var="product">
                                    <tr>
                                        <td> ${product.categories.categorie} </td>
                                        <td> ${product.brand} </td>
                                        <td> ${product.productModel} </td>
                                        <td> ${product.productDescription} </td>
                                        <td> ${product.serialNumber} </td>
                                        <td> ${product.unitPrice} </td>
                                        <td> ${product.supplier.companyName} </td>
                                        <td><a href="editProduct-${product.id}">Edit</a></td>
                                        <td><a href="deleteProduct-${product.id}">Delete</a></td>
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
