<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">

    <!-- JQuery -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"></script>
</head>
<body>

<!-- Section -->
<section class="mt-5">

    <h6 class="font-weight-bold text-center grey-text text-uppercase small mb-4">Welcome to</h6>
    <h3 class="font-weight-bold text-center dark-grey-text pb-2">Main Page</h3>
    <hr class="w-header my-4">
    <p class="lead text-center text-muted pt-2 mb-5">Nagivate to</p>


    <!-- Grid row -->
    <div class="gallery mb-5 row" id="gallery" style="display: flex; align-items: center; justify-content: center;">

        <!-- Grid column -->
        <div class="col-md-4 pics all 2 animation view overlay zoom" style="background-color: cornflowerblue;
        height: 200px; margin-right: 40px;">
                    <a href="logIn.jsp">
                        <div class="mask flex-center rgba-black-light">
                            <p class="white-text">Log In</p>
                        </div>
                    </a>
        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-md-4 pics animation all 1 view overlay zoom" style="background-color: cornflowerblue; height: 200px">
            <div class="img-fluid z-depth-1 rounded">
                <a href="registration.jsp">
                    <div class="mask flex-center rgba-black-light">
                        <p class="white-text">Register</p>
                    </div>
                </a>
            </div>
        </div>
        <!-- Grid column -->

    </div>
    <!-- Grid row -->

</section>
<!-- Section -->


</body>
</html>
