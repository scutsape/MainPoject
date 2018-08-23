<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-left">
                        <sf:form action="saveSupplier" method="post" modelAttribute="supplier" class="fancy-form">
                            <legend>Supplier</legend>
                                <input type="text" name="companyName" id="companyName" class="form-control" placeholder="Company" >
                                <input type="text" name="contactName" id="contactName" class="form-control" placeholder="Contact Name">
                                <input type="text" name="contactTitle" id="contactTitle" class="form-control" placeholder="Title">
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
                            <input type="tel" name="faxNumber" id="faxNumber" class="form-control" placeholder="Fax Number">
                            <input type="text" name="homePage" id="homePage" class="form-control" placeholder="Web Page">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <p>
                                <button class="btn btn-primary " type="submit">Save</button>
                                <a class="btn btn-primary" href="stores" role="button">Back</a>
                            </p>
                        </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>Company</th>
                                <th>Contact Name</th>
                                <th>Title</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Zip</th>
                                <th>Email</th>
                                <th>Phone </th>
                                <th>Fax</th>
                                <th>Web page</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${supplier}" var="supplier">
                                <tr>
                                    <td> ${supplier.companyName} </td>
                                    <td> ${supplier.contactName} </td>
                                    <td> ${supplier.contactTitle} </td>
                                    <td> ${supplier.address} </td>
                                    <td> ${supplier.city} </td>
                                    <td> ${supplier.state} </td>
                                    <td> ${supplier.zip} </td>
                                    <td> ${supplier.email} </td>
                                    <td> ${supplier.phoneNumber} </td>
                                    <td> ${supplier.faxNumber} </td>
                                    <td> ${supplier.homePage} </td>
                                    <td><a href="editSupplier-${supplier.id}">Edit</a></td>
                                    <td><a href="deleteSupplier-${supplier.id}">Delete</a></td>
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
<br><%@include file="../template/footer.jsp" %>
