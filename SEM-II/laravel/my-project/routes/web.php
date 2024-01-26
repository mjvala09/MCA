<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\HomeController;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/
// Route::middleware('throttle:50,1')->prefix('db')->group(function(){
//     Route::get('/home', [HomeController::class, 'index'])->name('home.index');
//     Route::get('/home/{id}', [HomeController::class, 'show'])->name('home.index.id');
// });
Route::get('/home/index', [HomeController::class, 'index'])->name('home.index.register');
Route::post('/home/store', [HomeController::class, 'store'])->name('home.store');
