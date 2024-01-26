<?php

namespace App\Http\Controllers;

use App\Models\Product;
use Carbon\Factory;
use Illuminate\Http\Request;
use Database\Factories\ProductFactory;

class ProductController extends Controller
{
    public function randomData(){
        $p = Product::factory()->count(5)->create();
        return redirect()->route('blog.index');
    }
        /*
        Schema::create('members', function (Blueprint $table) {
            $table->id();
            $table->string('member_name');
            $table->unsignedBigInteger('group_id');
            $table->foreign('group_id')->references('group_id')->on('groups');
            $table->timestamps();
        });
*/














    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $data = Product::orderBy('id','desc')->get();
        // return $data;
        return view('product.index', compact('data'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('product.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $data = new Product();
        $data->id = $request->id;
        $data->user_id = \rand(1,10);
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
        $post = Product::findOrFail($blog);
        // return $data;
        return view('product.show', compact('post'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($blog)
    {
        $data = Product::findOrFail($blog);
        return view('product.edit', compact('data'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Product $blog)
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
    public function destroy(Product $Product, $blog)
    {
        $Product = Product::findOrFail($blog);
        $Product->delete();
        return redirect(route('blog.index'));
    }

}
