<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\MyController;
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
Route::get('/', function(){
    return view('users.index');
});

Route::get('/post/trash/trash', [MyController::class, 'trash'])->name('post.trash');
Route::get('/post/force/forcedelete{id}', [MyController::class, 'forcedelete'])->name('post.forcedelete');
Route::get('/post/restore/restore/{id}', [MyController::class, 'restore'])->name('post.restore');

Route::resource('/post', MyController::class);











// Route::get('/', function () {
//     return view('welcome');
// });
