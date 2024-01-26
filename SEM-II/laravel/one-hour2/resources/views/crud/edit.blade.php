@extends('template.index')
@section('content')

    <form action="{{ url(route('update', $datum->id)) }}" method="post">
    @csrf
    @method('put')
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">title</label>
            <input type="text" name="title" value="{{ $datum->title }}" class="form-control" id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">subtitle</label>
            <input type="text" name="subtitle" value="{{ $datum->subtitle }}" class="form-control" id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">content</label>
            <textarea class="form-control" name="content" id="editor" rows="3">{{ $datum->content }}"</textarea>
        </div>
        <input type="submit" value="SUBMIT" class="btn btn-success">
        <input type="reset" value="RESET" class="btn btn-warning">
    </form>
@endsection
