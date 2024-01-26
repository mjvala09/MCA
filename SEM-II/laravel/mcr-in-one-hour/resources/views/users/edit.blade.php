@extends('template.index')
@section('content')
    <form action="{{ route('mypost.update', $data->id) }}" method="post">
    @csrf
    @method('put')
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">title</label>
            <input name="title" type="text" class="form-control" value="{{ $data->title }}" placeholder="name@example.com">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">subtitle</label>
            <input name="subtitle" type="text" class="form-control" value="{{ $data->subtitle }}" placeholder="name@example.com">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">content</label>
            <textarea name="content" id="editor" class="form-control" id="exampleFormControlTextarea1" rows="3">{{ $data->content }}</textarea>
        </div>
        <input class="btn btn-success" type="submit" value="SUBMIT">
    </form>
@endsection
