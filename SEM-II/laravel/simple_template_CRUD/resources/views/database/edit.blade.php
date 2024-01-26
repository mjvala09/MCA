@extends('layout.index')

@section('maindato')
    <form action="{{ Route('post.update', [$data->id]) }}" method="post">
    @method('put')
    @csrf
        <div class="mb-3">
            <label class="form-label" for="title">Title : </label>
            <input class="form-control" type="text" name="title" value="{{ $data->title }}">

        </div>
        <div class="mb-3">
            <label class="label" for="sentence">Sentence : </label>
            <input class="form-control" type="text" name="sentence" value="{{ $data->sentence }}">
        </div>
        <div class="mb-3">
            <label class="label" for="paragraph">Paragraph : </label>
            <textarea class="form-control" type="text" name="paragraph">{{ $data->paragraph }}</textarea>
        </div>
        <div class="mb-3">
            <input type="submit" class="btn btn-success btn-sm" value="UPDATE">
            <input type="reset" class="btn btn-warning btn-sm" value="RESET">
        </div>
    </form>
</div>
@endsection
