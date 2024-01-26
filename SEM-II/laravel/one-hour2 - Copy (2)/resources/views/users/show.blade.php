@extends('template.index')
@section('content')

    <div class="post-preview">
        <a href="{{ route('post.index') }}">
            <h2 class="post-title">{{ $datum->id }} {{ $datum->title }}</h2>
            <h3 class="post-subtitle">{{ $datum->subtitle }}</h3>
        </a>
        <p class="post-meta">
            {!! $datum->content !!}
            created : {{ $datum->created_at }}
            updated : {{ $datum->updated_at }}
        </p>
    </div>
    <!-- Divider-->
    <hr class="my-4" />

@endsection
