@extends('template.index')
@section('content')
<h3>INDEX Page...</h3>
    <!-- Post preview-->
    <div class="post-preview">
        <a href="{{ route('mypost.show', $data->id) }}">
            <h2 class="post-title">{{ $data->id }} {{ $data->title }}</h2>
        </a>
        <h3 class="post-subtitle"></h3>
        <p class="post-meta">
            <h6>{{ $data->subtitle }}</h6>
            {!! $data->content !!}
        </p>
    </div>
    <!-- Divider-->
    <hr class="my-4" />

@endsection
