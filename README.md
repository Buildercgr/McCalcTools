# McCalcTools
**McCalcTools** is just what you need to help with your Minecraft calculations and those model builds you've been thinking about. It lets you convert blocks to meters, calculate which chunk each item falls into, how many stacks you need, areas, volumes, and even simulated circumferences. It's a pleasure to plan and design constructions, both in-game and in the real world!

## Installation

To install this package only copy and paste the .jar in your project and import it in your IDE and in your gradle project as a .jar library.
You will need to copy the jar and paste in libs folder and put this content on the build.gradle (in java) or build.gradle.kts (in kotlin)

```gradle
dependencies {
    implementation(files("libs/McCalcTools-0.4.0.jar"))
}
```



## Basic Use
# Kotlin
```kotlin
fun main() {
    println(McCalcTools.calcStuck(150)) // 3
    println(McCalcTools.calcChunk(45)) // 2
    println(McCalcTools.realSize(10, 1.0)) // 100.0
    println(McCalcTools.blockSize(100.0, 1.0)) // 10
    println(McCalcTools.blockVolume(10, 5, 3)) // 150
    println(McCalcTools.area(10, 10, 1.3)) // 16900.0
    println(McCalcTools.range(13)) // 1.3
}

```
# Java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(McCalcTools.INSTANCE.calcStuck(150)); // → 3
        System.out.println(McCalcTools.INSTANCE.calcChunk(45)); // → 2
        System.out.println(McCalcTools.INSTANCE.realSize(10, 1.0)); // → 100.0
        System.out.println(McCalcTools.INSTANCE.blockSize(100.0, 1.0)); // → 10
        System.out.println(McCalcTools.INSTANCE.area(10, 10, 1.3)); // → 16900.0
        System.out.println(McCalcTools.INSTANCE.range(13)); // → 1.3
    }
}
```

## Included Functions

- `calcstuck(items)`: Tells you how many full stacks you need for a given number of items.
- `calcchunk(blocks)`: Gives you the chunk number a block is located in.
- `realsize(blocks, scale)`: Converts blocks to real-world meters, taking into account the scale.
- `blocksize(meters, scale)`: Converts real-world meters to blocks, depending on the scale you use.
- `blockvolume(length, width, height)`: Calculates the total volume in blocks.
- `circumference_blocks(radius)`: Calculates the number of blocks needed to simulate a circumference. It's formed of:
      - `squarecircumference_blocks(radius)`: Calculates the number of blocks needed to simulate a circumference like this: . It's formed of:

- `square_area_real(blocks_side, scale=20)`: Calculates the real-world area of ​​a square in meters.
- `range(biomes)`: Calculates the range of yout minecraft's world, but you need to view your world in a seed finder and count all biomes it has in a square of 1000x1000 blocks.

## License

This project is released under the MIT License. See the `LICENSE` file for full details.

---
Do you have an idea or would you like to contribute? Don't be shy and open an issue or send a pull request!
