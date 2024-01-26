<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Models\User;
class MyController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        // $data = DB::table('posts')->orderBy('id', 'desc')->get();


        $data = User::orderBy('id','desc')->get();
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
        // DB::table('posts')->insert([
        //     'title' => $request->title,
        //     'subtitle' => $request->subtitle,
        //     'content' => $request->content
        // ]);


        $user = new User();
        $user->title = $request->title;
        $user->subtitle = $request->subtitle;
        $user->content = $request->content;
        $user->save();
        return redirect(route('post.index'));
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        // $datum = DB::table('posts')->find($id);


        $datum = User::find($id);
        // return $datum;
        return view('users.show', compact('datum'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        // $datum = DB::table('posts')->find($id);


        $datum = User::find($id);
        return view('users.edit', compact('datum'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        // DB::table('posts')
        //     ->where('id','=',$id)
        //     ->update([
        //         'title' => $request->title,
        //         'subtitle' => $request->subtitle,
        //         'content' => $request->content
        //     ]);


        $user = User::find($id);
        $user->title = $request->title;
        $user->subtitle = $request->subtitle;
        $user->content = $request->content;
        $user->update();
        return redirect(route('post.index'));
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        // DB::table('posts')->where('id','=',$id)->delete();
        User::find($id)->delete();
        return redirect(route('post.index'));
    }

    public function forcedelete($id){
        // $trashedItem = User::onlyTrashed()->find($id)->forceDelete();
        $trashedItem = User::onlyTrashed()->find($id);
        if(!is_null($trashedItem)){
            $trashedItem->forceDelete();
        }
        return redirect(route('post.trash'));
    }
    public function trash(){
        $data = User::onlyTrashed()->get();
        return view('users.trash',compact('data'));
    }
    public function restore($id){
        User::withTrashed()->find($id)->restore();
        return redirect(route('post.trash'));
    }
}
