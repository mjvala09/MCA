@extends('template.index')
@section('maindeto')
{{ $data }}
<table>
@foreach ($data as $clients)
    {{ $clients->getClient }}
    <tr>
    @foreach ($clients->getClient as $client)
        <td>{{ $client->client_name }}</td>
    @endforeach
    </tr>
@endforeach

@endsection
