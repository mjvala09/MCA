@extends('template.index')
@section('maindeto')
<h1>Create Method...</h1>
    <form action="{{ route('blog.store') }}" method="post">
        @csrf
        @method('post')
        <div class="mb-3">
            <label for="title" class="form-label">title</label>
            <input type="text" class="form-control" name="title">
        </div>
        <div class="mb-3">
            <label for="subtitle" class="form-label">subtitle</label>
            <input type="text" class="form-control" name="subtitle">
        </div>
        <div class="mb-3">
            <label for="content" class="form-label">Example textarea</label>
            <textarea class="form-control" name="content" rows="3"></textarea>
        </div>
        <input type="submit" value=" ADD " class="btn btn-success">
        <input type="reset" value=" RESET " class="btn btn-warning">
    </form>
@endsection
