@extends('test.testpage')

@section('content')
<a href="{{ route('exam.create') }}" class="btn btn-success">CREATE</a>
    <div class="row row-cols-1 row-cols-md-3 g-4">
    @foreach ($data as $datum)
        <div class="col">
            <div class="card">
            <img src="https://picsum.photos/id/{{ $datum->id }}/200/100" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">
                    <a href="{{ route('exam.show', $datum->id) }}">{{ $datum->name }}</a>
                </h5>
                <p class="card-text">{{ Str::substr($datum->content, 0, 20) }}</p>
                <form action="{{ route('exam.deleteTrashedDeto', $datum->id) }}" method="post">
                @method('delete')
                @csrf
                    <a href="{{ route('exam.edit',$datum->id) }}" class="btn btn-outline-warning">EDIT</a>
                    <input class="btn btn-outline-danger" type="submit" value="DELETE">
                </form>

            </div>
            </div>
        </div>

    @endforeach
    </div>
@endsection
