<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-left">
                    <sf:form action="saveEmployee" method="post" modelAttribute="emptyEmployee" class="fancy-form">
                        <legend>Employee ID Information</legend>
                            <input type="text" name="username" id="username" placeholder="Emploeey ID" class="form-control">
                            <input type="text" name="password" id="password" placeholder="Password" class="form-control">
                            <legend>Personal Information</legend>
                            <input type="text" name="firstName" id="firsname" placeholder="FirstName" class="form-control">
                            <input type="text" name="middleName" id="middleName" placeholder="MiddleName" class="form-control">
                            <input type="text" name="lastName" id="lastname" placeholder="Lastname" class="form-control">
                            <sf:select path= "maritalStatus" id= "maritalStatus"  class="form-control">
                                <option value="">Marital Status</option>
                                <option value="Single">Single</option>
                                <option value="Married ">Married </option>
                                <option value="Separated ">Separated </option>
                                <option value="Divorced ">Divorced </option>
                                <option value="Widowed">Widowed </option>
                            </sf:select>
                            <sf:select path="gender" id="gender"  class="form-control" >
                                <option value="">Gender</option>
                                <option value="Male">Male</option>
                                <option value="Married ">Femal</option>
                            </sf:select>
                            <input type="text" name="birthDate" id="date"  class="form-control" placeholder="BirthDate" />
                            <input type="number" name="ssn" id="ssn" placeholder="#SSN" class="form-control" >
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
                            <input type="tel" name="phoneNumber" id="phoneNumber" placeholder="Phone number" class="form-control">
                            <legend>Job Information</legend>
                            <input type="text" name="startDay" id="startDate" class="form-control" placeholder="Hire Date">
                            <sf:select path="department" id="department" class="form-control">
                                <sf:option value="Select">Department</sf:option>
                                <c:forEach items="${department}" var="department">
                                    <sf:option value="${department.id}">${department.name}</sf:option>
                                </c:forEach>
                            </sf:select>
                            <sf:select path="store" id="store" class="form-control">
                                <sf:option value="Select">Store</sf:option>
                                <c:forEach items="${stores}" var="store">
                                    <sf:option value="${store.id}">${store.name}</sf:option>
                                </c:forEach>
                            </sf:select>
                            <legend>Emergent person</legend>
                            <sf:select path="dependent" id="dependent" class="form-control">
                                <sf:option value="Select">Dependent</sf:option>
                                <c:forEach items="${dependent}" var="dependent">
                                    <sf:option value="${dependent.id}">${dependent.lastName}</sf:option>
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
                                <th>Username</th>
                                <th>Firstname</th>
                                <th>Lastname</th>
                                <th>BirthDate</th>
                                <th>Marital Status</th>
                                <th>Gender</th>
                                <th>#SSN</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Zip</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Store</th>
                                <th>Department</th>
                                <th>Dependent</th>
                                <th>Edit</th>
                                <th>Delete</th>
                            </tr>
                            <c:forEach items="${employee}" var="employee">
                                <tr>
                                    <td> ${employee.username} </td>
                                    <td> ${employee.firstName} </td>
                                    <td> ${employee.lastName} </td>
                                    <td> ${employee.birthDate} </td>
                                    <td> ${employee.maritalStatus} </td>
                                    <td> ${employee.gender} </td>
                                    <td> ${employee.ssn} </td>
                                    <td> ${employee.address} </td>
                                    <td>  ${employee.city} </td>
                                    <td>  ${employee.state} </td>
                                    <td>  ${employee.zip} </td>
                                    <td> ${employee.email} </td>
                                    <td> ${employee.phoneNumber} </td>
                                    <td>  ${employee.store.name} </td>
                                    <td>  ${employee.department.name} </td>
                                    <td>  ${employee.dependent.lastName} </td>
                                    <td><a href="editEmployee-${employee.id}">Edit</a></td>
                                    <td><a href="deleteEmployee-${employee.id}">Delete</a></td>
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
<br>
<%@include file="../template/footer.jsp" %>



