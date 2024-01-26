<?php

namespace App\Http\Controllers;

use App\Models\Group;
use Illuminate\Http\Request;
use App\Models\Member;
use App\Models\Client;

class Relationships extends Controller
{
    public function oneToOne(){
        $data = Member::with('getGroup')->get();
        return view('relationship.oneToMany', compact('data'));
    }
    public function oneToMany(){
        $data = Group::with('getClient')->get();
        // return $data;
        return view('relationship.oneToMany', compact('data'));
    }

    public function groupToClient(){
        $data = Client::with('getGroup')->get();
        return view('relationship.oneToMany', compact('data'));
    }
}
