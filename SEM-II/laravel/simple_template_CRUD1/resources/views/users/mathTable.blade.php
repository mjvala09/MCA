@extends('layout.index')
@section('maindato')
@for ($i = 1;$i <= 10; $i++)
    {{ $no }}{{ "X" }}{{ $i }}{{ "=" }}{{ $no * $i }} <br/>
@endfor
@endsection
