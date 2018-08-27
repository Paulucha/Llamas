<div class="container">
    <h3>
        Sign into Lama World:
    </h3>
    <div class="row">
        <div class="col"></div>
        <div class="col-6">
            <form method="post" action="/logLama" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="login">Lama login</label>
                    <input type="text" class="form-control form-control-sm"  name="login" placeholder="Enter login">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control form-control-sm" name="password" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary" >Sign in</button>
            </form>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="/">New around here? Sign up</a>
            <#--<a class="dropdown-item" href="#">Forgot password?</a>-->
        </div>
        <div class="col"></div>
    </div>
</div>