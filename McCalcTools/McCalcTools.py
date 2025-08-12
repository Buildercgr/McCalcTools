import math

def calcstuck (items):
    stuck = items // 64
    return stuck

def calcchunk (blocks):
    chunk = blocks // 16
    return chunk 

def realsize (blocks, range):
    meters = (20 * blocks)*range
    return meters

def blocksize (meters, range):
    blocks = (meters / 20) / range
    return blocks

def blockvolume (lenght, width, height):
    volume = lenght * width * height
    return volume

def square_circumference_blocks(diameter):
    blocks = (diameter * 4)- 4
    return blocks
    
def not3Cornered_circumference_blocks(diameter):
    blocks = (diameter * 4) - 12
    return blocks
    
def not6Cornered_circumference_blocks(diameter):
    blocks = (diameter * 4) - 24
    return blocks
       

def area (lenght,height,range):
    area = (lenght * 20) * (height * 20) / range
    return area