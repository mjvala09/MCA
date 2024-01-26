@extends('users.index')
@section('maindato')
    <h1>hi hello</h1>
    <ul>
            <iframe width="560" height="100" src="https://www.youtube.com/embed/{{ $myvideo->url}}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
    </ul>
    <hr>
    <form action="{{ route('comment.store') }}" method="post">
        @csrf
        <textarea name="comments" id="" cols="30" rows="10"></textarea>
        <input type="hidden" name="commentable_type" value="App\Models\Video">
        <input type="hidden" name="commentable_id" value="{{ $myvideo->id }}">
        <input type="submit" value="submmit">
    </form>

    <ol>
    @foreach($com as $c)
        <li>{{ $c->comments }}</li>
    @endforeach
    </ol>
@endsection
