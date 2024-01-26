<!DOCTYPE html>
<html lang="en">
    <head>
        @include('users.metatags')
        <title>Clean Blog - Start Bootstrap Theme</title>
    </head>
    <body>
        @include('users.navigation')
        @include('users.pageheader')
        @include('users.mainpage')
        @include('users.footer')

        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src=" {{url('js/scripts.js')}} "></script>
    </body>
</html>
