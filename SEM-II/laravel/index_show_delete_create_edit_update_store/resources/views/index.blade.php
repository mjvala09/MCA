@extends('users.index')
@section('maindato')

{{-- add button into index file to add records in DATABASE --}}
<form action="{{ Route('home.create') }}" method="get">
    <input type="submit" class="btn btn-success btn-sm" value="Add New.">
</form>

    @foreach ($data as $datum)
        <div class="post-preview">
            <a href="{{ Route('home.show', [$datum->id]) }}">
                <h2 class="post-title">{{ $datum->id }}</h2>
                <h3 class="post-subtitle"> {{ $datum->title }} </h3>
            </a>
            <p class="post-meta">
                Posted by
                <a href="#!">Start Bootstrap</a>
                on September 24, 2022
            </p>
            <form action="{{ Route('home.edit', [$datum->id]) }}" method="get">
                @csrf
                <input type="submit" class="btn btn-info btn-sm" value="Edit">
            </form>
            <form action="{{ Route('home.destroy', [$datum->id]) }}" method="post">
                @method('delete')
                @csrf
                <input type="delete" class="btn btn-danger btn-sm" value="Delete">
            </form>
        </div>
    @endforeach
@endsection
