<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\post;

class HomeController extends Controller
{
    // public function index(){
    //     $data = post::get();
    //     // return $data;
    //     return view('index', compact('data'));
    // }
    // public function show($id){
    //     $data = post::find($id);
    //     // return $data;
    //     return view('users.idData', compact('data'));
    // }
    public function index(){
        return view('register');
    }
    public function store(Request $request){

        $request->validate([
            "name" => "required",
            "username" => "required | email",
            "password" => "required"
        ]);
        return $request;
    }
}
