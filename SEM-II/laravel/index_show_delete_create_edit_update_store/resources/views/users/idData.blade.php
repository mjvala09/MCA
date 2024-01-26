@extends('users.index')

@section('maindato')
        <div class="post-preview">
            <a href="post.html">
                <h2 class="post-title">{{ $data->id }}</h2>
                <h3 class="post-subtitle"> {{ $data->title }} </h3>
                <h4> {{ $data->sentence }} </h4>
                <h5>{{$data->paragraph}}</h5>
            </a>
            <p class="post-meta">
                Posted by
                <a href="#!">Start Bootstrap</a>
                on September 24, 2022
            </p>
        </div>
@endsection
