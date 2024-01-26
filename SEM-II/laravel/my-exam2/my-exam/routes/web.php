<?php

use App\Http\Controllers\Exam2Controller;
use App\Http\Controllers\MyDataController;
use Illuminate\Support\Facades\Route;

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

Route::get('/', function () {
    return view('welcome');
});

Route::get('/test', function (){
    return view('temp');
});
Route::get('/random', [Exam2Controller::class, 'random'])->name('exam.random');
Route::get('/trashed', [Exam2Controller::class, 'trashedDeto'])->name('exam.trashedDeto');
Route::delete('/trashed/delete/{id}', [Exam2Controller::class, 'deleteTrashedDeto'])->name('exam.deleteTrashedDeto');
Route::resource('/exam', Exam2Controller::class);
