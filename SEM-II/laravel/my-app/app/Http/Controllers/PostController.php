<?php

namespace App\Http\Controllers;

use App\Models\Post;
use App\Models\User;
use Illuminate\Http\Request;

class PostController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $data = Post::orderBy('id','desc')->get();
        return \view('layout.main',\compact('data'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return \view('layout.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $post = new Post();
        $post->title = $request->title;
        $post->subtitle = $request->subtitle;
        $post->description = $request->description;
        $post->save();
        return redirect(route("home.index"));
    }

    /**
     * Display the specified resource.
     */
    public function show($id)
    {
        $datum = Post::find($id);
        return \view('layout.show',\compact('datum'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($id)
    {
        $datum = Post::find($id);
        return \view('layout.edit',\compact('datum'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request,$id)
    {

        $post = Post::find($id);
        $post->title = $request->title;
        $post->subtitle = $request->subtitle;
        $post->description = $request->description;
        $post->update();
        return redirect(route("home.index"));
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        Post::find($id)->delete();
        return \redirect(route("home.index"));
    }
}
