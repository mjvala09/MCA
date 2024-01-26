{{-- {{ $collection }} --}}

@foreach($collection as $item)
    <a href="{{ route('student.show', ['student' => $item->id]) }}">
        <h1>{{ $item->id }}
        {{ $item->name }}</h1>
    </a>

        {{ $item->contact }}
        {{ $item->course }}
    <a href="{{ route('student.edit',$item->id) }}" class="btn btn-sm btn-warning">EDIT ME</a>

@endforeach
