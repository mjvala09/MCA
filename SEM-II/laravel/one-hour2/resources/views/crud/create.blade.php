@extends('template.index')
@section('content')

    <form action="{{ url(route('store')) }}" method="post">
    @csrf
    @method('post')
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">title</label>
            <input type="text" name="title" class="form-control" id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">subtitle</label>
            <input type="text" name="subtitle" class="form-control" id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Age</label>
            <input type="number" name="age" class="form-control" id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">content</label>
            <textarea class="form-control" name="content" id="editor" rows="3"></textarea>
        </div>
        <input type="submit" value="SUBMIT" class="btn btn-success">
        <input type="reset" value="RESET" class="btn btn-warning">
    </form>
@endsection
