@extends('template.index')
@section('maindeto')
<h1>Show Method...</h1>
    <!-- Post preview-->
    <div class="post-preview">
        <a href="{{ route('blog.show', $post->id) }}">
            <h2 class="post-title">{{ $post->id }}{{ $post->title }}</h2>
            <img src='https://picsum.photos/id/{{ $post->id }}/700/500' alt=""><br>
            <h3 class="post-subtitle">{{ $post->subtitle }}</h3>
            <h3>{{ $post->content }}</h3>
        </a>
        <p class="post-meta">
            {{ $post->created_at }}
            {{ $post->updated_at }}
        </p>
    </div>
    <!-- Divider-->
    <hr class="my-4" />
@endsection
