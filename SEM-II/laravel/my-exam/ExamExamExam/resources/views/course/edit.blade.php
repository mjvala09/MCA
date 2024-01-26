<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <form action="{{ route('student.update',$item->id) }}" method="POST">
        @method('put')
        @csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">NAME : </label>
            <input type="text" value="{{ $item->name }}" class="form-control" id="exampleFormControlInput1" name="name" placeholder="Enter name">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">CONTACT : </label>
            <input type="number" value="{{ $item->contact }}" class="form-control" id="exampleFormControlInput1" name="contact" placeholder="Enter contact">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">COURSE : </label>
            <input type="text" value="{{ $item->course }}" class="form-control" id="exampleFormControlInput1" name="course" placeholder="Enter course">
        </div>

        <input type="submit" class="btn btn-sm btn-info " value="UPDATE">

    </form>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>
