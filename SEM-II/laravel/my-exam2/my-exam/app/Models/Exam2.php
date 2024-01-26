<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\SoftDeletes;

class Exam2 extends Model
{
    use HasFactory, SoftDeletes;
    public function getUser()
    {
        return $this->hasOne(\App\Models\User::class, 'id', 'user_id');
    }
}
