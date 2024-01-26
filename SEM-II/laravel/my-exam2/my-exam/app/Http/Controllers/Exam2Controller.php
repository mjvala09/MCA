<?php

namespace App\Http\Controllers;

use App\Models\Exam2;
use Illuminate\Http\Request;

class Exam2Controller extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $data = Exam2::get();
        return view('exam2.index', compact('data'));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view('exam2.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $table = new Exam2();
        $table->name = $request->name;
        $table->url = $request->url;
        $table->content = $request->content;
        $table->save();
        return redirect()->route('exam.index');
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Exam2  $exam2
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $datum = Exam2::find($id);
        return view('exam2.show', compact('datum'));
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Models\Exam2  $exam2
     * @return \Illuminate\Http\Response
     */
    public function edit(Exam2 $exam2, $id)
    {
        $datum = Exam2::find($id);
        return view('exam2.edit', compact('datum'));
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Exam2  $exam2
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Exam2 $exam2,$id)
    {
        $exam = Exam2::find($id);
        $exam->name = $request->name;
        $exam->url = $request->url;
        $exam->content = $request->content;
        $exam->update();
        return redirect(route('exam.index'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Exam2  $exam2
     * @return \Illuminate\Http\Response
     */
    public function destroy(Exam2 $exam2,$id)
    {
        Exam2::find($id)->delete();
        return \redirect(route('exam.index'));
    }
// =================================================================

    public function trashedDeto()
    {
        $data = Exam2::onlyTrashed()->get();
        return view('exam2.trashedDeto',\compact('data'));
    }
    public function deleteTrashedDeto($id)
    {
        // return $id;
        Exam2::onlyTrashed()->find($id)->forceDelete();
        return \redirect(route('exam.trashedDeto'));
    }


    public function random()
    {
        Exam2::factory()->create();
        return \redirect(route('exam.index'));
    }
    

}
