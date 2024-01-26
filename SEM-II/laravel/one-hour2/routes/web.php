<?php

use App\Http\Controllers\PostController;
use App\Http\Controllers\PostControllerCopy;
use Illuminate\Support\Facades\Route;
USE App\Http\Middleware\ageVerify;

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
// Route::resource('/post', PostController::class);
Route::get('error', function(){
    return view('crud.error404');
})->name('error');


Route::get('/index', [PostControllerCopy::class, 'index'])->name('index');
Route::post('/', [PostControllerCopy::class, 'store'])->name('store');
Route::get('/create', [PostControllerCopy::class, 'create'])->name('create');
Route::get('/{blog}', [PostControllerCopy::class, 'show'])->name('show');
Route::put('/{blog}', [PostControllerCopy::class, 'update'])->name('update');
Route::delete('/{blog}', [PostControllerCopy::class, 'destroy'])->name('destroy');
Route::get('/{blog}/edit', [PostControllerCopy::class, 'edit'])->name('edit');

/*
    GLOBAL MIDDLEWARE:Kernal.php

            //  * The application's global HTTP middleware stack.
            //  *
            //  * These middleware are run during every request to your application.
            //  *
            //  * @var array<int, class-string|string>

            protected $middleware = [
                // \App\Http\Middleware\TrustHosts::class,
----->          \App\Http\Middleware\ageVerify::class,
                \App\Http\Middleware\TrustProxies::class,
                \Illuminate\Http\Middleware\HandleCors::class,
                \App\Http\Middleware\PreventRequestsDuringMaintenance::class,
                \Illuminate\Foundation\Http\Middleware\ValidatePostSize::class,
                \App\Http\Middleware\TrimStrings::class,
                \Illuminate\Foundation\Http\Middleware\ConvertEmptyStringsToNull::class,
            ];
*/

/*      route middleware
Route::middleware([ageVerify::class])->post('/', [PostControllerCopy::class, 'store'])->name('store');
Route::middleware('ageV')->post('/', [PostControllerCopy::class, 'store'])->name('store');
*/

/*      group middleware
Route::middleware(['ageV'])->group(function(){
    Route::get('/index', [PostControllerCopy::class, 'index'])->name('index');
    Route::post('/', [PostControllerCopy::class, 'store'])->name('store');
    Route::get('/create', [PostControllerCopy::class, 'create'])->name('create');
    Route::get('/{blog}', [PostControllerCopy::class, 'show'])->name('show');
    Route::put('/{blog}', [PostControllerCopy::class, 'update'])->name('update');
    Route::delete('/{blog}', [PostControllerCopy::class, 'destroy'])->name('destroy');
    Route::get('/{blog}/edit', [PostControllerCopy::class, 'edit'])->name('edit');
});
*/



// Route::get('/', function () {
//     return view('welcome');
// });
