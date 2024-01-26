<?php

namespace Database\Seeders;

use App\Models\Exam2;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Faker\Factory as Faker;

class Exam2Seeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        $faker = Faker::create();
        Exam2::create([
            Exam2::factory()->count(10)->create(),
        ]);
    }
}
