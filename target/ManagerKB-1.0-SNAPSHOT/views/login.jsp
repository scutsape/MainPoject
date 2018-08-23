<%@include file="template/header.jsp" %>
<link rel="stylesheet" href="/STYLE/login.css">
<div class="container">
    <div class="row">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <img src="/IMAGE/logo.png" alt="Logo" class="logo">
                            <sf:form action="login" method="post" modelAttribute="log" class="form-signin">
                                <div class="form-group">
                                    <input type="text" name="username" placeholder="Employee ID" autofocus="true" class="form-control">
                                    <input type="password" name="password" placeholder="Password" class="form-control">
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                                    <h4 class="text-left"><a href="lostPassword">Forgot your password?</a></h4>
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                </div>
                            </sf:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>





