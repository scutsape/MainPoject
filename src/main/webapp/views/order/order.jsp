<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-left">
                            <sf:form action="saveOrder" method="post" modelAttribute="ord" class="fancy-form">
                                <legend>Order Detaile</legend>
                                <input type="text" name="orderDate" id="date" placeholder="orderDate" class="form-control">
                                <input type="number" name="orderNumber" id="orderNumber" class="form-control" placeholder="Order Number">
                                <input type="text" name="shipName" id="shipName" class="form-control" placeholder="shipName">
                                <fieldset>
                                    <legend>Address</legend>
                                    <p class="instructions">Start by entering your zip code.</p>
                                    <div >
                                        <div>
                                            <input type="text" name="address" id="address" class="form-control" placeholder="Street">

                                        </div>
                                    </div>
                                    <div >
                                        <div class="city-wrap">
                                            <input type="text" name="city" id="city" class="form-control" placeholder="City">
                                        </div>
                                        <div class="state-wrap">
                                            <input type="text" name="state" id="state" class="form-control"placeholder="State">

                                        </div>
                                        <div class="zip-wrap">
                                            <input type="text" pattern="[0-9]*" maxlength="5" required name="zip" id="zip" class="form-control" placeholder="Zip">
                                            <p class="zip-error">Not a real zip code.</p>
                                        </div>
                                    </div>

                                    <div class="submit-wrap">
                                        <input type="hidden" value="Submit">
                                    </div>

                                </fieldset>
                                <legend>Contact</legend>
                                        <input type="text" name="shipDate" id="startDate" class="form-control" placeholder="shipDate">
                                    <input type="tel" name="shipPhoneNumber" id="shipPhoneNumber" class="form-control" placeholder="Phone Number">
                                <legend>Suma</legend>
                                <input type="number" name="unitPrice" id="unitPrice" class="form-control" placeholder="unitPrice">
                                    <input type="number" name="quantity " id="quantity " class="form-control" placeholder="quantity ">
                                    <input type="number" name="discount " id="discount " class="form-control" placeholder="discount ">
                                    <input type="number" name="saleTax " id="saleTax" class="form-control" placeholder="saleTax">
                                    <input type="number" name="lineTotal " id="lineTotal" class="form-control" placeholder="lineTotal">


                                <sf:select path="customer" id="customer" class="form-control">
                                    <sf:option value="Select">Customer</sf:option>
                                    <c:forEach items="${customer}" var="customer">
                                        <sf:option value="${customer.id}">${customer.firstName}</sf:option>
                                    </c:forEach>
                                </sf:select>
                                <sf:select path="employee" id="employee" class="form-control">
                                    <sf:option value="Select">Employee</sf:option>
                                    <c:forEach items="${employee}" var="employee">
                                        <sf:option value="${employee.id}">${employee.firstName}</sf:option>
                                    </c:forEach>
                                </sf:select>
                                <sf:select path="products" id="products" class="form-control" multiple="true">
                                    <sf:option value="Select">Product</sf:option>
                                    <c:forEach items="${products}" var="products">
                                        <sf:option value="${products.id}">${products.productModel}</sf:option>
                                    </c:forEach>
                                </sf:select>
                                <sf:select path="services" id="services" class="form-control">
                                    <sf:option value="Select">Service</sf:option>
                                    <c:forEach items="${service}" var="services">
                                        <sf:option value="${services.id}">${services.serviceName}</sf:option>
                                    </c:forEach>
                                </sf:select>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <p>
                                    <button class="btn btn-primary " type="submit">Save</button>
                                    <a class="btn btn-primary" href="welcome" role="button">Back</a>
                                </p>
                            </sf:form>
                            <table class="table table-hover">
                                <tr>
                                    <th>orderDate</th>
                                    <th>orderNumber</th>
                                    <th>shipName</th>
                                    <th>address</th>
                                    <th>city</th>
                                    <th>state</th>
                                    <th>zip</th>
                                    <th>Address</th>
                                    <th>City</th>
                                    <th>State</th>
                                    <th>Zip</th>
                                    <th>shipDate</th>
                                    <th>shipPhoneNumber</th>
                                    <th>unitPrice</th>
                                    <th> quantity</th>
                                    <th>saleTax</th>
                                    <th>lineTotal</th>
                                    <th>Products</th>
                                    <th>Services</th>
                                    <th> Customer</th>
                                    <th>Employee</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                <c:forEach items="${order}" var="orders">
                                    <tr>
                                        <td> ${orders.orderDate} </td>
                                        <td> ${orders.orderNumber} </td>
                                        <td> ${orders.shipName} </td>
                                        <td> ${orders.address} </td>
                                        <td> ${orders.city} </td>
                                        <td> ${orders.state} </td>
                                        <td> ${orders.zip} </td>
                                        <td> ${orders.shipDate} </td>
                                        <td>  ${orders.shipPhoneNumber} </td>
                                        <td>  ${orders.unitPrice} </td>
                                        <td>  ${orders.quantity} </td>
                                        <td> ${orders.discount} </td>
                                        <td> ${orders.saleTax} </td>
                                        <td>  ${orders.lineTotal} </td>
                                        <td>  ${orders.products.productModel} </td>
                                        <td>  ${orders.services.serviceName} </td>
                                        <td>  ${orders.customer.firstName} </td>
                                        <td>  ${orders.employee.firstName} </td>
                                        <td><a href="editOrder-${orders.id}">Edit</a></td>
                                        <td><a href="deleteOrder-${orders.id}">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </table>

                        </div>
                    </div>
                </div>
        </div>
    </div>
</div>
<script src="/JS/cities.js"></script>
<script src="/JS/date.js"></script>
<br><%@include file="../template/footer.jsp" %>
