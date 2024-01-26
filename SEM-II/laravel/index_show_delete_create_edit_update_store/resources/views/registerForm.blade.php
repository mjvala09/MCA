@extends('users.index')

@section('maindato')
    <form action="/register" method="post">
        @csrf
        <table>
            <tr>
                <td>Name : </td>
                <td><input type="text" name="name"></td>

            </tr>
            <tr>
                <td>Email : </td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>Confirm Password : </td>
                <td><input type="password" name="password_confirmation"></td>
            </tr>
            <tr>
                <td></td>
                <td><button>submit</button></td>
            </tr>
        </table>
    </form>
    @php
        echo "<pre>";
            print_r($request->all());
    @endphp
@endsection
