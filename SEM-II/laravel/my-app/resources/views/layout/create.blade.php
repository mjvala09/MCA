<form action="{{ route('home.store') }}" method="POST">
       @method('post')
    @csrf
  <div class="form-group">
    <label for="title">Title</label>
    <input type="text" class="form-control" name="title" >
  </div>
  <div class="form-group">
    <label for="subtitle">Subtitle</label>
    <input type="text" class="form-control" name="subtitle">
  </div>
  <div class="form-group">
    <label for="descriptin">Description</label>
    <input type="text" class="form-control" name="description">
  </div>

  <input type="submit" value="submit">


</form>
