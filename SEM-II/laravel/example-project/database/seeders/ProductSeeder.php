<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\Product;
use Faker\Factory as Faker;
class ProductSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        /*
            Schema::create('products', function (Blueprint $table) {
                $table->id();
                $table->unsignedBigInteger('user_id');
                $table->foreign('user_id')->references('id')->on('user');
                $table->string('title');
                $table->string('subtitle');
                $table->text('content');
                $table->timestamps();
            });
        */
        $faker = new Faker();
        Product::create([
            'user_id' => \rand(1,10),
            'title' => 'title',
            'subtitle' => 'subtitle',
            'content' => 'content',
        ]);
    }
}
