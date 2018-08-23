<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@include file="template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/menu.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="text-center">
                        <div class="imgcontainer">
                            <img src="/IMAGE/logo.png" alt="Logo" class="logo">
                        </div>
                        <div class="menu">
                            <div class="icon-close"> <a>CLOSE</a></div>
                            <ul>
                                <li><a  href="customer" >Customer</a></li>
                                <li><a  href="employee" >Employee</a></li>
                                <li><a  href="store" >Store</a></li>
                                <li><a  href="department" >Department</a></li>
                                <li><a  href="order" >Order</a></li>
                                <li><a  href="product" >Product</a></li>
                                <li><a  href="service" >Service</a></li>
                                <li><a  href="categorie" >Categorie</a></li>
                            </ul>
                        </div>
                            <div class="text-right">
                            <sec:authorize access="isAuthenticated()"> <h1>${principal}</h1>
                                 <form action="/logout" method="post">
                                    <input type="submit" value="LogOut" name="" id="" class="btn btn-primary">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                </form>
                            </sec:authorize>
                        </div>
                        <div class="text-left">
                            <div class="icon-menu"> <a><h5>MENU</h5></a> </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/JS/menu.js"></script>

<%@include file="template/footer.jsp" %>