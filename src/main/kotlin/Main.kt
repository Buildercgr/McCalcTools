package com.buildercgr.mccalctools

fun calcStuck(items: Int): Int {
    return items / 64
}

fun calcChunk(blocks: Int): Int {
    return blocks / 16
}

fun realSize(blocks: Int, range: Int): Int {
    return (20 * blocks) * range
}

fun blockSize(meters: Double, range: Int): Double {
    return (meters / 20) / range
}

fun blockVolume(length: Int, width: Int, height: Int): Int {
    return length * width * height
}

fun squareCircumferenceBlocks(diameter: Int): Int {
    return (diameter * 4) - 4
}

fun not3CorneredCircumferenceBlocks(diameter: Int): Int {
    return (diameter * 4) - 12
}

fun not6CorneredCircumferenceBlocks(diameter: Int): Int {
    return (diameter * 4) - 24
}

fun area(length: Int, height: Int, range: Int): Int {
    return (length * 20) * (height * 20) / range
}


fun range (biomes: Double): Double{
    var range = biomes/10
    return range
}

