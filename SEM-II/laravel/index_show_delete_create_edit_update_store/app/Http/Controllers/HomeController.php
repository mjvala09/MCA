<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Post;

class HomeController extends Controller
{
    public function index(){
        $data = post::get();
        // return $data;
        return view('index', compact('data'));
    }
    public function show($id){
        $data = post::find($id);
        // return $data;
        return view('users.idData', compact('data'));
    }
    public function create(){
        return view('create');
    }
    public function store(Request $request){
        // return $request;
        $post = new Post();
        $post->title = $request->title;
        $post->sentence = $request->sentence;
        $post->paragraph = $request->paragraph;
        $post->save();
        return redirect(Route('home.index'));
    }


    public function destroy($id){
        $data = post::find($id);
        // return $data;
        $data->delete();
        return redirect()->Route('home.index');
    }
    public function edit($id){
        $post = Post::find($id);
        // return $post;
        return view('edit', compact('post'));
    }
    public function update(Request $request, $id){
        $post = Post::find($id);
        $post->id = $id;
        $post->title = $request->title;
        $post->sentence = $request->sentence;
        $post->paragraph = $request->paragraph;
        $post->save();
        // return $post;
        return redirect(Route('home.show', [$post->id]));
    }
}
