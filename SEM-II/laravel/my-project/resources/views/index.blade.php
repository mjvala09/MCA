@extends('users.index')

@section('maindato')
    @foreach ($data as $datum)
        <div class="post-preview">
            <a href="home/{{$datum->id}}">
                <h2 class="post-title">{{ $datum->id }}</h2>
                <h3 class="post-subtitle"> {{ $datum->title }} </h3>
            </a>
            <p class="post-meta">
                Posted by
                <a href="#!">Start Bootstrap</a>
                on September 24, 2022
            </p>
        </div>
    @endforeach
@endsection
