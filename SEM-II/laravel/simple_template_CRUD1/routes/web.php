<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PostManager;
use App\Http\Controllers\SimpleRouting;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/welcome', function () {
    return view('welcome');
});

// simple ROUTING...
Route::get('/message', [SimpleRouting::class, 'index'])->name('message.index'); // 1) Simple message using class.
Route::get('/about', 'App\Http\Controllers\SimpleRouting@about')->name('about.about'); // 2) Simple message using class.
Route::get('/messagepass/{name}', [SimpleRouting::class, 'passingValue'])->name('message.passingValue'); // Simple passing value from URL.
Route::get('/messagedefault/{name?}', [SimpleRouting::class, 'defaultValue'])->name('message.defaultValue'); // default value on URL.
Route::get('/template', function(){
    return view('layout.index');
});
Route::get('/template/{no}', function($no){     // (@yield,@section,@endsection,@include,@extends,@for,@endfor).
    return view('users.mathTable', compact('no'));
});


// CRUD operation...
// PostManager controller[  index()  show()  delete()  destroy()  create()  edit()  update()  ]
Route::get('/post', [PostManager::class, 'index'])->name('post.index');
Route::get('/post/create', [PostManager::class, 'create'])->name('post.create');
Route::get('/post/{id}', [PostManager::class, 'show'])->name('post.show');
Route::post('/post', [PostManager::class, 'store'])->name('post.store');
Route::delete('/post/{id}', [PostManager::class, 'destroy'])->name('post.delete');
Route::post('/post/edit/{id}', [PostManager::class, 'edit'])->name('post.edit');
Route::put('/post/{id}', [PostManager::class, 'update'])->name('post.update');

// Route::resource('/post', PostManager::class);
