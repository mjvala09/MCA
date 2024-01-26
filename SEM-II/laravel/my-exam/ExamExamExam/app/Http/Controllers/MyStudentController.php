<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Student;
class MyStudentController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $collection = Student::get();
        return view('course.index', compact('collection'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('course.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $s = new Student();
        $s->name = $request->name;
        $s->contact = $request->contact;
        $s->course = $request->course;
        $s->save();
        return redirect()->route('student.index');
        // return redirect(route('student.index'));
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        $item = Student::findOrFail($id);
        return view('course.show', compact('item'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        $item = Student::findOrFail($id);
        return view('course.edit', compact('item'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        $s = Student::findOrFail($id);
        $s->name = $request->name;
        $s->contact = $request->contact;
        $s->course = $request->course;
        $s->update();
        return redirect()->route('student.index');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
