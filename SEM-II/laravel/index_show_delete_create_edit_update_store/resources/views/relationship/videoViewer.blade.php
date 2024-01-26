@extends('users.index')
@section('maindato')
    <h1>hi hello</h1>
    <ul>
    @foreach($videos as $video)
        <li><a href="{{ route('videos.show',$video->id) }}">{{ $video->title }}</a></li>
    @endforeach
    </ul>
@endsection
