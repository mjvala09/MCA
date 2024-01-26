<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use Faker\Factory as Faker;
/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Exam2>
 */
class Exam2Factory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition()
    {
        $faker = Faker::create();
        return [
            'name' => $faker->sentence(2),
            'user_id' => rand(1, 10),
            'url' => $faker->sentence(2),
            'content' => $faker->sentence(10),
        ];
    }
}
