@extends('template.index')
@section('content')
<h3>INDEX Page...</h3>
<a href="{{ route('post.create') }}" class="btn btn-info">INSERT</a>
    @foreach ($data as $datum)

        <div class="post-preview">
            <a href="{{ route('post.show', $datum->id) }}">
                <h2 class="post-title">{{ $datum->id }} {{ $datum->title }}</h2>
                <h3 class="post-subtitle">{{ $datum->subtitle }}</h3>
            </a>
            <p class="post-meta">

                <a href="{{ route('post.edit', $datum->id) }}" class="btn btn-warning">EDIT !</a>
                <form action="{{ route('post.destroy', $datum->id) }}" method="post">
                    @csrf
                    @method('delete')
                    <input type="submit" value="DELETE !!!" class="btn btn-danger">
                </form>
            </p>
        </div>
        <!-- Divider-->
        <hr class="my-4" />

    @endforeach
@endsection
