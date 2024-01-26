<a href="{{ route('home.create')}}"><button class="btn btn-info">Create</button></a>

@foreach ($data as $datum)

<h1><a href="{{ route('home.show',$datum->id) }}">{{ $datum->title }}</a></h1>
<h1><a href="{{ route('home.edit',$datum->id) }}"><button>edit</button></a></h1>
<form action="{{ route('home.destroy',$datum->id) }}" method="post">
    @method('delete')
    @csrf
    <input type="submit" value="Delete">
</form>
<hr>
@endforeach
