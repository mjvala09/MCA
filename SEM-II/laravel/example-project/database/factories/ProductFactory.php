<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Product>
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
        $faker = new \Faker\Factory;
        $title = $this->faker->sentence(1,true);
        return [
            'user_id' => \rand(1,10),
            'title' => $title,
            'subtitle' => fake()->sentence(1,true),
            'content' => fake()->paragraph(5,true),
            // 'image' => 'https://picsum.photos//237/200/300',
            'created_at' => fake()->dateTime(),
            'updated_at' => fake()->dateTime(),
        ];
    }
}
