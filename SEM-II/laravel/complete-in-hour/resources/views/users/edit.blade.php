@extends('template.index')

@section('maindeto')
<h1>Edit Page...</h1>
    <form action="{{ route('blog.update', $data->id) }}" method="post">
        @csrf
        @method('put')
        <div class="mb-3">
            <label for="title" class="form-label">title</label>
            <input type="text" value="{{ $data->title }}" class="form-control" name="title">
        </div>
        <div class="mb-3">
            <label for="subtitle" class="form-label">subtitle</label>
            <input type="text" value="{{ $data->subtitle }}" class="form-control" name="subtitle">
        </div>
        <div class="mb-3">
            <label for="content" class="form-label">Example textarea</label>
            <textarea class="form-control" name="content" rows="3">{{ $data->content }}</textarea>
        </div>
        <input type="submit" value=" UPDATE " class="btn btn-success">
        <input type="reset" value=" RESET " class="btn btn-warning">
    </form>
@endsection
