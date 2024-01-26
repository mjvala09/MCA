<?php

namespace App\Http\Controllers;

use App\Models\Post;
use Illuminate\Http\Request;

class PostControllerCopy extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $data = Post::orderBy('id','desc')->get();
        return view('crud.index', compact('data'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('crud.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $post = new Post();
        $post->title = $request->title;
        $post->subtitle = $request->subtitle;
        $post->content = $request->content;
        $post->save();
        return redirect(route('index'));
    }

    /**
     * Display the specified resource.
     */
    public function show($id)
    {
        $datum = Post::findOrFail($id);
        return view('crud.show', compact('datum'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($id)
    {
        $datum = Post::findOrFail($id);
        return view('crud.edit', compact('datum'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, $id)
    {
        $post = Post::findOrFail($id);
        $post->title = $request->title;
        $post->subtitle = $request->subtitle;
        $post->content = $request->content;
        $post->update();
        return redirect(route('index'));

    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $datum = Post::findOrFail($id);
        $datum->delete();
        return redirect(route('index'));
    }
}
