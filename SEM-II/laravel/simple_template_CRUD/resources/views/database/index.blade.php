@extends('layout.index')
@section('maindato')
    <a class="btn btn-sm btn-info" href="{{ Route('post.create') }}">NEW RECORD...</a><br><br><br><br>
        <table>
    @foreach ($data as $datum)
            <tr>
                <td><h1>{{ $datum->id }}</h1></td>
                <td>
                    <form action="{{ Route('post.delete', [$datum->id]) }}" method="post">
                        @csrf
                        @method('delete')
                        <button class="btn btn-danger btn-sm" type="submit">DELETE</button>
                    </form>
                </td>
            </tr>
            <tr>
                <td><h2>Title : <a href="{{ Route('post.show',[$datum->id]) }}">{{ $datum->title }}</a></h2></td>
                <td>
                    <form action="{{ Route('post.edit',[$datum->id]) }}" method="post">
                        @csrf
                        @method('post')
                        <button class="btn btn-warning btn-sm" type="submit">UPDATE</button>
                    </form>
                </td>
            </tr>
            <tr>
                <td><h3>Created : {{ $datum->created_at }}</h3></td>
                <td></td>
            </tr>
            <tr>
                <td><h3>Updated : {{ $datum->updated_at }}</h3></td>
                <td></td>
            </tr>
            <tr>
                <td><h1>----------------------------------</h1></td>
            </tr>
    @endforeach
        </table>
@endsection
