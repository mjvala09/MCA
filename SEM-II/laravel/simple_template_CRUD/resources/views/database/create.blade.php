@extends('layout.index')

@section('maindato')
        {{-- <ul>
            @if ($errors->any())
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            @endif
        </ul> --}}

        <div class="container">
            <form action="{{ Route('post.store') }}" method="post">
                @method('post')
                @csrf
                <div class="mb-3">
                    <label for="title" class="form-label">title : </label>
                    <input type="text" class="form-control" name="title">
                    <span class="text-danger">@error('title') {{ $message }} @enderror</span>
                </div>
                <div class="mb-3">
                    <label for="sentence" class="form-label">sentence : </label>
                    <input type="text" class="form-control" name="sentence">
                    <span class="text-danger">@error('sentence') {{ $message }} @enderror</span>
                </div>
                <div class="mb-3">
                    <label for="paragraph" class="form-label">paragraph : </label>
                    <input type="text" class="form-control" name="paragraph">
                    <span class="text-danger">@error('paragraph') {{ $message }} @enderror</span>
                </div>
                <div class="mb-3">
                    <button type="submit" class="btn btn-info btn-sm">ADD RECORD</button>
                    <button type="reset" class="btn btn-warning btn-sm">RESET</button>
                </div>
            </form>
        </div>
@endsection
