<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class SimpleRouting extends Controller
{
    public function index(){
        return "<h1>hello, I am Vala Manoj...</h1>";    // Direct message shown...
    }
    public function about(){
        return "<h1>hello, about this app...</h>"; // Direct message shown...
    }
    public function passingValue($name){
        return "<h1>hello, I am $name...</h1>";         // message shown with passing value...
    }
    public function defaultValue($name = null){
        return view('simpleflow.defaultvalue', compact('name')); // passing default value...
    }

}
