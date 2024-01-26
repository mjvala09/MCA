@extends('template.index')
@section('content')
    <form action="{{ route('mypost.store') }}" method="post">
    @csrf
    @method('post')
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">title</label>
            <input name="title" type="text" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">subtitle</label>
            <input name="subtitle" type="text" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
        </div>
        <div class="mb-3">
                <textarea name="content" value="content" id="editor"  class="form-control" rows="3"></textarea>
        </div>
        <input class="btn btn-success" type="submit" value="SUBMIT">
    </form>
@endsection
