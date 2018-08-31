<!doctype html>
<html lang="pl-PL">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Be Social Lama </title>
    <link rel="icon" href="https://cdn2.iconfinder.com/data/icons/animal-fill-icons-set/144/Alpaca-512.png">

</head>
<body>

<!-- Header -->
<section>
    <div class="container">

        <div class="row align-items-center" style="margin-top: 40px">
            <div class="col">
                <h2>
                    Something went wrong.</h2><br>
                <br>
                <h3><#if statusCode??>Error: <em> ${statusCode}</em></#if>
                </h3><br>

                <h3><#if throwable??>Details: <em> ${throwable}</em></#if>
                </h3><br>
                <br>
                <h5>Sorry.</h5>
                <h4><a href="/"><i class="fa fa-home"></i>
                    Go home Lama!</a></h4>
                <br><br>
                <hr>
                Still an error occurs? <br>  <a
                    href="mailto:pauluchp@gmail.com"> Contact Us.</a>
            </div>
            <div class="col">
                <img src="../../styles/images/LnYCjvdR_400x400.jpg">
            </div>

        </div>
    </div>
    <div class="overlay"></div>
</section>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
<!-- Bootstrap Date-Picker Plugin -->
<script type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
</body>
</html>