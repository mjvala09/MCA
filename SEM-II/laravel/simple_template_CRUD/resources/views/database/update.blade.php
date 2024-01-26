@extends('layout.index')

@section('maindato')
<div class="form-group">
    <form action="{{ Route('post.store') }}" method="post">
    @method('post')
    @csrf
        <table>
            <tr>
                <td><label class="label" for="title">Title : </label></td>
                <td><input class="form-control" type="text" name="title"></td>
            </tr>
            <tr>
                <td><label class="label" for="sentence">Sentence : </label></td>
                <td><input class="form-control" type="text" name="sentence"></td>
            </tr>
            <tr>
                <td><label class="label" for="paragraph">Paragraph : </label></td>
                <td><textarea class="form-control" type="text" name="paragraph"></textarea></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" class="btn btn-success btn-sm" value="ADD THIS">
                    <input type="reset" class="btn btn-warning btn-sm" value="RESET">
                </td>
            </tr>
        </table>
    </form>
</div>

@endsection
