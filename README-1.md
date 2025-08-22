**McCalcTools** is just what you need to help with your Minecraft calculations and those model builds you've been thinking about. It lets you convert blocks to meters, calculate which chunk each item falls into, how many stacks you need, areas, volumes, and even simulated circumferences. It's a pleasure to plan and design constructions, both in-game and in the real world!

## Installation

To install this package, once it's available on PyPI, just do this:

```sh
pip install McCalcTools
```


## Basic Use

```python
import McCalcTools as mcalc

# How many stacks do I need to store 150 items?
print(mcalc.calcstuck(150)) # 2

# In which chunk is block number 45?
print(mcalc.calcchunk(45)) # 2

# Convert 10 blocks to real-size meters (with a scale of 20)
print(mcalc.realsize(10, 1)) # 200

# Calculate how many blocks you need for 100 real-size meters (scale 1)
print(mcalc.blocksize(100, 1)) # 5

# Calculate the volume of a 10x5x3 block structure
print(mcalc.blockvolume(10, 5, 3)) # 150

# Calculate how many blocks you need for a semi_square circumference with a radius of 8
print(square_circumference_blocks(8)) 

# Calculate how many blocks you need for a circumference without 3 blocks on the corner with a radius of 8
print(not3Cornered_circumference_blocks(8)) 

# Calculate how many blocks you need for a circumference without 6 blocks on the corner with a radius of 8
print(not6Cornered_circumference_blocks(8)) 

# Calculate the real area of ​​a square with 10 blocks per side (scale 20)
print(mcalc. square_area_real(10)) # 40000
```

## Included Functions

- `calcstuck(items)`: Tells you how many full stacks you need for a given number of items.
- `calcchunk(blocks)`: Gives you the chunk number a block is located in.
- `realsize(blocks, scale)`: Converts blocks to real-world meters, taking into account the scale.
- `blocksize(meters, scale)`: Converts real-world meters to blocks, depending on the scale you use.
- `blockvolume(length, width, height)`: Calculates the total volume in blocks.
- `circumference_blocks(radius)`: Calculates the number of blocks needed to simulate a circumference.
- `square_area_real(blocks_side, scale=20)`: Calculates the real-world area of ​​a square in meters.

## License

This project is released under the MIT License. See the `LICENSE` file for full details.

---
Do you have an idea or would you like to contribute? Don't be shy and open an issue or send a pull request!