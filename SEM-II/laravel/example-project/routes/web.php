<?php

use App\Http\Controllers\ProductController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PostController;
use App\Http\Controllers\Relationships;

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
//      one to one
Route::get('/oneToOne',[Relationships::class, 'oneToOne'])->name('onetoone');
//      one to many
Route::get('/oneToMany', [Relationships::class, 'oneToMany'])->name('onetomany');
//      group to client
Route::get('/groupToClient', [Relationships::class, 'groupToClient'])->name('groupToClient');


Route::resource('/blog',ProductController::class);
Route::get('/randomData', [ProductController::class, 'randomData'])->name('blog.randomData');

Route::resource('/post', PostController::class);
