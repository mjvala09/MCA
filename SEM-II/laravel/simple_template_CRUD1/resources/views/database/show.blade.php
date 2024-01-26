@extends('layout.index')
@section('maindato')
    <table>
        <tr>
            <td><h1>{{ $data->id }}</h1></td>
            <td></td>
        </tr>
        <tr>
            <td><b>Title: </b></td>
            <td>{{ $data->title }}</td>
        </tr>
        <tr>
            <td><b>Sentence: </b></td>
            <td>{{ $data->sentence }}</td>
        </tr>
        <tr>
            <td><b>Paragraph: </b></td>
            <td>{{ $data->paragraph }}</td>
        </tr>
        <tr>
            <td><b>Created: </b></td>
            <td>{{ $data->created_at }}</td>
        </tr>
        <tr>
            <td><b>Updated: </b></td>
            <td>{{ $data->updated_at }}</td>
        </tr>
    </table>
@endsection
