<div class="container">
    <div class="row">
        <div class="col"></div>
        <div class="col">
            <form method="post" action="/addLama" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="name">Lama name</label>
                    <input type="name" class="form-control" id="name" aria-describedby="nameHelp"
                           placeholder="Enter name">
                </div>
                <div class="form-group">
                    <label for="login">Lama login</label>
                    <input type="login" class="form-control" id="login" aria-describedby="loginHelp"
                           placeholder="Enter login">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" placeholder="Password">
                </div>
                <div class="form-group">
                    <label for="exampleFormControlFile1">Lama profile photo</label>
                    <input type="file" class="form-control-file" id="exampleFormControlFile1">
                </div>
                <div class="date form-group" data-provide="datepicker">
                    <label class="control-label" for="date">Date of birth<br></label><br>
                    <input type="text" class="form-control" placeholder="MM/DD/YYY">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-th"></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="bio">Bio</label>
                    <textarea class="form-control" id="bio" rows="3"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <script>
                $(document).ready(function () {
                    var date_input = $('input[name="date"]');
                    var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                    var options = {
                        format: 'mm/dd/yyyy',
                        container: container,
                        todayHighlight: true,
                        autoclose: true,
                    };
                    date_input.datepicker(options);
                })
            </script>
        </div>
        <div class="col"></div>
    </div>
</div>