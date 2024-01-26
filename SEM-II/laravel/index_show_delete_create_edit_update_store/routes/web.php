<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\RegistrationController;
use App\Http\Controllers\VideoController;
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
Route::get('/', function(){
    return '<h1>manoj project</h1>';
});
Route::get('/home', [HomeController::class, 'index'])->name('home.index');
// create form and store it in DATABASE
Route::get('/home/create', [HomeController::class, 'create'])->name('home.create');
Route::post('/home/store', [HomeController::class, 'store'])->name('home.store');
Route::get('/home/{id}', [HomeController::class, 'show'])->name('home.show');
Route::delete('/home/delete/{id}', [HomeController::class, 'destroy'])->name('home.destroy');
Route::get('/home/edit/{id}', [HomeController::class, 'edit'])->name('home.edit');
Route::put('/home/update{id}', [Homecontroller::class, 'update'])->name('home.update');

// not important :
// Route::get('/register', [RegistrationController::class, 'index'])->name('register.index');
// Route::post('/register', [RegistrationController::class, 'register'])->name('register.register');

Route::resource('/videos', VideoController::class);
Route::resource('/comment',\App\Http\Controllers\CommentsController::class);
