<?php

namespace App\Http\Controllers;

use App\Models\one_hour;
use Illuminate\Http\Request;

class OneHourController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $data = one_hour::get();
        // return $data;
        return view('users.index', compact('data'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('users.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $data = new one_hour();
        $data->id = $request->id;
        $data->title = $request->title;
        $data->subtitle = $request->subtitle;
        $data->content = $request->content;
        $data->save();
        return redirect(route('blog.index'));
    }

    /**
     * Display the specified resource.
     */
    public function show($blog)
    {
        $post = one_hour::findOrFail($blog);
        // return $data;
        return view('users.show', compact('post'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($blog)
    {
        $data = one_hour::findOrFail($blog);
        return view('users.edit', compact('data'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, one_hour $blog)
    {
        // return $request;

        $blog->title = $request->title;
        $blog->subtitle = $request->subtitle;
        $blog->content = $request->content;
        $blog->save();
        return redirect(route('blog.index'));

    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(one_hour $one_hour, $blog)
    {
        $one_hour = one_hour::findOrFail($blog);
        $one_hour->delete();
        return redirect(route('blog.index'));
    }
}
