@extends('template.index')
@section('content')
<h3>INDEX Page...</h3>
<a class="btn btn-info" href="{{ route('mypost.create') }}">ADD RECORD</a>
    @foreach ($data as $datum)
        <!-- Post preview-->
        <div class="post-preview">
            <a href="{{ route('mypost.show', $datum->id) }}">
                <h2 class="post-title">{{ $datum->id }} {{ $datum->title }}</h2>
            </a>
            <h3 class="post-subtitle"></h3>
            <p class="post-meta">


                <form action="{{ route('mypost.destroy', $datum->id) }}" method="post">
                @csrf
                @method('delete')
                    <a href="{{ route('mypost.edit', $datum->id) }}" class="btn btn-warning">EDIT !</a>
                    <input type="submit" value="DELETE !" class="btn btn-danger">
                </form>
            </p>
        </div>
        <!-- Divider-->
        <hr class="my-4" />
    @endforeach
@endsection
