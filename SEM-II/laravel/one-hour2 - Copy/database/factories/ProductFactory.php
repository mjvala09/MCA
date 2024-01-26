<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use Faker\Factory as Faker;
/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\[post]>
 */
class ProductFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */

    public function definition(): array
    {
        /*
            Schema::create('product', function (Blueprint $table) {
                $table->id();
                $table->unsignedBigInteger('user_id');
                $table->foreign('user_id')->references('id')->on('users');
                $table->string('title');
                $table->string('subtitle');
                $table->text('content');
                $table->timestamps();
            });
        */
        $faker = new Faker();
        return [
            'user_id' => 1,
            'title' => $faker->name,
            'subtitle' => $faker->sentence,
            'content' => $faker->paragraph,
            'timestamp' => $faker->timeDate,
        ];
    }
}
