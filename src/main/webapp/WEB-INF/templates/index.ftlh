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

    <#if message??>
        <h5>${message}</h5>
    </#if>
<div class="row bg-info">


    <div class="col" align="center"><img
            src="../../styles/images/Alpaca-512.png"
            width="100px"></div>
    <div class="col" align="center"><h1>Hello in Lama World</h1></div>
    <div class="col" align="center"><img
            src="../../styles/images/Alpaca-512.png"
            width="100px">
    </div>

</div>
<div class="row">
    <div class="col">
        <section class="content-section bg-light" id="signLama">
        <#include "logingForm.ftlh">
        </section>
    </div>
    <div class="col">
        <section class="content-section bg-light" id="addLama">
<#include "addLamaForm.ftlh">
        </section>
    </div>
    <div class="col">
        <section class="content-section bg-light" id="lamaList">
    <#include "lamaList.ftlh">
        </section>
    </div>

</div>

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