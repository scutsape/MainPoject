<%@include file="../template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/city.css">
    <sf:form action="editEmployee" method="post" modelAttribute="employee" class="fancy-form">
        <sf:input path="id" type="hidden"/>
        <sf:input path="username"/>
        <sf:input path="password"/>
        <sf:input path="firstName"/>
        <sf:input path="middleName"/>
        <sf:input path="lastName"/>
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
        <sf:input path="birthDate" id="date"/>
        <sf:input path="ssn" />
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
        <sf:input path="email" />
        <sf:input path="phoneNumber" />
        <sf:input path="startDay" id="startDate" />
        <sf:select path="department" id="department" class="form-control">
            <c:forEach items="${department}" var="department">
                <sf:option value="${department.id}">${department.name}</sf:option>
            </c:forEach>
        </sf:select>

        <sf:select path="store"  >
            <c:forEach items="${stores}" var="store">
                <sf:option value="${store.id}">${store.name}</sf:option>
            </c:forEach>
        </sf:select>

        <sf:select path="dependent" id="dependent" class="form-control">
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
<script src="/JS/date.js"></script>
<script src="/JS/cities.js"></script>
<%@include file="../template/footer.jsp" %>