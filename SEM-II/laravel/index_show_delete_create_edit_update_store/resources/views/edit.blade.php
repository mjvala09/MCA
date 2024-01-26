@extends('users.index');

@section('maindato')
<h1>Edit Record...</h1>
<form action="{{ Route('home.update', [$post->id]) }}" method="post">
    @method('put')
    @csrf
    <div class="mb-3">
        <label for="title" class="form-label">title : </label>
        <input type="text" class="form-control" name="title" value="{{ $post->title }}">
    </div>
    <div class="mb-3">
        <label for="sentence" class="form-label">sentence : </label>
        <input type="text" class="form-control" name="sentence" value="{{ $post->sentence }}">
    </div>
    <div class="mb-3">
        <label for="paragraph" class="form-label">paragraph : </label>
        <textarea class="form-control" name="paragraph" cols="30" rows="5" >
            {{ $post->paragraph }}
        </textarea>
    </div>
    <div class="mb-3">
        <button type="submit" class="btn btn-info btn-sm">Update Post.</button>
        <button type="reset" class="btn btn-warning btn-sm">Reset Post.</button>
    </div>
</form>
@endsection
