<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use App\Models\Group;
class Client extends Model
{
    use HasFactory;
    protected $primarykey = 'group_id';
    protected $foreignKey = 'group_id';
    public function getGroup(){
        return $this->belongsTo(Group::class,'group_id','group_id');
    }
}
