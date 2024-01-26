<form action="{{ route('home.update',$datum->id) }}" method="POST">
       @method('put')
    @csrf
  <div class="form-group">
    <label for="title">Title</label>
    <input type="text" value="{{ $datum->title }}" class="form-control" name="title" >
  </div>
  <div class="form-group">
    <label for="subtitle">Subtitle</label>
    <input type="text" class="form-control" value="{{ $datum->subtitle }}" name="subtitle">
  </div>
  <div class="form-group">
    <label for="descriptin">Description</label>
    <input type="text" class="form-control" value="{{ $datum->description }}" name="description">
  </div>

  <input type="submit" value="submit">


</form>
