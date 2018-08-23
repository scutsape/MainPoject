<%@include file="template/header.jsp"%>
<link rel="stylesheet" href="/STYLE/login.css">

<hr>
<div class="container">
    <div class="row">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <h3><i class="fa fa-lock fa-4x"></i></h3>
                            <h2 class="text-center">Forgot Password?</h2>
                            <p>You can reset your password here.</p>
                            <div class="panel-body">
                                <sf:form action="sendEmail" method="post">
                                    <fieldset>
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                                <input id="email" placeholder="email address" class="form-control"  required="email" type="email">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input class="btn btn-lg btn-primary btn-block" value="Send My Password" type="submit">
                                        </div>
                                        <a class="btn btn-primary" href="login" role="button">Back</a>
                                    </fieldset>
                                </sf:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>