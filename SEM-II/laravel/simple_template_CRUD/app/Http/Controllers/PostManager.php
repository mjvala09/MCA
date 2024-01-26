<?php
// CRUD controller[  index()  show()  delete()  destroy()  create()  edit()  update()  ]
namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\post;

class PostManager extends Controller
{
    public function index(){
        $data = Post::get();
        // return $data;
        return view('database.index', compact('data'));
    }
    public function show($id){
        $data = Post::findOrFail($id);
        // return $data;
        return view('database.show', compact('data'));
    }
    public function create(){
        return view('database.create');
    }
    public function store(Request $request){
        $request->validate([
            "title" => "required",
            "sentence" => "required",
            "paragraph" => "required"
        ]);
        return $request;
        $post = new Post();
        $post->id = $request->id;
        $post->title = $request->title;
        $post->sentence = $request->sentence;
        $post->paragraph = $request->paragraph;
        $post->save();
        return redirect(Route('post.show', [$post->id]));
    }
    public function edit($id){
        $data = Post::findOrFail($id);
        return  view('database.edit', compact('data'));
    }
    public function update(Request $request, $id){
        $post = Post::findOrFail($id);
        $post->id = $request->id;
        $post->title = $request->title;
        $post->sentence = $request->sentence;
        $post->paragraph = $request->paragraph;
        $post->update();
        return redirect(Route('post.show', [$post->id]));
    }
    public function destroy($id){
        $data = Post::findOrFail($id);
        $data->delete();
        return redirect(Route('post.index'));
    }
}
