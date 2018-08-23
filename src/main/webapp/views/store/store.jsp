<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-left">
                            <sf:form action="saveStore" method="post" modelAttribute="store" class="fancy-form">
                                <legend>Work place</legend>
                                    <input type="text" name="name" id="name" class="form-control"placeholder="Work Place">

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
                                    <input type="tel" name="phone" id="phone" class="form-control" placeholder="Phone Number">
                                    <input type="tel" name="fax" id="fax" class="form-control" placeholder="Fax Number">
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email">
                                <p>
                                    <button class="btn btn-primary " type="submit">Save</button>
                                    <a class="btn btn-primary" href="welcome" role="button">Back</a>
                                </p>
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                            </sf:form>

                            <table class="table table-hover">
                                <tr>
                                    <th>Name</th>
                                    <th>Address</th>
                                    <th>City</th>
                                    <th>State</th>
                                    <th>Zip Code</th>
                                    <th>Phone</th>
                                    <th>Fax</th>
                                    <th>Email</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                <c:forEach items="${store}" var="store">
                                    <tr>
                                        <td> ${store.name} </td>
                                        <td> ${store.address} </td>
                                        <td> ${store.city} </td>
                                        <td> ${store.state} </td>
                                        <td> ${store.zip} </td>
                                        <td> ${store.phone} </td>
                                        <td> ${store.fax} </td>
                                        <td> ${store.email} </td>
                                        <td><a href="editStore-${store.id}">Edit</a></td>
                                        <td><a href="deleteStore-${store.id}">Delete</a></td>
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

<%@include file="../template/footer.jsp" %>

