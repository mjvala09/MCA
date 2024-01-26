<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use App\Models\Member;

class Group extends Model
{
    use HasFactory;
    protected $primarykey = 'group_id';
    public function getClient(){
        return $this->hasMany(Client::class,'group_id','group_id');
    }
}
