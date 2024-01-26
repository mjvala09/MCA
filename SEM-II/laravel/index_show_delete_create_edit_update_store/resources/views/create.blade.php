@extends('users.index');

@section('maindato')
<h1>Add new Record...</h1>
<form action="{{ Route('home.store') }}" method="post">
    @method('post')
    @csrf
    <div class="mb-3">
        <label for="title" class="form-label">title : </label>
        <input type="text" class="form-control" name="title">
    </div>
    <div class="mb-3">
        <label for="sentence" class="form-label">sentence : </label>
        <input type="text" class="form-control" name="sentence">
    </div>
    <div class="mb-3">
        <label for="sentence" class="form-label">paragraph : </label>
        <input type="text" class="form-control" name="paragraph">
    </div>
    <div class="mb-3">
        <button type="submit" class="btn btn-info btn-sm">Add Post.</button>
        <button type="reset" class="btn btn-warning btn-sm">Reset All.</button>
    </div>
</form>
@endsection
