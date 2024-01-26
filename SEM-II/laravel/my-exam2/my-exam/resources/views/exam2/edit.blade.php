@extends('test.testpage')
@section('content')
    <form action="{{ route("exam.update", $datum->id) }}" method="post">
    @method('put')
    @csrf
        <label for="name">Name : </label>
        <input name="name" class="form-control" value="{{ $datum->name }}" type="text">
        <label for="url">URL : </label>
        <input name="url" class="form-control" value="{{ $datum->url }}" type="text">
        <label for="content">Content : </label>
        <input name="content" class="form-control" value="{{ $datum->content }}" type="text"><hr>
        <div class="row">
            <input class="col-sm-5 btn btn-outline-success" type="submit" value="SUBMIT">
            <input class="btn btn-outline-warning col-sm-5" type="reset" value="RESET">
            <a href="{{ route('exam.index') }}" class="btn btn-outline-danger col-sm-2">CANCEL</a>
        </div>
    </form>
@endsection
