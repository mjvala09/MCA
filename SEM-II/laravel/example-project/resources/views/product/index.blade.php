@extends('template.index')
@section('maindeto')
<h1>Index Method...</h1>
<a class="btn btn-success" href="{{ route('blog.create') }}">ADD RECORDS...</a>
<a class="btn btn-info" href="{{ route('blog.randomData') }}">Generate Data</a><br><br>
    @foreach ($data as $datum)
        <!-- Post preview-->
        <div class="post-preview">
            <a href="{{ route('blog.show', $datum->id) }}">

                <h2 class="post-title">{{ $datum->id }}{{ $datum->title }}</h2><br>
                <img src='https://picsum.photos/id/{{ $datum->id }}/200/200' alt=""><br>
                <h3 class="post-subtitle">{{ $datum->subtitle }}</h3>
            </a>
            <p class="post-meta">
                <form action="{{ route('blog.destroy', $datum->id) }}" method="post">
                @csrf
                @method('delete')
                    <a href="{{ route('blog.edit', $datum->id) }}" class="btn btn-info"> EDIT </a>
                    <a href="{{ route('onetoone'}}" class="btn btn-info"> GROUP </a>
                    <input type="submit" value="DELETE" class="btn btn-danger">
                </form>
            </p>
        </div>
        <!-- Divider-->
        <hr class="my-4" />
    @endforeach
@endsection