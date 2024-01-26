<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class RegistrationController extends Controller
{
    public function index(){
        return view('registerForm');
    }
    public function register(Request $request){
        // return $request->all();
        return view('registerForm', compact('request'));
    }
}
