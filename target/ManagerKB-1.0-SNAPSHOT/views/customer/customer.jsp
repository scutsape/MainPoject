<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-left">
                        <sf:form action="saveCustomer" method="post" modelAttribute="custom" class="fancy-form">
                            <legend>Customer</legend>
                                    <sf:select path="type" id="type"  class="form-control" >
                                        <option value="Select">Type</option>
                                        <option value="Company">Company</option>
                                        <option value="Customer">Customer</option>
                                        <option value="Builder">Builder</option>
                                    </sf:select>
                                    <input type="text" name="firstName" id="firstName" class="form-control" placeholder="FirstName" >
                                    <input type="text" name="middleName" id="middleName" class="form-control" placeholder="MiddleName">
                                    <input type="text" name="lastName" id="lastName" class="form-control" placeholder="LastName">
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
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email">
                                    <input type="tel" name="phoneNumber" id="phoneNumber" class="form-control" placeholder="Phone Number">
                            <legend>Credit</legend>
                                    <input type="number" name="creditRating" id="creditRating" class="form-control" placeholder="Credit Rating">
                                    <input type="text" name="startDate" id="startDate" class="form-control" placeholder="Start Date">
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <div class="text-centre">
                                <p>
                                    <button class="btn btn-primary " type="submit">Save</button>
                                    <a class="btn btn-primary" href="welcome" role="button">Back</a>
                                </p>
                            </div>
                            </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>Type</th>
                                <th>FirstName</th>
                                <th>MiddleName</th>
                                <th>LastName</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Zip</th>
                                <th>Email</th>
                                <th>Phone Number</th>
                                <th>Credit Rating</th>
                                <th>Start Date</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${cust}" var="customer">
                                <tr>
                                    <td> ${customer.type} </td>
                                    <td> ${customer.firstName} </td>
                                    <td> ${customer.middleName} </td>
                                    <td> ${customer.lastName} </td>
                                    <td> ${customer.address} </td>
                                    <td> ${customer.city} </td>
                                    <td> ${customer.state} </td>
                                    <td> ${customer.zip} </td>
                                    <td> ${customer.email} </td>
                                    <td> ${customer.phoneNumber} </td>
                                    <td> ${customer.creditRating} </td>
                                    <td> ${customer.startDate} </td>
                                    <td><a href="editCustomer-${customer.id}">Edit</a></td>
                                    <td><a href="deleteCustomer-${customer.id}">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
            </div>
        </div>
    </div>
</div>
<script src="/JS/cities.js"></script>
<script src="/JS/date.js"></script>
<br><%@include file="../template/footer.jsp" %>
