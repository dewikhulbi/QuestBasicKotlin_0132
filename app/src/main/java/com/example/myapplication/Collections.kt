package com.example.myapplication



// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println("=== Map ===")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square " to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}