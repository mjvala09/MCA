@extends('template.index')
@section('content')
<h3>TRASH Page...</h3>
<a href="{{ route('post.index') }}" class="btn btn-info">INDEX</a>
    @foreach ($data as $datum)

        <div class="post-preview">
            <h2 class="post-title">{{ $datum->title }}</h2>
            <h3 class="post-subtitle">{{ $datum->subtitle }}</h3>
            <p class="post-meta">
                <a href="{{ route('post.forcedelete',['id' => $datum->id]) }}" class="btn btn-danger">DELETE</a>
                <a href="{{ route('post.restore', ['id' => $datum->id]) }}" class="btn btn-warning">RESTORE</a>
            </p>
        </div>
        <!-- Divider-->
        <hr class="my-4" />
    @endforeach
@endsection
