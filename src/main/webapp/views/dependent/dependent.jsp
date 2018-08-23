<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-left">
                        <sf:form action="saveDependent" method="post" modelAttribute="dependent" class="fancy-form">
                            <legend>Dependent</legend>
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
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <p>
                                <button class="btn btn-primary " type="submit">Save</button>
                                <a class="btn btn-primary" href="stores" role="button">Back</a>
                            </p>
                        </sf:form>
                        <table class="table table-hover">
                            <tr>
                                <th>FirstName</th>
                                <th>MiddleName</th>
                                <th>LastName</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Zip</th>
                                <th>Email</th>
                                <th>Phone Number</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${dependent}" var="dependent">
                                <tr>
                                    <td> ${dependent.firstName} </td>
                                    <td> ${dependent.middleName} </td>
                                    <td> ${dependent.lastName} </td>
                                    <td> ${dependent.address} </td>
                                    <td> ${dependent.city} </td>
                                    <td> ${dependent.state} </td>
                                    <td> ${dependent.zip} </td>
                                    <td> ${dependent.email} </td>
                                    <td> ${dependent.phoneNumber} </td>
                                    <td><a href="editDependent-${dependent.id}">Edit</a></td>
                                    <td><a href="deleteDependent-${dependent.id}">Delete</a></td>
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
