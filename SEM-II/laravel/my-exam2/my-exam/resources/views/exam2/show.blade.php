@extends('test.testpage')

@section('content')
    {{-- <div class="col-sm-7"> --}}
        <div class="col">
            <div class="card">

                <div class="card-body">
                    <!-- 1. The <iframe> (and video player) will replace this <div> tag. -->
    <div id="player"></div>

    <script>
      // 2. This code loads the IFrame Player API code asynchronously.
      var tag = document.createElement('script');

      tag.src = "https://www.youtube.com/iframe_api";
      var firstScriptTag = document.getElementsByTagName('script')[0];
      firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

      // 3. This function creates an <iframe> (and YouTube player)
      //    after the API code downloads.
      var player;
      function onYouTubeIframeAPIReady() {
        player = new YT.Player('player', {
          height: '390',
          width: '400',
          videoId: 'M7lc1UVf-VE',
          playerVars: {
            'playsinline': 1
          },
          events: {
            'onReady': onPlayerReady,
            'onStateChange': onPlayerStateChange
          }
        });
      }

      // 4. The API will call this function when the video player is ready.
      function onPlayerReady(event) {
        event.target.playVideo();
      }

      // 5. The API calls this function when the player's state changes.
      //    The function indicates that when playing a video (state=1),
      //    the player should play for six seconds and then stop.
      var done = false;
      function onPlayerStateChange(event) {
        if (event.data == YT.PlayerState.PLAYING && !done) {
          setTimeout(stopVideo, 6000);
          done = true;
        }
      }
      function stopVideo() {
        player.stopVideo();
      }
    </script>
                <h5 class="card-title">
                    <a href="{{ route('exam.show', $datum->id) }}">{{ $datum->name }}</a>
                </h5>
                <p class="card-text">{{ Str::substr($datum->content, 0, 20) }}</p>
                <form action="{{ route('exam.destroy', $datum->id) }}" method="post">
                @method('delete')
                @csrf
                    <a href="{{ route('exam.edit',$datum->id) }}" class="btn btn-outline-warning">EDIT</a>
                    <input class="btn btn-outline-danger" type="submit" value="DELETE">
                </form>
            </div>
            </div>
            {{-- <iframe src="https://www.youtube-nocookie.com/embed/YeFl2WvB8NY"></iframe> --}}

        </div>
    {{-- </div> --}}
@endsection
