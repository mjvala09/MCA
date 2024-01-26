<?php

namespace App\Http\Controllers;

use App\Models\Mypost;
use Illuminate\Http\Request;

class MypostController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $data = Mypost::get();
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
        $mypost = new Mypost();
        $mypost->id = $request->id;
        $mypost->title = $request->title;
        $mypost->subtitle = $request->subtitle;
        $mypost->content = $request->content;
        $mypost->save();
        return redirect(route('mypost.index'));
    }

    /**
     * Display the specified resource.
     */
    public function show($id)
    {
        $data = Mypost::findOrFail($id);
        return view('users.show', compact('data'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($mypost)
    {
        $data = Mypost::findOrFail($mypost);
        return view('users.edit', compact('data'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, $id)
    {
        $mypost = Mypost::findOrFail($id);
        $mypost->id = $id;
        $mypost->title = $request->title;
        $mypost->subtitle = $request->subtitle;
        $mypost->content = $request->content;
        $mypost->update();
        return redirect(route('mypost.index'));
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $data = Mypost::findOrFail($id);
        $data->delete();
        return redirect(route('mypost.index'));
    }
}
