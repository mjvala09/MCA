<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\Post;
use Faker\Factory as Faker;
class PostSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $faker = Faker::create();

        $post = new Post();

        $post->title = $faker->title;
        $post->sentence = $faker->sentence;
        $post->paragraph = $faker->paragraph;
        $post->save();
    }
}
